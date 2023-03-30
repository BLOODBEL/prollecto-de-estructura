/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cronometro;


import java.awt.BorderLayout;
 import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class central {

    private static JLabel imagenLabel;

 

  public static void main(String[] args) {
      JFrame frame = new JFrame("Cronometro");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    JPanel mainPanel = new JPanel(new BorderLayout());

    JLabel tiempoLabel = new JLabel("00:000", JLabel.CENTER);
    tiempoLabel.setFont(new Font("Arial", Font.BOLD, 60));
    mainPanel.add(tiempoLabel, BorderLayout.CENTER);

    JPanel imagenPanel = new JPanel(new BorderLayout());
    mainPanel.add(imagenPanel, BorderLayout.SOUTH);

    Cronometro cronometro = new Cronometro(10000, tiempoLabel, imagenLabel);
    cronometro.start();

    frame.getContentPane().add(mainPanel);
    frame.setVisible(true);
  }
}