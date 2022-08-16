import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Proj4_2_Arrays {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Considering the inputs
        int inputs = 0;
        ArrayList<Integer> data = new ArrayList<>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (inputs >= 0) {
                inputs = Integer.parseInt(reader.readLine());
                data.add(inputs);
            } else break;
        } // end fori loop used for inputting greater than or equal to 0 values and adding them into the arraylist

        Collections.reverse(data); // reversing the values with the help of collections

        for(Integer values : data) {
            if (values >= 0) {
                System.out.println(values);
            } // Printing values which are only greater than 0
        } // end enhanced for loop
    }
}
