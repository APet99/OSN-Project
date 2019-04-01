
public class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this(data, null);
    }

    public Node() {
        this(0, null);
    }

    public void set(int d) {
        data = d;
    }
}