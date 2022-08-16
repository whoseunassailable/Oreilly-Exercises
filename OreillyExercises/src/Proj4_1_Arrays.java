import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Proj4_1_Arrays {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Considering the input values
        int input = 0;
        int[] arrayValues = new int[5];

        // Asking the user to enter five Integer values
        System.out.println("Enter the five integer values on each line : ");

        for (int i = 0; i < 5; i++) {
            input = Integer.parseInt(reader.readLine());
            arrayValues[i] = input;
        } // end fori loop for considering inputs and storing them into arrays

        /**
        for (int i = 0; i < arrayValues.length; i++) {
            arrayValues[i] = arrayValues[i] * 2;
            System.out.println(arrayValues[i]);
        } end fori loop
        */

        for(Integer values : arrayValues) {
            System.out.println("Result is : " + values * 2);
        } // end for each loop


    } // end main
}
