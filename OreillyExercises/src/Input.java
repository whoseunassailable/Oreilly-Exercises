import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException {
        // Importing the BR class
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Declaration
        String myName, city;
        int age;

        //Initialisation
        myName = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        city = reader.readLine();

        // Printing the output
        System.out.println("Hello my name is " + myName + ".I am " + age + " years old and i live in the city of " + city + ".");
    } // end main
}
