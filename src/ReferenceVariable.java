import java.io.*;


public class ReferenceVariable {


    int x = 10;

    int display() {
        System.out.println("x = " + x);
        return 0;
    }

}

class variable {

    public static void main(String[] args) {

        // create instance
        ReferenceVariable D1 = new ReferenceVariable();

        // accessing instance(object) variable
        System.out.println(D1.x);

        // accessing instance(object) method
        D1.display();
    }
}


