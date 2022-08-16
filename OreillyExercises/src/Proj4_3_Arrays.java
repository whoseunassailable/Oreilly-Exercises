import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Proj4_3_Arrays {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Declaring the names and ages
        String names;
        int ages;

        // Declaring the names and ages arraylist
        ArrayList<String> nameData = new ArrayList<>();
        ArrayList<Integer> ageData = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name : ");
            names = reader.readLine();
            System.out.print("Enter the age : ");
            ages = Integer.parseInt(reader.readLine());
            nameData.add(names);
            ageData.add(ages);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(nameData.get(i) + " is " + ageData.get(i) + " years old.");
        }

    }
}
