package JuegoFabrica;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.lang.Math;
import javax.swing.DefaultListModel;
import javax.swing.JProgressBar;
import javax.swing.ListModel;


public class Inicio extends javax.swing.JFrame {
    
    private ListaDobleEnlazada<Road> leftRoad = new ListaDobleEnlazada();
    private ListaDobleEnlazada<Road> rightRoad = new ListaDobleEnlazada();
    private Queue<Character> characterList = new Queue();    
    private Bot logicCpu = new Bot();
    private Taller player = new Taller();
    private Taller cpu = new Taller();
    private int partidaNum = 1;
    private int charactersPerRound;
    private int charactersLeft;
    private int playerCharactersOnBoard = 0;
    private ImageIcon image;
    private Icon icon;
    private Timer timer = null;
    private int segundos = 0;
    private int minutos = 0;
    private int horas = 0;
    private String segundosStr = "00";
    private String minutosStr = "00";
    private String horasStr = "00";
    
    private PlaySound playSound = new PlaySound();
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CarFactory");
        setIconImage(getIconImage());
        paintLabelImage(lblBackGroundHud, "src/image/Caricatura.png");
        paintLabelImage(lblBackGround, "src/image/Caricatura.png");
        paintLabelImage(lblBoard, "src/image/Fondo.jpg");
        paintLabelImage(lblNewRound, "src/image/Diseño.png");
        paintLabelImage(lblSelectPie, "src/image/Diseño.png");
        paintLabelImage(lblContadorBackGround, "src/image/Diseño.png");
        paintLabelImage(lblCharactersLeft, "src/image/Diseño.png");
        lblNewRound.setVisible(false);
        lblNewGame.setVisible(false);
        lblSelectPie.setVisible(false);
        lblSelectPiezaText.setVisible(false);
        lblGameFinishText.setVisible(false);
        paintButtonImage(btSeleccioPieza, "src/image/boton.png");
        jListBot.setEnabled(false);
        JListPiezas.setEnabled(false);
        btSeleccioPieza.setEnabled(false);
        btCamino1.setVisible(false);
        btCamino2.setVisible(false);
        JugadorDinero.setValue(10);
        BotDinero.setValue(10);
        
        Character MotorCarga = new Character(CharacterType.MotorCarga);
        characterList.add(MotorCarga);
        Character CarroceriaEsp = new Character(CharacterType.CarroceriaEsp);
        characterList.add(CarroceriaEsp);
        Character LlantasUnicas = new Character(CharacterType.LlantasUnicas);
        characterList.add(LlantasUnicas);
        
        Road lRoad1 = new Road();
        lRoad1.setLabel(leftRoad1);
        leftRoad.add(lRoad1);
        
        Road lRoad2 = new Road();
        lRoad2.setLabel(leftRoad2);
        leftRoad.add(lRoad2);
        
        Road lRoad3 = new Road();
        lRoad3.setLabel(leftRoad3);
        leftRoad.add(lRoad3);
        
        Road lRoad4 = new Road();
        lRoad4.setLabel(leftRoad4);
        leftRoad.add(lRoad4);
        
        Road lRoad5 = new Road();
        lRoad5.setLabel(leftRoad5);
        leftRoad.add(lRoad5);
        
        Road rRoad1 = new Road();
        rRoad1.setLabel(rightRoad1);
        rightRoad.add(rRoad1);
        
        Road rRoad2 = new Road();
        rRoad2.setLabel(rightRoad2);
        rightRoad.add(rRoad2);
        
        Road rRoad3 = new Road();
        rRoad3.setLabel(rightRoad3);
        rightRoad.add(rRoad3);
        
        Road rRoad4 = new Road();
        rRoad4.setLabel(rightRoad4);
        rightRoad.add(rRoad4);
        
        Road rRoad5 = new Road();
        rRoad5.setLabel(rightRoad5);
        rightRoad.add(rRoad5);
        
        Partida round = new Partida(this);
        round.start();
        
        playSound.playTheme("src/Sounds/Theme.wav");

