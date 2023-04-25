
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

public class juegoDePlatafroma extends javax.swing.JFrame {

    private final int ANCHO_VENTANA = 800;
    private final int ALTO_VENTANA = 600;
    private JPanel panelJuego;
    private Personaje personaje;
    private Enemigo[] enemigos;
    private Objeto[] objetos;
    private boolean teclaIzquierdaPulsada;
    private boolean teclaDerechaPulsada;
    private boolean teclaArribaPulsada;
    private boolean teclaAbajoPulsada;

    public juegoDePlatafroma() {
         super("Juego de plataforma");
        setSize(ANCHO_VENTANA, ALTO_VENTANA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelJuego = new JPanel();
        panelJuego.setPreferredSize(new Dimension(ANCHO_VENTANA, ALTO_VENTANA));
        panelJuego.setFocusable(true);
        panelJuego.requestFocus();
        panelJuego.addKeyListener((KeyListener) this);
        getContentPane().add(panelJuego);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        inicializarJuego();
        iniciarBuclePrincipal();
    }

    private void inicializarJuego() {
        // Crear personaje
        personaje = new Personaje(ANCHO_VENTANA / 2, ALTO_VENTANA - 80);

        // Crear enemigos
        enemigos = new Enemigo[3];
        enemigos[0] = new Enemigo(50, ALTO_VENTANA - 100);
        enemigos[1] = new Enemigo(ANCHO_VENTANA / 2, ALTO_VENTANA - 150);
        enemigos[2] = new Enemigo(ANCHO_VENTANA - 100, ALTO_VENTANA - 200);

        // Crear objetos
        objetos = new Objeto[5];
        objetos[0] = new Objeto(100, ALTO_VENTANA - 200);
        objetos[1] = new Objeto(ANCHO_VENTANA / 2, ALTO_VENTANA - 250);
        objetos[2] = new Objeto(ANCHO_VENTANA - 200, ALTO_VENTANA - 300);
        objetos[3] = new Objeto(150, ALTO_VENTANA - 400);
        objetos[4] = new Objeto(ANCHO_VENTANA - 100, ALTO_VENTANA - 450);
    }

    private void iniciarBuclePrincipal() {
        while (true) {
            actualizarJuego();
            dibujarJuego();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void actualizarJuego() {
        // Mover personaje
        if (teclaIzquierdaPulsada) {
            personaje.moverIzquierda();
        }
        if (teclaDerechaPulsada) {
            personaje.moverDerecha();
        }
        if (teclaArribaPulsada) {
            personaje.saltar();
        }
        personaje.aplicarGravedad();
        
        // Mover enemigos
        for (Enemigo enemigo : enemigos) {
            enemigo.mover();
            Enemigo Enemigo = null;
            if (personaje.colisionaCon(Enemigo)) {
                // Si el personaje colisiona con un enemigo, se reinicia el juego
                reiniciarJuego();
                return;
            }
        }

        // Recolectar objetos
        for (int i = 0; i < objetos.length; i++) {
            Objeto objeto = objetos[i];
            Enemigo Objeto = null;
            if (personaje.colisionaCon(Objeto)) {
                objetos[i] = null;
            }
        }

        // Verificar si se ganó el juego
        if (seGanoElJuego()) {
            mostrarMensaje("¡Felicidades, ganaste el juego!");
            reiniciarJuego();
        }

    }

    private void dibujarJuego() {
        Graphics g = panelJuego.getGraphics();

        // Dibujar fondo
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, ANCHO_VENTANA, ALTO_VENTANA);

        // Dibujar personaje
        personaje.dibujar(g);

        // Dibujar enemigos
        for (Enemigo enemigo : enemigos) {
            enemigo.dibujar(g);
        }

        // Dibujar objetos
        for (Objeto objeto : objetos) {
            if (objeto != null) {
                objeto.dibujar(g);
            }
        }

        // Liberar recursos gráficos
        g.dispose();
    }

    private void reiniciarJuego() {
        inicializarJuego();
    }

    private boolean seGanoElJuego() {
        for (Objeto objeto : objetos) {
            if (objeto != null) {
                return false;
            }
        }
        return true;
    }

    private void mostrarMensaje(String mensaje) {
        // Mostrar un cuadro de diálogo con el mensaje indicado
        // Aquí se podría usar JOptionPane, pero en su lugar se utilizará una ventana emergente
        JFrame ventanaEmergente = new JFrame();
        ventanaEmergente.setSize(400, 200);
        ventanaEmergente.setLocationRelativeTo(this);
        ventanaEmergente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JLabel(mensaje));
        ventanaEmergente.getContentPane().add(panel);
        ventanaEmergente.setVisible(true);
    }

    // Métodos de la interfaz KeyListener
    public void keyTyped(KeyEvent e) {
        // No se utiliza
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                teclaIzquierdaPulsada = true;
                break;
            case KeyEvent.VK_RIGHT:
                teclaDerechaPulsada = true;
                break;
            case KeyEvent.VK_UP:
                teclaArribaPulsada = true;
                break;
            case KeyEvent.VK_DOWN:
                teclaAbajoPulsada = true;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
                teclaIzquierdaPulsada = false;
                break;
            case KeyEvent.VK_RIGHT:
                teclaDerechaPulsada = false;
                break;
        
       
}
    }
  /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
     
    

   
     

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

public static void main(String[] args) {
    Juego juego = new Juego();
    JFrame ventana = new JFrame("Mi Juego");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setResizable(false);
    ventana.setContentPane(juego.getPanelJuego());
    ventana.pack();
    ventana.setVisible(true);
    juego.iniciarJuego();
}
}