package JuegoFabrica;

import java.security.SecureRandom;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Bot {
    SecureRandom random1 = new SecureRandom();
    
    private Queue<Character> firstListCharacter = new Queue();
    private DefaultListModel modelo = new DefaultListModel();
    private double characterQueueLeft = 0.0;
    private double characterQueueRight = 0.0;
    private double characterTotal = 0.0;

    public void selectCharacterCpu(ListaDobleEnlazada<Road> pathLeft, ListaDobleEnlazada<Road> pathRight, Queue<Character> characters) {
        Character characterSelect;
        int numCharacter = random1.nextInt(3);
        int numPath;
        double percentLeft = 0.0;
        double percentRight = 0.0;

        if (characterQueueLeft != 0.0) {

            percentLeft = (characterQueueLeft / characterTotal) * 100;

        }
        if (characterQueueRight != 0.0) {

            percentRight = (characterQueueRight / characterTotal) * 100;

        }

        if (firstListCharacter.getSize() == 0) {

            characterSelect = characters.get(numCharacter);

        } else {
            characterSelect = firstListCharacter.remove();

        }

        if (percentRight < 75 && percentLeft < 75) {

            numPath = random1.nextInt(2);

        } else if (percentRight >= 75) {

            numPath = 0;

        } else {

            numPath = 1;

        }

        switch (numPath) {

            case 0:

                if (pathLeft.get(4).getCharacter() == null) {
                    pathLeft.get(4).setCharacter(characterSelect);
                    pathLeft.get(4).paintCharacter();
                } else {
                    
                }

                characterQueueLeft++;
                characterTotal++;

                break;

            case 1:

                pathRight.get(4).setCharacter(characterSelect);
                pathRight.get(4).paintCharacter();

                characterQueueRight++;
                characterTotal++;

                break;

            default:
                throw new AssertionError();
        }

    }
    public void lessLeft() {
        characterQueueLeft--;
        characterTotal--;
    }

    public void lessRight() {
        characterQueueRight--;
        characterTotal--;
    }

    public double getCharacterTotal() {
        return characterTotal;
    }
    

    public void firstThree(Queue<Character> characterList, JList jListCpu) {
        
        String LlantasU = "Llantas únicas";
        String CarroceriaE = "Carrocería especial";
        String MotorC = "Motor de carga";
        for (int i = 0; i < 3; i++) {
            int numCharacter = random1.nextInt(3);
            Character character = characterList.get(numCharacter);
            firstListCharacter.add(character);
        }
      
        

        for (int i = 0; i < firstListCharacter.getSize(); i++) {
            System.out.println(firstListCharacter.get(i).getCharacterType());
        }
        
        
        jListCpu.setModel(modelo);
        
        if(modelo.isEmpty() == true) {
            modelo.addElement("Piezas del bot");
            modelo.addElement(" ");
            for (int i = 0; i < (firstListCharacter.getSize()); i++) {
                if (firstListCharacter.get(i).getCharacterType().toString().equals("LlantasUnicas")){
                    modelo.addElement(LlantasU);
                }else if (firstListCharacter.get(i).getCharacterType().toString().equals("MotorCarga")){
                    modelo.addElement(MotorC);
                }else{
                modelo.addElement(CarroceriaE);
                }
                
            }
                   
        }else
        {
            modelo.removeAllElements();

            for (int i = 0; i < (firstListCharacter.getSize()); i++) {
                if (firstListCharacter.get(i).getCharacterType().equals("LlantasUnicas")){
                    modelo.addElement(LlantasU);
                }else if (firstListCharacter.get(i).getCharacterType().equals("MotorCarga")){
                    modelo.addElement(MotorC);
                }else{
                modelo.addElement(CarroceriaE);
                }
            }
        }
    }

    
    
    
}
