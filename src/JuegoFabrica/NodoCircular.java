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
public class NodoCircular {
    String dato;
    NodoCircular siguiente;

    public NodoCircular() {
        this.dato = "";
        this.siguiente = null;
    }

    public NodoCircular(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
