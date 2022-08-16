import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * For the given weather report and limitation on Loki Shoes, Tiger has to change the shoes a minimum of 2 times.
 *
 * Initially, Tiger is in his Thor shoes.
 *
 *
 *
 * Day 1: The temperature is 0 and Thor shoes would work smoothly so Tiger does not have to change.
 *
 * Day 2: The temperature is -3. Thor shoes cannot work below 0 so he has to change into Loki shoes. Day of usage of
 * Loki shoes = 1, Number of shoe change = 1
 *
 * Day 3: The temperature is -2. Tiger will continue with his Loki shoes. Day of usage of Loki shoes = 2, Number of
 * shoe change = 1
 *
 * Day 4: The temperature is -1. Tiger will continue with his Loki shoes. Day of usage of Loki shoes = 3. The limit for
 * Loki shoes is reached and he cannot use them further. Number of shoe change = 1
 *
 * Day 5: The temperature is 4. Thor shoes will work smoothly and Tiger will change to his Thor shoes. Number of shoe
 * change = 2
 *
 * Day 6: The temperature is 5. Tiger will continue in his Thor shoes. Number of shoe change = 2
 *
 *
 *
 * Note: If the limitation for Loki shoes would have been 2 in the case above, it would not have been possible for
 * Tiger to plan his workout.
 *
 *
 * Can you help Tiger figure out if it is possible for him to plan his workout or not. If it is possible for him to
 * plan, then print the minimum number of shoe changes he would have to go through. If it is not possible for him to
 * plan his workout, print NOT POSSIBLE.
 *
 *
 *
 * Input Format
 * The first line of input consists of two space-separated integers, number of days for which Tiger asks the weather
 * report, N and the limitation on the usage of Loki shoes, D
 *
 *
 * The second line of input consists of N space-separated integers, representing the temperature W on the Nth day.
 *
 * Constraints
 * 1<= N <=100000
 *
 * 0<= D <=N
 *
 *
 * -30<= W <=40
 *
 *
 *
 * Output Format
 * If it is possible for Tiger to plan his workout, then print the minimum number of shoe changes he would have to go
 * through else print NOT POSSIBLE.
 */

public class Tiger {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        // Considering the inputs
        String splitInput;


        int days = 0;
        int limitation = 0;
        int count = 0;
        int shoeChange = 1;
        ArrayList<Integer> storeTemperatureForWDays = new ArrayList<>();

        for (int i = 1; i <= 2; i++) {
            splitInput = reader.readLine();
            String[] split = splitInput.split("\\s");
            days = Integer.parseInt(split[0]);
            limitation = Integer.parseInt(split[1]);
            for (i = 0; i < days; i++) {
                int data = scanner.nextInt();
                storeTemperatureForWDays.add(data);
            }
        }

        for (Integer values : storeTemperatureForWDays) {
            if (values >= 0) {
                shoeChange = shoeChange;
            } else if (values < 0) {
                count++;
                if (count >= limitation) {
                    shoeChange++;
                }
            }
        }

        if (shoeChange >= limitation) {
            System.out.println("NOT POSSIBLE");
        } else System.out.println(shoeChange);

    } // end main
}