        startTimer();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("image/GameIcon.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCharactersLeftText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCharactersLeft = new javax.swing.JLabel();
        lblGameFinishText = new javax.swing.JLabel();
        lblSelectPiezaText = new javax.swing.JLabel();
        lblSelectPie = new javax.swing.JLabel();
        lblNewGame = new javax.swing.JLabel();
        lblNewRound = new javax.swing.JLabel();
        contadorLabel = new javax.swing.JLabel();
        lblContadorBackGround = new javax.swing.JLabel();
        BotDinero = new javax.swing.JProgressBar();
        JugadorDinero = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        leftRoad5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBot = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListPiezas = new javax.swing.JList<>();
        btSeleccioPieza = new javax.swing.JButton();
        btCamino1 = new javax.swing.JButton();
        btCamino2 = new javax.swing.JButton();
        lblBackGroundHud = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        leftRoad1 = new javax.swing.JLabel();
        leftRoad2 = new javax.swing.JLabel();
        leftRoad3 = new javax.swing.JLabel();
        leftRoad4 = new javax.swing.JLabel();
        rightRoad5 = new javax.swing.JLabel();
        rightRoad4 = new javax.swing.JLabel();
        rightRoad3 = new javax.swing.JLabel();
        rightRoad2 = new javax.swing.JLabel();
        rightRoad1 = new javax.swing.JLabel();
        lblBoard = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        jLabel4.setText("jLabel4");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCharactersLeftText.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        lblCharactersLeftText.setForeground(new java.awt.Color(255, 51, 51));
        lblCharactersLeftText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCharactersLeftText.setText("0");
        getContentPane().add(lblCharactersLeftText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 80, 50));

        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 7)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Piezas a Colocar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 100, 40));
        getContentPane().add(lblCharactersLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 120, 80));

        lblGameFinishText.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblGameFinishText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameFinishText.setText("Ganador: Gerente (Jugador)");
        getContentPane().add(lblGameFinishText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 320, 40));

        lblSelectPiezaText.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        lblSelectPiezaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectPiezaText.setText("¡ Crea!");
        getContentPane().add(lblSelectPiezaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 340, 80));

        lblSelectPie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSelectPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 330, 70));

        lblNewGame.setFont(new java.awt.Font("Engravers MT", 1, 48)); // NOI18N
        lblNewGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 340, 80));
        getContentPane().add(lblNewRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 450, 330));

        contadorLabel.setBackground(new java.awt.Color(255, 255, 255));
        contadorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorLabel.setText("0");
        contadorLabel.setToolTipText("");
        contadorLabel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                contadorLabelComponentAdded(evt);
            }
        });
        contadorLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                contadorLabelAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(contadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 40));
        getContentPane().add(lblContadorBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 40));

        BotDinero.setBackground(java.awt.Color.gray);
        BotDinero.setForeground(new java.awt.Color(51, 255, 51));
        BotDinero.setMaximum(10);
        BotDinero.setToolTipText("");
        getContentPane().add(BotDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 150, 20));

        JugadorDinero.setBackground(java.awt.Color.gray);
        JugadorDinero.setForeground(java.awt.Color.blue);
        JugadorDinero.setMaximum(10);
        getContentPane().add(JugadorDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 150, 20));

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("Dinero del bot");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));
        getContentPane().add(leftRoad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 70));

        jScrollPane1.setViewportView(jListBot);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 140, 110));

        JListPiezas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Motor de carga", "Carrocería especial", "Llantas únicas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListPiezas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListPiezasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(JListPiezas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 140, 70));

        btSeleccioPieza.setText("Seleccionar pieza");
        btSeleccioPieza.setBorderPainted(false);
        btSeleccioPieza.setContentAreaFilled(false);
        btSeleccioPieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSeleccioPieza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSeleccioPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccioPiezaActionPerformed(evt);
            }
        });
        getContentPane().add(btSeleccioPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, 30));

        btCamino1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        btCamino1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCamino1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCamino1MouseClicked(evt);
            }
        });
        getContentPane().add(btCamino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 50, 50));

        btCamino2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow.png"))); // NOI18N
        btCamino2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCamino2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCamino2MouseClicked(evt);
            }
        });
        getContentPane().add(btCamino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 50, 50));

        lblBackGroundHud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Caricatura.PNG"))); // NOI18N
        lblBackGroundHud.setText("jLabel4");
        getContentPane().add(lblBackGroundHud, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 140, 590));

        jLabel1.setText("Timer:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        leftRoad1.setBackground(new java.awt.Color(255, 255, 255));
        leftRoad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(leftRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 70, 70));

        leftRoad2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, 70));

        leftRoad3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 70));

        leftRoad4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 70, 70));

        rightRoad5.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 70, 70));

        rightRoad4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 70, 70));

        rightRoad3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 70, 70));

        rightRoad2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 70, 70));

        rightRoad1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rightRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 70, 70));

        lblBoard.setBackground(new java.awt.Color(255, 255, 255));
        lblBoard.setText("Background Image");
        getContentPane().add(lblBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 590));

        lblBackGround.setText("jLabel6");
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));

        jLabel8.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 0));
        jLabel8.setText("Dinero del jugador");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSeleccioPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccioPiezaActionPerformed
        btCamino1.setOpaque(false);
        btCamino1.setContentAreaFilled(false);
        btCamino1.setBorderPainted(false);
        btCamino2.setOpaque(false);
        btCamino2.setContentAreaFilled(false);
        btCamino2.setBorderPainted(false);
        paintButtonImage(btCamino1, "src/image/simbolo.png");
        paintButtonImage(btCamino2, "src/image/simbolo.png");
        btCamino1.setVisible(true);
        btCamino2.setVisible(true);
    }//GEN-LAST:event_btSeleccioPiezaActionPerformed

    private void btCamino1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCamino1MouseClicked
        if (JListPiezas.getSelectedValue().equals("Llantas únicas")) {
            
            paintButtonImage(btCamino1, null);
            Character character = new Character(CharacterType.LlantasUnicas);
            character.setIsPlayerCharacter(true);
            
            
            
        } else if (JListPiezas.getSelectedValue().equals("Motor de carga")) {
            
            paintButtonImage(btCamino1, null);
            Character character = new Character(CharacterType.MotorCarga);
            character.setIsPlayerCharacter(true);
            
            if (leftRoad.get(0).getCharacter() != null) {
                
            } else {
                leftRoad.get(0).setCharacter(character);
                leftRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else {
            
            paintButtonImage(btCamino1, null);
            Character character = new Character(CharacterType.CarroceriaEsp);
            character.setIsPlayerCharacter(true);
            
            if (leftRoad.get(0).getCharacter() != null) {
                
            } else {
                leftRoad.get(0).setCharacter(character);
                leftRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        }
        btCamino2.setVisible(false);
        btCamino1.setVisible(false);
        JListPiezas.clearSelection();
        JListPiezas.setEnabled(false);
        btSeleccioPieza.setEnabled(false);
        
        if (charactersLeft - 1 > 0) {
            logicCpu.selectCharacterCpu(leftRoad, rightRoad, characterList);
        }
        
        charactersLeft--;
        
        lblCharactersLeftText.setText(charactersLeft + "");        
        
        moveCharacters();
    }//GEN-LAST:event_btCamino1MouseClicked
    

    private void JListPiezasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListPiezasValueChanged
        btSeleccioPieza.setEnabled(true);
    }//GEN-LAST:event_JListPiezasValueChanged

    private void btCamino2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCamino2MouseClicked
        if (JListPiezas.getSelectedValue().equals("Llantas únicas")) {
            
            paintButtonImage(btCamino2, null);
            Character character = new Character(CharacterType.LlantasUnicas);
            character.setIsPlayerCharacter(true);
            
            if (rightRoad.get(0).getCharacter() != null) {
                
            } else {
                rightRoad.get(0).setCharacter(character);
                rightRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else if (JListPiezas.getSelectedValue().equals("Motor de carga")) {
            paintButtonImage(btCamino2, null);
            Character character = new Character(CharacterType.MotorCarga);
            character.setIsPlayerCharacter(true);
            
            if (rightRoad.get(0).getCharacter() != null) {
               
            } else {
                rightRoad.get(0).setCharacter(character);
                rightRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        } else {
            
            paintButtonImage(btCamino2, null);
            Character character = new Character(CharacterType.CarroceriaEsp);
            character.setIsPlayerCharacter(true);
            
            if (rightRoad.get(0).getCharacter() != null) {
                
            } else {
                rightRoad.get(0).setCharacter(character);
                rightRoad.get(0).paintCharacter();
                playerCharactersOnBoard++;
            }
            
        }
        btCamino1.setVisible(false);
        btCamino2.setVisible(false);
        JListPiezas.clearSelection();
        JListPiezas.setEnabled(false);
        btSeleccioPieza.setEnabled(false);
        
        if (charactersLeft - 1 > 0) {
            logicCpu.selectCharacterCpu(leftRoad, rightRoad, characterList);
        }
        
        charactersLeft--;
        
        lblCharactersLeftText.setText(charactersLeft + "");
        
        moveCharacters();
    }//GEN-LAST:event_btCamino2MouseClicked

    private void contadorLabelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_contadorLabelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_contadorLabelComponentAdded

    private void contadorLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_contadorLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_contadorLabelAncestorAdded
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    public void paintLabelImage(JLabel label, String ruta) {
        image = new ImageIcon(ruta);
        icon = new ImageIcon(image.getImage().getScaledInstance(
                label.getWidth(),
                label.getHeight(),
                Image.SCALE_DEFAULT));
        label.setIcon(icon);
        this.repaint();
    }

    public void paintButtonImage(JButton button, String ruta) {
        image = new ImageIcon(ruta);
        icon = new ImageIcon(image.getImage().getScaledInstance(
                button.getWidth(),
                button.getHeight(),
                Image.SCALE_DEFAULT));
        button.setIcon(icon);
        this.repaint();
    }

    public void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (segundos < 59) {
                    segundos++;
                    
                    if (segundos >= 10) {
                        segundosStr = Integer.toString(segundos);
                    } else {
                        segundosStr = "0" + Integer.toString(segundos);
                    }
                } else {
                    segundos = 0;
                    minutos++;
                    if (minutos >= 10) {
                        minutosStr = Integer.toString(minutos);
                        
                        if (minutos == 60) {
                            horas++;
                            if (horas >= 10) {
                                horasStr = Integer.toString(horas);
                            } else {
                                horasStr = "0" + Integer.toString(horas);
                                
                            }
                            minutos = 0;
                        }
                        
                    } else {
                        minutosStr = "0" + Integer.toString(minutos);
                    }
                }
                contadorLabel.setText(horasStr + ':' + minutosStr + ':' + segundosStr);
                
            }
        });
        timer.setInitialDelay(0);
        timer.start();
    }

    
    public void updateHitPointsBar(Taller barra, JProgressBar bar) {
        int life = (int) Math.ceil(barra.getLife());
        bar.setValue(life);
    }
    
    public void turn() {
        if (charactersLeft == 0) {
            Partida round = new Partida(this);
            round.start();
            return;
        }
        
        JListPiezas.setEnabled(true);
    }
    
    public void moveCharacters() {
        MoveCpu moveCpu = new MoveCpu(leftRoad, rightRoad, player, this, JugadorDinero, logicCpu);
        MovePlayer movePlayer = new MovePlayer(leftRoad, rightRoad, cpu, this, BotDinero, logicCpu, moveCpu);
        movePlayer.start();
    }
    
    public void showNewRound() {
        charactersPerRound = partidaNum + 4;
        charactersLeft = charactersPerRound;
        
        lblCharactersLeftText.setText(charactersLeft + "");
        
        logicCpu.firstThree(characterList, jListBot);
        
        lblNewGame.setText("Juego: " + partidaNum);
        
        lblNewRound.setVisible(true);
        lblNewGame.setVisible(true);
        
        partidaNum++;
    }
    
    public void dontShowNewRound() {
        lblNewRound.setVisible(false);
        lblNewGame.setVisible(false);
        
    }

    public void showSelectTroops() {
        lblSelectPie.setVisible(true);
        lblSelectPiezaText.setVisible(true);
    }

    public void dontShowSelectTroops() {
        
        lblSelectPie.setVisible(false);
        lblSelectPiezaText.setVisible(false);
    }

    
    public void stopTimer() {
        if (timer.isRunning()) {
            timer.stop();
        } else {
            timer.start();
        }
    }
    
    public int getCharactersLeft() {
        return charactersLeft;
    }
    
    public int getPlayerCharactersOnBoard() {
        return playerCharactersOnBoard;
    }
    
    public void lessCharactersOnBoard() {
        playerCharactersOnBoard--;
    }
    
    public void gameFinish(String finisText) {
        lblGameFinishText.setText(finisText);
        
        lblNewRound.setVisible(true);
        lblGameFinishText.setVisible(true);
    }
    
    public void updateLblCharactersLeft() {
        lblCharactersLeftText.setText(charactersLeft + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BotDinero;
    private javax.swing.JList<String> JListPiezas;
    private javax.swing.JProgressBar JugadorDinero;
    private javax.swing.JButton btCamino1;
    private javax.swing.JButton btCamino2;
    private javax.swing.JButton btSeleccioPieza;
    private javax.swing.JLabel contadorLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListBot;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblBackGroundHud;
    private javax.swing.JLabel lblBoard;
    private javax.swing.JLabel lblCharactersLeft;
    private javax.swing.JLabel lblCharactersLeftText;
    private javax.swing.JLabel lblContadorBackGround;
    private javax.swing.JLabel lblGameFinishText;
    private javax.swing.JLabel lblNewGame;
    private javax.swing.JLabel lblNewRound;
    private javax.swing.JLabel lblSelectPie;
    private javax.swing.JLabel lblSelectPiezaText;
    private javax.swing.JLabel leftRoad1;
    private javax.swing.JLabel leftRoad2;
    private javax.swing.JLabel leftRoad3;
    private javax.swing.JLabel leftRoad4;
    private javax.swing.JLabel leftRoad5;
    private javax.swing.JLabel rightRoad1;
    private javax.swing.JLabel rightRoad2;
    private javax.swing.JLabel rightRoad3;
    private javax.swing.JLabel rightRoad4;
    private javax.swing.JLabel rightRoad5;
    // End of variables declaration//GEN-END:variables
}
