import java.nio.charset.StandardCharsets;

public class StringsMethods1 {
    public static void main(String[] args) {
        //
        String name = "Rohan";
        String anotherName = "Rob";

        if (name.compareTo(anotherName) > 0) {
            System.out.println("My name is greater than Rob's name.");
        } else System.out.println("My name is smaller than Rob's name.");

    }
}
