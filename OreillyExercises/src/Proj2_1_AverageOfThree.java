import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Asking the user for the required inputs
        System.out.println("Enter three values :");

        // Considering different inputs
        int inputValueOne = Integer.parseInt(reader.readLine());
        int inputValueTwo = Integer.parseInt(reader.readLine());
        int inputValueThree = Integer.parseInt(reader.readLine());

        // Logic for finding the average of three inputs
        int result = (inputValueOne + inputValueTwo + inputValueThree) / 3;

        // Printing to the console
        System.out.println(result);

    } // end main
}
