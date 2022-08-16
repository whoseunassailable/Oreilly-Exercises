import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proj2_2_MadlibsClone {
    public static void main(String[] args) throws IOException {
        // Importing the BR
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String adjective1 = reader.readLine();
        String name = reader.readLine();
        String adjective2 = reader.readLine();
        String place = reader.readLine();
        String clothing = reader.readLine();
        String hobby = reader.readLine();
        String occupation = reader.readLine();
        String boyName = reader.readLine();
        String kingName = reader.readLine();

        System.out.println("There once was a " + adjective1 + " girl named " + name +
                ", who was a " + adjective2 + " in the Kingdom of " + place + ".\nShe " +
                "loved to wear " + clothing + " clothes and to " + hobby + ". She wanted to\n" +
                "marry the " + occupation + " named " + boyName + " but her father\n" +
                ", King " + kingName + " forbid her from seeing him.");
    }
}
