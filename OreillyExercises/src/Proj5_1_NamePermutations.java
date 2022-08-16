import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Considering the inputs of the user
        String firstName;
        String lastName;

        // Declaring a count
        int count = 0 ;

        // Adding them into the Arraylist
        ArrayList<String> dataFN = new ArrayList<>();
        ArrayList<String> dataLN = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your first name : ");
            firstName = reader.readLine();
            System.out.print("Enter your last name : ");
            lastName = reader.readLine();

            // Adding them into the Arraylist
            dataFN.add(firstName);
            dataLN.add(lastName);
        } // Considering 5 inputs

        for (int i = 0; i < dataFN.size(); i++) {
            for (int j = 0; j < dataLN.size(); j++) {
                System.out.print(dataFN.get(i) + " " + dataLN.get(j) + " \t ");
                count++;
                if (count % 4 == 0) {
                    System.out.println();
                }
            }
        } // Logic for permutation of the name

        // Printing the count
        System.out.println(count );

    }
}
