import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        // Creating a Random Object
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int dataValues = random.nextInt(1, 7);
            System.out.println(dataValues);
        }
    }
}
