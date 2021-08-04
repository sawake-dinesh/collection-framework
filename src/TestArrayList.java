import java.util.ArrayList;

class TestArrayList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>(3);//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add("vishal");
        list.add("Maheh");

        //for (String i : list)
          //  System.out.println(i);

        list.forEach(System.out::println);

    }
}
