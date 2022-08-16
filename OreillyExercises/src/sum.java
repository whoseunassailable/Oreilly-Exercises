import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Asking the user to enter the sum
        System.out.println("Enter the input: ");

        // Considering the input
        int input = Integer.parseInt(reader.readLine());

        int sum = 0;

        while (input >= 0) {
            sum = sum + input;
            System.out.println("The sum is : \t" + sum);
            input = Integer.parseInt(reader.readLine());
        }

        System.out.println("Done!");
    }
}
