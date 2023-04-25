package JuegoFabrica;

public class Queue<A> {

    private Node<A> head;
    private Node<A> end;
    private int size = 0;

    public void add(A value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            end = temp;
        } else {
            end.setNext(temp);
            end = temp;
        }
        size++;
    }

    public A remove() {
        Node<A> temp = head;
        if (head == null) {
            System.out.println("La fila está vacia");
            return null;
        } else if (end == head) {
            head = null;
            end = null;
            size--;
            return temp.getValue();
        }
        head = head.getNext();
        size--;
        return temp.getValue();
    }

    public A get(int index) {
        Node<A> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int getSize() {
        return size;
    }
}
