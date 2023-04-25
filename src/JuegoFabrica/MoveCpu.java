package JuegoFabrica;

import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class MoveCpu extends Thread {

    private ListaDobleEnlazada<Road> leftPath;
    private ListaDobleEnlazada<Road> rightPath;
    private Taller player;
    private Inicio screen;
    private JProgressBar playerHitPoints;
    private Bot logicCpu;
    private Turn turn;

    MoveCpu(ListaDobleEnlazada<Road> leftRoad, ListaDobleEnlazada<Road> rightRoad, Taller player, Inicio aThis, JTextField JugadorDinero, Bot logicCpu) {
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
                    screen.moveCharacters();
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

                    screen.updateHitPointsBar(player, playerHitPoints);

                    if (player.isDestroyed()) {
                        screen.stopTimer();
                        screen.gameFinish("Ganador: Bot");
                        PlaySound playSound = new PlaySound();
                        playSound.playSound("src/Sounds/GameOver.wav");
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

    public MoveCpu(ListaDobleEnlazada<Road> leftPath, ListaDobleEnlazada<Road> rightPath, Taller player, Inicio screen, JProgressBar playerHitPoints, Bot logicCpu) {
        this.leftPath = leftPath;
        this.rightPath = rightPath;
        this.player = player;
        this.screen = screen;
        this.playerHitPoints = playerHitPoints;
        this.logicCpu = logicCpu;
        this.turn = new Turn(screen);
    }
}
