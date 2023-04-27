package JuegoFabrica;

import javax.swing.*;
import java.awt.*;
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



public class Inicio extends javax.swing.JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private JList<String> jListPiezas;
    private JButton btSeleccionarPieza;
    private ListaCircular listaPiezasSeleccionadas;
    private ListaDobleEnlazada<Road> leftRoad = new ListaDobleEnlazada();
    private ListaDobleEnlazada<Road> rightRoad = new ListaDobleEnlazada();
    private Queue<Character> characterList = new Queue();    
    private Bot logicCpu = new Bot();

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
    private int dinero = 15000;
    private String segundosStr = "00";
    private String minutosStr = "00";
    private String horasStr = "00";
    
    
    
    
    

    public JList<String> getjListPiezas() {
        return jListPiezas;
    }

    public void setjListPiezas(JList<String> jListPiezas) {
        this.jListPiezas = jListPiezas;
    }

    public JButton getBtSeleccionarPieza() {
        return btSeleccionarPieza;
    }

    public void setBtSeleccionarPieza(JButton btSeleccionarPieza) {
        this.btSeleccionarPieza = btSeleccionarPieza;
    }

    public ListaCircular getListaPiezasSeleccionadas() {
        return listaPiezasSeleccionadas;
    }

    public void setListaPiezasSeleccionadas(ListaCircular listaPiezasSeleccionadas) {
        this.listaPiezasSeleccionadas = listaPiezasSeleccionadas;
    }

    public ListaDobleEnlazada<Road> getLeftRoad() {
        return leftRoad;
    }

    public void setLeftRoad(ListaDobleEnlazada<Road> leftRoad) {
        this.leftRoad = leftRoad;
    }

    public ListaDobleEnlazada<Road> getRightRoad() {
        return rightRoad;
    }

    public void setRightRoad(ListaDobleEnlazada<Road> rightRoad) {
        this.rightRoad = rightRoad;
    }

    public JuegoFabrica.Queue<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(JuegoFabrica.Queue<Character> characterList) {
        this.characterList = characterList;
    }

    public Bot getLogicCpu() {
        return logicCpu;
    }

    public void setLogicCpu(Bot logicCpu) {
        this.logicCpu = logicCpu;
    }

    

    public int getPartidaNum() {
        return partidaNum;
    }

    public void setPartidaNum(int partidaNum) {
        this.partidaNum = partidaNum;
    }

    public int getCharactersPerRound() {
        return charactersPerRound;
    }

    public void setCharactersPerRound(int charactersPerRound) {
        this.charactersPerRound = charactersPerRound;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getSegundosStr() {
        return segundosStr;
    }

    public void setSegundosStr(String segundosStr) {
        this.segundosStr = segundosStr;
    }

    public String getMinutosStr() {
        return minutosStr;
    }

    public void setMinutosStr(String minutosStr) {
        this.minutosStr = minutosStr;
    }

    public String getHorasStr() {
        return horasStr;
    }

    public void setHorasStr(String horasStr) {
        this.horasStr = horasStr;
    }

    

    public JList<String> getJListPiezas() {
        return JListPiezas;
    }

    public void setJListPiezas(JList<String> JListPiezas) {
        this.JListPiezas = JListPiezas;
    }

    public JTextField getJugadorDinero() {
        return JugadorDinero;
    }

    public void setJugadorDinero(JTextField JugadorDinero) {
        this.JugadorDinero = JugadorDinero;
    }

    public JButton getBtSeleccioPieza() {
        return btSeleccioPieza;
    }

    public void setBtSeleccioPieza(JButton btSeleccioPieza) {
        this.btSeleccioPieza = btSeleccioPieza;
    }

    public JLabel getContadorLabel() {
        return contadorLabel;
    }

    public void setContadorLabel(JLabel contadorLabel) {
        this.contadorLabel = contadorLabel;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButtonBasurero() {
        return jButtonBasurero;
    }

    public void setjButtonBasurero(JButton jButtonBasurero) {
        this.jButtonBasurero = jButtonBasurero;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }



    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JLabel getLblBackGround() {
        return lblBackGround;
    }

    public void setLblBackGround(JLabel lblBackGround) {
        this.lblBackGround = lblBackGround;
    }

    public JLabel getLblCharactersLeft() {
        return lblCharactersLeft;
    }

    public void setLblCharactersLeft(JLabel lblCharactersLeft) {
        this.lblCharactersLeft = lblCharactersLeft;
    }





    public JLabel getLblContadorBackGround() {
        return lblContadorBackGround;
    }

    public void setLblContadorBackGround(JLabel lblContadorBackGround) {
        this.lblContadorBackGround = lblContadorBackGround;
    }

    public JLabel getLblGameFinishText() {
        return lblGameFinishText;
    }

    public void setLblGameFinishText(JLabel lblGameFinishText) {
        this.lblGameFinishText = lblGameFinishText;
    }

    public JLabel getLblNewGame() {
        return lblNewGame;
    }

    public void setLblNewGame(JLabel lblNewGame) {
        this.lblNewGame = lblNewGame;
    }

    public JLabel getLblNewRound() {
        return lblNewRound;
    }

    public void setLblNewRound(JLabel lblNewRound) {
        this.lblNewRound = lblNewRound;
    }

    public JLabel getLblSelectPie() {
        return lblSelectPie;
    }

    public void setLblSelectPie(JLabel lblSelectPie) {
        this.lblSelectPie = lblSelectPie;
    }

    public JLabel getLblSelectPiezaText() {
        return lblSelectPiezaText;
    }

    public void setLblSelectPiezaText(JLabel lblSelectPiezaText) {
        this.lblSelectPiezaText = lblSelectPiezaText;
    }

    public JLabel getLeftRoad1() {
        return leftRoad1;
    }
    
    public void setLeftRoad1(JLabel leftRoad1) {
        this.leftRoad1 = leftRoad1;
    }

    public JLabel getLeftRoad2() {
        return leftRoad2;
    }
   
    public void setLeftRoad2(JLabel leftRoad2) {
        this.leftRoad2 = leftRoad2;
    }

    public JLabel getLeftRoad3() {
        return leftRoad3;
    }

    public void setLeftRoad3(JLabel leftRoad3) {
        this.leftRoad3 = leftRoad3;
    }

   

    public JLabel getLeftRoad5() {
        return leftRoad5;
    }

    public void setLeftRoad5(JLabel leftRoad5) {
        this.leftRoad5 = leftRoad5;
    }

    

    public JTextArea getTxtAutosConstruidos() {
        return txtAutosConstruidos;
    }

    public void setTxtAutosConstruidos(JTextArea txtAutosConstruidos) {
        this.txtAutosConstruidos = txtAutosConstruidos;
    }
    
    
    
    
    public Inicio() {
        
        
        super("Seleccion de Piezas para Autos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inicializacion de componentes
        String[] piezas = {"Motor especial deportivo", "Motor de carga", "Carroceria", "Carroceria especial", "Llantas unicas de trabajo"};
        jListPiezas = new JList<>(piezas);
        JScrollPane scrollPane = new JScrollPane(jListPiezas);
        add(scrollPane, BorderLayout.CENTER);

        btSeleccioPieza = new JButton("Seleccionar Pieza");
        btSeleccioPieza.addActionListener(this);
        add(btSeleccioPieza, BorderLayout.SOUTH);

        txtAutosConstruidos = new JTextArea(10, 30);
        txtAutosConstruidos.setEditable(false);
        JScrollPane scrollPane2 
                = new JScrollPane(txtAutosConstruidos);
        add(scrollPane2, BorderLayout.EAST);

        // Creacion de lista circular para piezas seleccionadas
        listaPiezasSeleccionadas = new ListaCircular();

        

        
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CarFactory");
        setIconImage(getIconImage());
        
        lblNewRound.setVisible(false);
        lblNewGame.setVisible(false);
        lblSelectPie.setVisible(false);
        lblSelectPiezaText.setVisible(false);
        lblGameFinishText.setVisible(false);
        paintButtonImage(btSeleccioPieza, "src/image/boton.png");
        JListPiezas.setEnabled(true);
        btSeleccioPieza.setEnabled(false);
        dinero=15000;
        String dineroString;
        dineroString= Integer.toString(dinero);

        JugadorDinero.setText(dineroString);
        
        Character MotorCarga = new Character(CharacterType.MotorCarga);
        characterList.add(MotorCarga);
        Character CarroceriaEsp = new Character(CharacterType.CarroceriaEsp);
        characterList.add(CarroceriaEsp);
        Character LlantasUnicas = new Character(CharacterType.LlantasUnicas);
        characterList.add(LlantasUnicas);
        
        
        
        Partida round = new Partida(this);
        round.start();
        

        startTimer();
        pack();
    }
    
    
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btSeleccionarPieza) {
            // Agregar pieza seleccionada a lista circular
            String piezaSeleccionada = jListPiezas.getSelectedValue();
            if (piezaSeleccionada != null) {
                listaPiezasSeleccionadas.insertarAlFinal(piezaSeleccionada);
            }

            // Buscar auto correspondiente a las piezas seleccionadas
            String autoConstruido = buscarAuto(listaPiezasSeleccionadas);
            txtAutosConstruidos.setText(autoConstruido);
        }
  
    }
    
    public void vaciarListaPiezasSeleccionadas() {
        this.listaPiezasSeleccionadas = new ListaCircular();
    }
    
    

    private String buscarAuto(ListaCircular listaPiezas) {
        
        
       // Buscar si las piezas seleccionadas corresponden a algun tipo de auto
        if (listaPiezas.buscar("Motor especial deportivo") && listaPiezas.buscar("Carroceria")) {
            actualizarPresupuestoAutoConstruido("Superauto deportivo");
            return "Superauto deportivo";
        } else if (listaPiezas.buscar("Motor de carga") && listaPiezas.buscar("Carroceria")) {
            actualizarPresupuestoAutoConstruido("Auto de alta gama");
            return "Auto de alta gama";
        } else if (listaPiezas.buscar("Motor de carga") && listaPiezas.buscar("Carroceria especial") && listaPiezas.buscar("Llantas unicas de trabajo")) {
            actualizarPresupuestoAutoConstruido("Maquinaria de ultima tecnologia");
            return "Maquinaria de ultima tecnologia";
        } else {
            return "No se ha construido ningun auto todavia";
        }
    }
    
    public void actualizarPresupuestoAutoConstruido(String tipoAuto) {
        int ganancia = 0;

        switch (tipoAuto) {
            case "Superauto deportivo":
                ganancia = 15000;
                break;
            case "Auto de alta gama":
                ganancia = 10000;
                break;
            case "Maquinaria de ultima tecnologia":
                ganancia = 18000;
                break;
            default:
                break;
        }
        
        

        int presupuestoActual = Integer.parseInt(JugadorDinero.getText());
        int nuevoPresupuesto = presupuestoActual + ganancia;
        JugadorDinero.setText(Integer.toString(nuevoPresupuesto));
        vaciarListaPiezasSeleccionadas();
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
        lblCharactersLeft = new javax.swing.JLabel();
        lblGameFinishText = new javax.swing.JLabel();
        lblSelectPiezaText = new javax.swing.JLabel();
        lblSelectPie = new javax.swing.JLabel();
        lblNewGame = new javax.swing.JLabel();
        lblNewRound = new javax.swing.JLabel();
        contadorLabel = new javax.swing.JLabel();
        lblContadorBackGround = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        leftRoad5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JListPiezas = new javax.swing.JList<>();
        btSeleccioPieza = new javax.swing.JButton();
        leftRoad1 = new javax.swing.JLabel();
        leftRoad2 = new javax.swing.JLabel();
        leftRoad3 = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonBasurero = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAutosConstruidos = new javax.swing.JTextArea();
        JugadorDinero = new javax.swing.JTextField();
        jButtonAumento1 = new javax.swing.JButton();
        jButtonAumento2 = new javax.swing.JButton();
        jButtonAumento3 = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jLabel4.setText("jLabel4");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblCharactersLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 120, 80));

        lblGameFinishText.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblGameFinishText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameFinishText.setText("Ganador: Gerente (Jugador)");
        getContentPane().add(lblGameFinishText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 320, 40));

        lblSelectPiezaText.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 36)); // NOI18N
        lblSelectPiezaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectPiezaText.setText("¡Crea!");
        getContentPane().add(lblSelectPiezaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 340, 80));

        lblSelectPie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSelectPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 330, 70));

        lblNewGame.setFont(new java.awt.Font("Engravers MT", 1, 48)); // NOI18N
        lblNewGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 340, 80));
        getContentPane().add(lblNewRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 450, 330));

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
        getContentPane().add(contadorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 40));
        getContentPane().add(lblContadorBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 40));

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));
        getContentPane().add(leftRoad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 70, 70));

        JListPiezas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Motor especial deportivo", "Motor de carga", "Carroceria", "Carroceria especial", "Llantas unicas de trabajo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListPiezas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JListPiezasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(JListPiezas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, 130));

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
        getContentPane().add(btSeleccioPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, 30));

        leftRoad1.setBackground(new java.awt.Color(255, 255, 255));
        leftRoad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(leftRoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 70, 70));

        leftRoad2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, 70));

        leftRoad3.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(leftRoad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 70));

        lblBackGround.setBackground(new java.awt.Color(0, 255, 255));
        lblBackGround.setForeground(new java.awt.Color(0, 255, 255));
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 740, 440));

        jLabel8.setFont(new java.awt.Font("Raleway", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Dinero del jugador");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jButtonBasurero.setText("Basurero");
        jButtonBasurero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBasureroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBasurero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        txtAutosConstruidos.setEditable(false);
        txtAutosConstruidos.setColumns(20);
        txtAutosConstruidos.setRows(5);
        jScrollPane3.setViewportView(txtAutosConstruidos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 440, 190));

        JugadorDinero.setEditable(false);
        JugadorDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorDineroActionPerformed(evt);
            }
        });
        getContentPane().add(JugadorDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 130, -1));

        jButtonAumento1.setText("Agregar espacio - 70000");
        jButtonAumento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumento1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jButtonAumento2.setText("Agregar espacio - 80000");
        jButtonAumento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumento2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jButtonAumento3.setText("Agregar espacio - 90000");
        jButtonAumento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAumento3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAumento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSeleccioPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccioPiezaActionPerformed
        if (evt.getSource() == btSeleccioPieza) {
            // Agregar pieza seleccionada a lista circular
            String piezaSeleccionada = JListPiezas.getSelectedValue();
            if (piezaSeleccionada != null) {
                listaPiezasSeleccionadas.insertarAlFinal(piezaSeleccionada);
            }

            // Buscar auto correspondiente a las piezas seleccionadas
            String autoConstruido = buscarAuto(listaPiezasSeleccionadas);
            txtAutosConstruidos.setText(autoConstruido);
        }
    }//GEN-LAST:event_btSeleccioPiezaActionPerformed
    

    private void JListPiezasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JListPiezasValueChanged

        btSeleccioPieza.setEnabled(true);
    }//GEN-LAST:event_JListPiezasValueChanged

    private void contadorLabelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_contadorLabelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_contadorLabelComponentAdded

    private void contadorLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_contadorLabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_contadorLabelAncestorAdded

    private void JugadorDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorDineroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugadorDineroActionPerformed

    private void jButtonBasureroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBasureroActionPerformed
        // TODO add your handling code here:
        vaciarListaPiezasSeleccionadas();
    }//GEN-LAST:event_jButtonBasureroActionPerformed

    private void jButtonAumento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumento1ActionPerformed
        // TODO add your handling code here:
        int convertir;
        
        convertir = Integer.parseInt(JugadorDinero.getText());
        
        if (convertir>=70000) {
            int nuevoPresupuesto = convertir - 70000;
            JugadorDinero.setText(Integer.toString(nuevoPresupuesto));
        }else{
            txtAutosConstruidos.setText("No se pudo comprar un nuevo espacio. Dinero insuficiente.");
        }
        
    }//GEN-LAST:event_jButtonAumento1ActionPerformed

    private void jButtonAumento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumento2ActionPerformed
        // TODO add your handling code here:
        int convertir;
        
        convertir = Integer.parseInt(JugadorDinero.getText());
        
        if (convertir>=80000) {
            int nuevoPresupuesto = convertir - 80000;
            JugadorDinero.setText(Integer.toString(nuevoPresupuesto));
        }else{
            txtAutosConstruidos.setText("No se pudo comprar un nuevo espacio. Dinero insuficiente.");
        }
    }//GEN-LAST:event_jButtonAumento2ActionPerformed

    private void jButtonAumento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAumento3ActionPerformed
        // TODO add your handling code here:
        int convertir;
        
        convertir = Integer.parseInt(JugadorDinero.getText());
        
        if (convertir>=90000) {
            int nuevoPresupuesto = convertir - 90000;
            JugadorDinero.setText(Integer.toString(nuevoPresupuesto));
        }else{
            txtAutosConstruidos.setText("No se pudo comprar un nuevo espacio. Dinero insuficiente.");
        }
    }//GEN-LAST:event_jButtonAumento3ActionPerformed
    
    public static void main(String args[]) {
        
        Inicio ventana = new Inicio();
        
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
        if (minutos==1) {
            stopTimer();
            this.dispose();
        }
    }
    
    
    public void updateHitPointsBar(Taller barra, JProgressBar bar) {
        int life = (int) Math.ceil(barra.getLife());
        bar.setValue(life);
    }

   
