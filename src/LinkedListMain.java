/*
 * This is a rough test to ensure the get/set methods work properly;
 * */
public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
            System.out.println(list);
        }
    }
}