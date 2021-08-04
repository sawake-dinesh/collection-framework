import java.util.*;


public class TestHashMap {

    public static void main(String args[]) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(25, "Apple");
        map.put(3, "apple1");
        map.put(14, "Banana");
        map.put(18, "Grapes");
        map.put(1, "pineapple");

        map.remove(3);
        map.put(10, "blueberry");
        map.replace(100, "Tomato");

        System.out.println("Before Sorting : ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("\nAfter Sorting : ");
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(map);//using TreeMap constructor to sort the HashMap
        Iterator itr = tm.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println("Key:  " + key + " value:  " + map.get(key));


        }

    }
}
