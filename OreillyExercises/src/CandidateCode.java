
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CandidateCode {
    public static void main(String args[] ) throws IOException {
        // Importing the BR
        Scanner scanner = new Scanner(System.in);

        // declaration and initialisation
        String splitInput;
        int days = 0;
        int limitation = 0;
        int count = 0;
        int shoeChange = 1;
        ArrayList<Integer> storeTemperatureForWDays = new ArrayList<>();

        for(int i = 0; i <= 2; i++) {
            splitInput = scanner.nextLine();
            String[] split = splitInput.split("\\s");
            days = Integer.parseInt(split[0]);
            limitation = Integer.parseInt(split[1]);
            for(i = 0; i < days; i++) {
                int data = scanner.nextInt();
                if (data <= 40 && data >= -30) {
                    storeTemperatureForWDays.add(data);
                }
            }
        }

        for(Integer values : storeTemperatureForWDays) {
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
            System.out.print("NOT POSSIBLE");
        } else {
            System.out.print(shoeChange);
        }

   }
}
