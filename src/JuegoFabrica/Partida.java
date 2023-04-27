package JuegoFabrica;

import javax.swing.JFrame;

public class Partida extends Thread {
    
    private Inicio principalScreen; 
    

    @Override
    public void run() {
        showNewRound();
    }

    public void showNewRound() {
        
        principalScreen.showNewRound();
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        
        principalScreen.dontShowNewRound();    
        
    }
    
    public Partida(Inicio principalScreen){
        this.principalScreen = principalScreen;
    }
}
