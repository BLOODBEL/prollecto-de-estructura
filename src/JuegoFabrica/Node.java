package JuegoFabrica;

public class Node<A> {

    private A value;
    private Node next;
    private Node back;

    public Node(A value) {
        this.value = value;

    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setBack(Node back) {
        this.back = back;
    }

    public Node getBack() {
        return back;
    }

}
