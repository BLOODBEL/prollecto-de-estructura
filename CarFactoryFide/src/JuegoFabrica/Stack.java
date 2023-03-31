package JuegoFabrica;

public class Stack<A> {

    private Node<A> top;

    public Stack() {
        
    }

    public void push(A value) {
        Node current = new Node(value);
        current.setNext(top);
        top = current;
    }

    public A pop() {
        Node<A> temp = top;
        top = temp.getNext(); 
        temp.setNext(null);
        return temp.getValue();
    }
}
