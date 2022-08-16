import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class tic_tac_toe {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final String[][] MY_ARRAY = new String[3][3];

    public static void main(String[] args) throws IOException {
        int count = 0;
        String values = null;

        printXorY(values, count);
        getInput(values, count);

    }

    public static void printXorY(String data, int count) throws IOException {

        if ( count < 9) {
            if (count % 2 == 0) {
                System.out.println("It is X's turn. Please enter the row and column where you want to print your X");
                getInput(data, 0);
                count++;
            } else {
                System.out.println("It is O's turn. Please enter the row and column where you want to print your O");
                getInput(data, 1);
                count++;
            }
            printXorY(data, count);
        }

    } // end for Printing X or Y

    public static void getInput(String data, int count) throws IOException{
        data = reader.readLine(); // taking the input data from the user
        String[] dataValues = data.split("\\s"); // splitting the values

        int valueI = Integer.parseInt(dataValues[0]); // Retreiving the values and storing them into a variable
        int valueJ = Integer.parseInt(dataValues[1]); //

        if (count % 2 == 0) {
            MY_ARRAY[valueI][valueJ] = "X"; // stores value at particular given location as X
        } else {
            MY_ARRAY[valueI][valueJ] = "O"; // stores value at particular given location as Y
        } // end of if else
        storeInput(0);
    } // end of getInput

    public static void storeInput(int count) {
        for (int i = 0; i < MY_ARRAY.length; i++) {
            for (int j = 0; j < MY_ARRAY[i].length; j++) {
                System.out.print(MY_ARRAY[i][j] + " | ");
                try {
                    decideWinner(); // Catches null pointer exception
                } catch (Exception e) {

                } // end of try and catch
            } // end of inner for loop
            System.out.println();
            // System.out.println("----------");
        } // end of for loop
    } // end storeInput

    public static void decideWinner() {
        if (conditionsX()) {
            printWinnerX(); // if true then printing X is the winner
        } else if (conditionsO()){
            printWinnerO(); // else if printing O is the winner
        }
    } // end for decideWinner

    public static boolean conditionsX() {

        boolean conditionOne = MY_ARRAY[0][0] == ("X") && MY_ARRAY[0][1] == ("X") && MY_ARRAY[0][2] == ("X"); // condition for first row
        boolean conditionTwo = MY_ARRAY[1][0] == ("X") && MY_ARRAY[1][1]==("X") && MY_ARRAY[2][2]==("X"); // condition for second row
        boolean conditionThree = MY_ARRAY[2][0]==("X") && MY_ARRAY[2][1]==("X") && MY_ARRAY[2][2]==("X"); // condition for third row

        boolean conditionFour = MY_ARRAY[0][0]==("X") && MY_ARRAY[1][0]==("X") && MY_ARRAY[2][0]==("X"); // condition for first column
        boolean conditionFive = MY_ARRAY[0][1]==("X") && MY_ARRAY[1][1]==("X") && MY_ARRAY[2][1]==("X"); // condition for second column
        boolean conditionSix = MY_ARRAY[0][2]==("X") && MY_ARRAY[1][2]==("X") && MY_ARRAY[2][2]==("X"); // condition for third column

        boolean conditionSeven = MY_ARRAY[0][0]==("X") && MY_ARRAY[1][1]==("X") && MY_ARRAY[2][2]==("X"); // condition for diagonal left-to-right
        boolean conditionEight = MY_ARRAY[0][2]==("X") && MY_ARRAY[1][1]==("X") && MY_ARRAY[2][0]==("X"); // condition for diagonal right-to-left

        boolean finalCondition = conditionOne || conditionTwo || conditionThree || conditionFour || conditionFive || conditionSix || conditionSeven || conditionEight;

        return finalCondition;

    } // end for conditions X

    public static boolean conditionsO() {

        boolean conditionOne = MY_ARRAY[0][0]==("O") && MY_ARRAY[0][1]==("O") && MY_ARRAY[0][2]==("O"); // condition for first row
        boolean conditionTwo = MY_ARRAY[1][0]==("O") && MY_ARRAY[1][1]==("O") && MY_ARRAY[2][2]==("O"); // condition for second row
        boolean conditionThree = MY_ARRAY[2][0]==("O") && MY_ARRAY[2][1]==("O") && MY_ARRAY[2][2]==("O"); // condition for third row

        boolean conditionFour = MY_ARRAY[0][0]==("O") && MY_ARRAY[1][0]==("O") && MY_ARRAY[2][0]==("O"); // condition for first column
        boolean conditionFive = MY_ARRAY[0][1]==("O") && MY_ARRAY[1][1]==("O") && MY_ARRAY[2][1]==("O"); // condition for second column
        boolean conditionSiO = MY_ARRAY[0][2]==("O") && MY_ARRAY[1][2]==("O") && MY_ARRAY[2][2]==("O"); // condition for third column

        boolean conditionSeven = MY_ARRAY[0][0]==("O") && MY_ARRAY[1][1]==("O") && MY_ARRAY[2][2]==("O"); // condition for diagonal left-to-right
        boolean conditionEight = MY_ARRAY[0][2]==("O") && MY_ARRAY[1][1]==("O") && MY_ARRAY[2][0]==("O"); // condition for diagonal right-to-left

        boolean finalCondition = conditionOne || conditionTwo || conditionThree || conditionFour || conditionFive || conditionSiO || conditionSeven || conditionEight;

        return finalCondition;

    } // end for conditions O

    public static void printWinnerX() {
        System.out.println("X is the winner"); // Printing the winner as X
        System.exit(0); // exiting the system
    } // end for printWinnerX

    public static void printWinnerO() {
        System.out.println("O is the winner"); // Printing the winner as O
        System.exit(0); // exiting the system
    } // end for printWinnerO

}
