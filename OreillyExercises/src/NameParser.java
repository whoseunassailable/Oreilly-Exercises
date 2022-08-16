import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class NameParser {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Asking the user for their name
        System.out.print("Enter your name : ");

        // Considering the input of the user
        String fullName = reader.readLine();

        // Splitting the string at the space value
        String[] split = fullName.split("\\s");

        // Retreiving firstName
        String firstName = split[0];

        // Retreiving lastName
        String lastName = split[1];

        // Converting firstName to uppercase version
        String upperFirstName = firstName.toUpperCase();

        // Converting lastName to uppercase version
        String lowerlastName = lastName.toLowerCase();

        // Printing the result
        System.out.println(upperFirstName);
        System.out.println(lowerlastName);

    } // end main
}
