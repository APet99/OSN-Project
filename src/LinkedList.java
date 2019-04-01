import java.util.Queue;

public class LinkedList {
    private Node first;

    // constructor:
    public LinkedList() {
        first = null;
    }

    // add node to the end
    //pre: ex. 2 -> 4 -> 8 -> 1 -> 10
    //post: when passed (7)   2 -> 4 -> 8 -> 1 -> 10 -> 7
    public void add(int data) {
        if (first == null) {
            first = new Node();
            first.data = data;
            first.next = null;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    // gets the data stored in the (index) element.
    // pre: list is 2 -> 4 -> 8 -> 1 -> 10,
    // post: (4) then the result would be 1.
    public int getData(int index) {
        Node current = first;
        int counter = 0;
        while (current.next != null && counter != index) {
            counter++;
            current = current.next;
        }
        if (counter != index) {
            throw new IndexOutOfBoundsException();
        } else
            return current.data;
    }

    //sets the data at the given (index) element
    //pre: list is 2 -> 4 -> 8 -> 1 -> 10,
    //post: (3, 11) would result in 2 -> 4 -> 11 -> 1 -> 10.
    public void setData(int index, int data) {
        Node current = first;
        int counter = 0;
        while (current.next != null && counter != index) {
            counter++;
            current = current.next;
        }
        if (counter == index)
            current.set(data);
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        Node current = first;
        StringBuilder listOutput = new StringBuilder();
        while (current != null) {
            listOutput.append("[" + current.data + "] ");
            if (current.next != null) {
                listOutput.append("-> ");
            }
            current = current.next;
        }
        return listOutput.toString();
    }

}

