import java.util.HashSet;


public class TestHashSet {

    public static void main(String args[]) {
        //Creating HashSet and adding elements

        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        set.add(5);
        set.add(5);

        set.forEach(System.out::println);


    }
}
