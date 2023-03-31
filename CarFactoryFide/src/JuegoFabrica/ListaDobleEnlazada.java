package JuegoFabrica;

public class ListaDobleEnlazada<A> {

    private Node<A> root;
    private Node<A> end;
    private int size = 0;

    

    public A get(int index) {
        
        if (size == 0) {
            
            System.out.println("La lista está vacia");
            return null;
        } else if (index >= size || index < 0) {
            
            System.out.println("índice fuera del rango de la lista.");
            return null;
        } else {
            
            Node<A> current = root;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getValue();
        }
    }
    public void add(A value) {
        Node temp = new Node(value);
        if (root == null) {
            root = temp;
            end = temp;
            temp.setNext(temp);
            temp.setNext(temp);
        } else {
            temp.setBack(end);
            temp.setNext(root);
            end.setNext(temp);
            root.setBack(temp);
            end = temp;
        }

        size++;
    }

    public int getSize() {
        return size;
    }

   

    public boolean isRoot(int index) {
        
        if (size == 0) {
            System.out.println("La lista está vacia");
            return false;
        } else if (index >= size || index < 0) {
            System.out.println("índice fuera del rango de la lista.");
            return false;
        } else {
            Node<A> current = root;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            if (current == root) {
                return true;
            }
            return false;
        }
    }
    
     public boolean isEnd(int index) {
        if (size == 0) {
            System.out.println("La lista está vacia");
            return false;
        } else if (index >= size || index < 0) {
            System.out.println("índice fuera del rango de la lista.");
            return false;
        } else {
            Node<A> current = root;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            if (current == end) {
                return true;
            }
            return false;
        }
    }
}
