import java.util.*;

public class TestJavaCollection3 {

    public static void main(String args[]) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println("Capacity of the Dynamic Array is  : "+v.capacity());

        for (int i : v)
            System.out.println(i);
    }
}