//public void turn() {
//        if (charactersLeft == 0) {
//            Partida round = new Partida(this);
//            round.start();
//            return;
//        }
//        
//        JListPiezas.setEnabled(true);
//    }
    
    
    
    public void showNewRound() {
        charactersPerRound = partidaNum + 4;
        charactersLeft = charactersPerRound;
        
                
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
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListPiezas;
    private javax.swing.JTextField JugadorDinero;
    private javax.swing.JButton btSeleccioPieza;
    private javax.swing.JLabel contadorLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAumento1;
    private javax.swing.JButton jButtonAumento2;
    private javax.swing.JButton jButtonAumento3;
    private javax.swing.JButton jButtonBasurero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblCharactersLeft;
    private javax.swing.JLabel lblContadorBackGround;
    private javax.swing.JLabel lblGameFinishText;
    private javax.swing.JLabel lblNewGame;
    private javax.swing.JLabel lblNewRound;
    private javax.swing.JLabel lblSelectPie;
    private javax.swing.JLabel lblSelectPiezaText;
    private javax.swing.JLabel leftRoad1;
    private javax.swing.JLabel leftRoad2;
    private javax.swing.JLabel leftRoad3;
    private javax.swing.JLabel leftRoad5;
    private javax.swing.JTextArea txtAutosConstruidos;
    // End of variables declaration//GEN-END:variables
}
