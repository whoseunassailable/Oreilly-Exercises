public class MethodOverloading {
    public static void main(String[] args) {
        
        String argument = "Method with a parameter";
        int value = 1;

        printResult();
        printResult(argument);
        printResult(value);
        
    } // end main

    public static void printResult() {
        System.out.println("Method without parameter.");
    }

    public static void printResult(String parameter1) {
        System.out.println(parameter1);
    }

    public static void printResult(int parameter1) {
        System.out.println(parameter1);
    }

    public static String printResult(String parameter1, String parameter2) {
        return "Method without a parameter but a return type.";
    }

}
