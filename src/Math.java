public class Math {

    //Make a method that performs the multiplication of two integers
    //Use the same method name as above to create a new method to perform the addition of three doubles
    //Print/display the result

    public static int calculate(int x, int y) {
        return x * y;
    }

    public static double calculate(double x, double y, double z) {
        return x + y + z;

    }

    public static void main(String[] args) {
        System.out.println("The result of the FIRST method is:" + calculate(4, 2));
        System.out.println("The result of the SECOND method is:" + calculate(4.5, 2.5, 1.5));
    }

}



