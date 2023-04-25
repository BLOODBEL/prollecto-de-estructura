package JuegoFabrica;

public class Turn extends Thread {

    private Inicio principalScreen;

    @Override
    public void run() {
        showNewTurn();
    }

    public void showNewTurn() {
        principalScreen.showSelectTroops();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        
        principalScreen.dontShowSelectTroops();
        
        principalScreen.turn();
    }

    public Turn(Inicio principalScreen) {
        this.principalScreen = principalScreen;
    }
}
