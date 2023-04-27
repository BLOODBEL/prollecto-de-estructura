/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoFabrica;

/**
 *
 * @author danie
 */
    
public class MoveCpu extends Thread {

    private ListaDobleEnlazada<Road> leftPath;
    private ListaDobleEnlazada<Road> rightPath;
    private Taller player;
    private Inicio screen;
    private Bot logicCpu;
    private Turn turn;

    MoveCpu(ListaDobleEnlazada<Road> leftRoad, ListaDobleEnlazada<Road> rightRoad, Taller player, Inicio aThis, Bot logicCpu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

    @Override
    public void run() {
        if (!player.isDestroyed()) {
            move(leftPath);
        }

        if (!player.isDestroyed()) {
            move(rightPath);
        }

        if (!player.isDestroyed()) {
            if (screen.getCharactersLeft() == 0) {
                if (logicCpu.getCharacterTotal() != 0.0 || screen.getPlayerCharactersOnBoard() != 0) {
                } else {
                    screen.turn();
                }

            } else {
                
                try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                
                turn.run();
            }
        }
    }

    public void move(ListaDobleEnlazada<Road> path) {

        for (int i = 0; i < path.getSize(); i++) {

            if (path.get(i).getCharacter() != null && path.get(i).getCharacter().getIsPlayerCharacter() == false) {

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                if (path.isRoot(i)) {

                    path.get(i).setCharacter(null);
                    path.get(i).eraseCharacter();

                    if (path == this.leftPath) {
                        logicCpu.lessLeft();
                    } else {
                        logicCpu.lessRight();
                    }


                    if (player.isDestroyed()) {
                        screen.stopTimer();
                        screen.gameFinish("Ganador: Bot");
                        return;
                    }

                } else if (path.get(i - 1).getCharacter() != null) {


                    if (path.get(i - 1).getCharacter() == null) {
                        screen.lessCharactersOnBoard();
                    }

                    if (path.get(i).getCharacter() != null) {

                        path.get(i - 1).setCharacter(path.get(i).getCharacter());
                        path.get(i - 1).paintCharacter();

                        path.get(i).setCharacter(null);
                        path.get(i).eraseCharacter();

                    } else {

                        if (path == this.leftPath) {
                            logicCpu.lessLeft();
                        } else {
                            logicCpu.lessRight();
                        }

                    }

                } else {

                    path.get(i - 1).setCharacter(path.get(i).getCharacter());
                    path.get(i - 1).paintCharacter();

                    path.get(i).setCharacter(null);
                    path.get(i).eraseCharacter();

                }
            }
        }
    }

    
}
