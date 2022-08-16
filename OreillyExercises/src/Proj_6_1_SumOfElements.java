import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Proj_6_1_SumOfElements {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Declaring an ArrayList
        ArrayList<Integer> values = new ArrayList<>();
        sumElements(values);
    }

    public static void sumElements(ArrayList<Integer> data) throws IOException {

        // Considering the data input values
        int values = 0;

        for (int i = 0; i < 10; i++) {
            values = Integer.parseInt(reader.readLine());
            data.add(values); // Adding values to the ArrayList
        }

        // Declaring a sum variable
        int sum = 0;



        // Printing values to the console
        for(Integer dataValues : data) {
            sum = sum + dataValues;
        }

        System.out.println(sum);
    }
}
