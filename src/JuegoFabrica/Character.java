package JuegoFabrica;

import javax.swing.ImageIcon;

public class Character {

    private CharacterType characterType;
    private boolean isPlayerCharacter = false;
    private ImageIcon image;

    private String killSoundURL;

    private PlaySound playSound = new PlaySound();

    public Character(CharacterType characterType) {
        this.characterType = characterType;

        
        switch (characterType) {
            case LlantasUnicas:
                this.image = new ImageIcon("src/image/LlantasUnicasDeTrabajo.png");
                this.killSoundURL = "src/Sounds/EfectoSonido.wav";
                break;
            case CarroceriaEsp:
                this.image = new ImageIcon("src/image/carroceriaEspecial.png");
                this.killSoundURL = "src/Sounds/EfectoSonido.wav";
                break;
            case MotorCarga:
                this.image = new ImageIcon("src/image/MotorDeCarga.png");
                this.killSoundURL = "src/Sounds/EfectoSonido.wav";
                break;
            default:
                break;
        }
    }

    
    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;

        
        switch (characterType) {
            case LlantasUnicas:
                this.image = new ImageIcon("src/image/LlantasUnicasDeTrabajo.png");
                break;
            case CarroceriaEsp:
                this.image = new ImageIcon("src/image/carroceriaEspecial.png");
                break;
            case MotorCarga:
                this.image = new ImageIcon("src/image/motorDeCarga.png");
                break;
            default:
                break;
        }
    }

    public ImageIcon getImage() {
        return image;
    }

    public boolean getIsPlayerCharacter() {
        return isPlayerCharacter;
    }

    public void setIsPlayerCharacter(boolean isPlayerCharacter) {
        this.isPlayerCharacter = isPlayerCharacter;
        switch (characterType) {
            case LlantasUnicas:
                this.image = new ImageIcon("src/image/LlantasUnicasDeTrabajo.png");
                break;
            case CarroceriaEsp:
                this.image = new ImageIcon("src/image/carroceriaEspecial.png");
                break;
            case MotorCarga:
                this.image = new ImageIcon("src/image/motorDeCarga.png");
                break;
            default:
                break;
        }
    }
}
