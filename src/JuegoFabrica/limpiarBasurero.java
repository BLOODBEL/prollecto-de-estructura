package JuegoFabrica;

import JuegoFabrica.Node;


public class limpiarBasurero {
    private Node root;
    private Node end;
    private int size = 0;
    
    public void limpiar() {
        Node actual = root;
        while (actual != null) {
            Node end = actual.getBack();
            actual.getValue();
            actual = end;
        }
        root = null;
        end = null;
    }
}
