/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cronometro;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Cronometro2 extends javax.swing.JFrame {

    
    private Timer timer;
    private int segundos = 0;
    private JLabel etiqueta;
    private JButton botonIniciar, botonDetener, botonReiniciar;

    public Cronometro2() {
        super("Cronómetro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        // Crear etiqueta para mostrar el tiempo transcurrido
        etiqueta = new JLabel("00:00:00", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 60));
        etiqueta.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        add(etiqueta, BorderLayout.CENTER);

        // Crear panel para los botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Crear botón de iniciar
        botonIniciar = new JButton("Iniciar");
        botonIniciar.addActionListener(e -> iniciarCronometro());
        panelBotones.add(botonIniciar);

        // Crear botón de detener
        botonDetener = new JButton("Detener");
        botonDetener.addActionListener(e -> detenerCronometro());
        botonDetener.setEnabled(false);
        panelBotones.add(botonDetener);

        // Crear botón de reiniciar
        botonReiniciar = new JButton("Reiniciar");
        botonReiniciar.addActionListener(e -> reiniciarCronometro());
        botonReiniciar.setEnabled(false);
        panelBotones.add(botonReiniciar);

        add(panelBotones, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void iniciarCronometro() {
        botonIniciar.setEnabled(false);
        botonDetener.setEnabled(true);
        botonReiniciar.setEnabled(true);
        timer = new Timer(1000, e -> {
            segundos++;
            int minutos = segundos / 60;
            int horas = minutos / 60;
            etiqueta.setText(String.format("%02d:%02d:%02d", horas, minutos % 60, segundos % 60));
        });
        timer.start();
    }

    private void detenerCronometro() {
        botonIniciar.setEnabled(true);
        botonDetener.setEnabled(false);
        botonReiniciar.setEnabled(true);
        timer.stop();
    }

    private void reiniciarCronometro() {
        segundos = 0;
        etiqueta.setText("00:00:00");
        botonIniciar.setEnabled(true);
        botonDetener.setEnabled(false);
        botonReiniciar.setEnabled(false);
        timer.stop();
    }

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

   
    public static void main(String args[]) {
       
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
