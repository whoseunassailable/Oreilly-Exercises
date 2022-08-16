import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibleByThree {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your input :");

        // Considering the inputs
        int input = Integer.parseInt(reader.readLine());

        if (input % 3 == 0) {
            System.out.println(input + " is divisible by 3.");
        } else System.out.println(input + " is not divisible by 3.");
    }
}
