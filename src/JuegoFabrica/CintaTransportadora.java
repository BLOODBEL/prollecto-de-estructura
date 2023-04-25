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
public class CintaTransportadora {
    private NodoCinta cabeza;
    private int tamanoMaximo;
    private int tamanoActual;
    private final int[] costos = {0, 0, 0, 70000, 80000, 90000};
    
    public static void main(String[] args) {
        // TODO code application logic here
        CintaTransportadora cinta = new CintaTransportadora(3);
        cinta.agregarMaterialesAleatorios();
    }
    
    public CintaTransportadora(int tamanoMaximo) {
        cabeza = null;
        this.tamanoMaximo = tamanoMaximo;
        tamanoActual = 0;
    }
    
    public void agregarMaterial(String material) {
        if (tamanoActual < tamanoMaximo) {
            NodoCinta nuevoNodo = new NodoCinta();
            nuevoNodo.material = material;
            nuevoNodo.anterior = null;

            if (cabeza == null) {
                cabeza = nuevoNodo;
                cabeza.siguiente = null;
            } else {
                NodoCinta actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoNodo;
                nuevoNodo.anterior = actual;
                nuevoNodo.siguiente = null;
            }

            tamanoActual++;
        }
    }
    
    public void agregarMaterialesAleatorios() {
        int materialesFaltantes = tamanoMaximo - tamanoActual;
        if (materialesFaltantes > 0) {
            for (int i = 0; i < materialesFaltantes; i++) {
                agregarMaterial(obtenerMaterialAleatorio());
            }
        }
    }

    private String obtenerMaterialAleatorio() {
        String[] materiales = {"Pieza A", "Pieza B", "Pieza C", "Pieza D", "Pieza E", "Pieza F", "Pieza G"};
        int indiceAleatorio = (int) (Math.random() * materiales.length);
        return materiales[indiceAleatorio];
    }
    
    public void aumentarTamanoMaximo() {
        if (tamanoMaximo < 6) {
            tamanoMaximo++;
        }
    }
    
    public int obtenerCostoAumentarTamano() {
        return costos[tamanoMaximo + 1];
    }
    
    public void vaciar() {
        cabeza = null;
        tamanoActual = 0;
    }
    
    public boolean buscar(String material) {
        if (cabeza == null) {
            return false;
        }

        NodoCinta actual = cabeza;
        do {
            if (actual.material.equals(material)) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != null);

        return false;
    }
    
    public String[] obtenerMateriales() {
        String[] materiales = new String[tamanoMaximo];
        NodoCinta actual = cabeza;
        for (int i = 0; i < tamanoMaximo && actual != null; i++) {
            materiales[i] = actual.material;
            actual = actual.siguiente;
        }
        return materiales;
    }
    
    private class NodoCinta {
        String material;
        NodoCinta anterior;
        NodoCinta siguiente;
    }
}

