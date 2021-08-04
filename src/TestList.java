import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {
    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(5);
        list.add(3);
        list.add(2);

        Collections.sort(list);
        //for (Integer i : list)
         // System.out.println(i);

        list.forEach(System.out::println);


    }
}
