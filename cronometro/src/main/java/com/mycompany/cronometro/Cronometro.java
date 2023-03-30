/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cronometro;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Cronometro extends Thread {
  private static final long TIEMPO_MAXIMO_EN_MILISEGUNDOS = 8 * 60 * 1000; // 8 minutos en milisegundos
  private long tiempoTotal;
  private long elapsedTime;
  private JLabel tiempoLabel;
  private JLabel imagenLabel;

  public Cronometro(long tiempoTotal, JLabel tiempoLabel, JLabel imagenLabel) {
    this.tiempoTotal = tiempoTotal;
    this.tiempoLabel = tiempoLabel;
    this.imagenLabel = imagenLabel;
  }

  @Override
  public void run() {
    this.elapsedTime = 0;
    long startTime = System.currentTimeMillis();

    while (this.elapsedTime < this.tiempoTotal) {
      this.elapsedTime = System.currentTimeMillis() - startTime;
      actualizarTiempo();
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    mostrarImagenTermino();
  }

  private void actualizarTiempo() {
    long tiempoEnSegundos = this.elapsedTime / 1000;
    long milisegundosRestantes = this.elapsedTime % 1000;
    String tiempoTexto = String.format("%02d:%03d", tiempoEnSegundos, milisegundosRestantes);
    this.tiempoLabel.setText(tiempoTexto);

    if (this.elapsedTime >= TIEMPO_MAXIMO_EN_MILISEGUNDOS) {
      mostrarImagenTermino();
    }
  }

  private void mostrarImagenTermino() {
    try {
      Image imagen = ImageIO.read(new File("termino.jpg"));
      this.imagenLabel.setIcon(new ImageIcon(imagen));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}