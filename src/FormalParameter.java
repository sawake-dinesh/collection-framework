public class FormalParameter {
    int a, b;

    // Function to assign the value
    // to the class variables
    FormalParameter(int x, int y) {
        a = x;
        b = y;
    }

    // Changing the values of class variables
    void ChangeValue(FormalParameter obj) {
        obj.a += 10;
        obj.b += 20;
    }

}

// Caller
class Fp {

    public static void main(String[] args) {

        // Instance of class is created
        // and value is assigned using constructor
        FormalParameter object
                = new FormalParameter(10, 20);

        System.out.println("Value of a: "
                + object.a
                + " & b: "
                + object.b);

        // Changing values in class function
        object.ChangeValue(object);

        // Displaying values
        // after calling the function
        System.out.println("Value of a: "
                + object.a
                + " & b: "
                + object.b);
    }
}




