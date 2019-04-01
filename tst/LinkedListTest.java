import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {


    // Tests that the get method properly retrieves the value at the index passed through
    @Test
    public void LinkedListGetTest1() {
        LinkedList list = new LinkedList();

        for (int i = 100; i <= 1000; i += 100) {
            list.add(i);
        }

        Assert.assertEquals(list.getData(0), 100);
        Assert.assertEquals(list.getData(1), 200);
        Assert.assertEquals(list.getData(3), 400);
        Assert.assertEquals(list.getData(5), 600);
        Assert.assertEquals(list.getData(7), 800);
        Assert.assertEquals(list.getData(8), 900);
        Assert.assertEquals(list.getData(9), 1000);
    }

    // Tests that the set method properly SETS the value at the passed index, to the passed value
    @Test
    public void LinkedListSetTest1() {
        LinkedList list = new LinkedList();

        for (int i = 100; i <= 1000; i += 100) {
            list.add(i);
        }
        Assert.assertEquals(list.getData(0), 100);
        Assert.assertEquals(list.getData(3), 400);
        Assert.assertEquals(list.getData(5), 600);
        Assert.assertEquals(list.getData(7), 800);
        Assert.assertEquals(list.getData(9), 1000);


        list.setData(0, 0);
        list.setData(3, 3);
        list.setData(5, 5);
        list.setData(7, 7);
        list.setData(9, 9);

        Assert.assertEquals(list.getData(0), 0);
        Assert.assertEquals(list.getData(3), 3);
        Assert.assertEquals(list.getData(5), 5);
        Assert.assertEquals(list.getData(7), 7);
        Assert.assertEquals(list.getData(9), 9);

    }
}
