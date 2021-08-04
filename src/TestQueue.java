import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {

    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("Iterating the queue elements:");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();

        System.out.println("\nAfter removing two elements:");
        Iterator itr1 = queue.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}

