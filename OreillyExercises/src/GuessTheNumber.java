import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Importing the PRNGs Object
        Random random = new Random();
        int randomValue = random.nextInt(100);

        // Declaring a count variable
        int count = 0;

        System.out.println("Enter the number guess :");

        for (int i = 0; i < 100; i++) {
            int input = Integer.parseInt(reader.readLine());
            count++;
            if (input > randomValue) {
                System.out.println("The guess is too high.");
            } else if (input == randomValue) {
                break;
            } else {
                System.out.println("The guess is too low.");
            }
        }

        System.out.println("Congratulations! You guessed the number in " + count + " guesses.");
    }
}
