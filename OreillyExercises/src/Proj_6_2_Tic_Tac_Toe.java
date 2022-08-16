import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proj_6_2_Tic_Tac_Toe {

    // Importing the BR
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        runGame();
    }// end main

    public static void runGame() {
        System.out.println(" | | " +
                "\n" +
                "-----" +
                "\n" +
                " | | " +
                "\n" +
                "-----" +
                "\n" +
                " | | ");

        System.out.println("It is X's turn. Please enter the row then the column each from 0, 1 and 2 separated by a space.");
    } // end runGame

    public static void initialiseGameBoard(String[][] gameBoard) {
        gameBoard = new String[3][3];
    } // end initialiseGameBoard

    public static void printCurrentBoard(String[][] gameBoard) {

    }// end printCurrentBoard

    public static void getUserInput(boolean xTurn, String[][] gameBoard) throws IOException {
        // Getting user inputs
        String input = reader.readLine();

        for (int i = 0; i < 1; i++) {
            String[] split = input.split(input);
            int storeI = Integer.parseInt(reader.readLine());
            int storeJ = Integer.parseInt(reader.readLine());
        }

    } // end getUserInput

    public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return false;
    } // end cellAlreadyOccupied

    public static String getWinner(String[][] gameBoard) {
        return null;
    } // end getWinner

    public static boolean isBoardFull(String[][] gameBoard) {
        return false;
    } // end isBoardFull

}
