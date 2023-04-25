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
public class ListaCircular {
    private NodoCircular cabeza;

    public ListaCircular() {
        cabeza = null;
    }
    
    

    public void insertarAlFinal(String dato) {
        NodoCircular nuevoNodo = new NodoCircular();
        nuevoNodo.dato = dato;

        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            NodoCircular actual = cabeza;
            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        }
    }

    public boolean buscar(String dato) {
        if (cabeza == null) {
            return false;
        }

        NodoCircular actual = cabeza;
        do {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }
}
