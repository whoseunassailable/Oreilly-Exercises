public class Recursion {
    public static void main(String[] args) {
        printTenToOne(10); // calling the printToTen method while passing the argument as 10
    }

    public static void printTenToOne(int value) {
        if (value >= 0) {
            System.out.println(value);
            printTenToOne(value - 1); // recursion
        }
    } // end printTenToOne
}
