/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    }

    public Turn(Inicio principalScreen) {
        this.principalScreen = principalScreen;
    }
}