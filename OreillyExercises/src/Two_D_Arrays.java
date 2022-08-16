import java.util.Random;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int[][] myArray = new int[2][3];
        fillMyArray(myArray);
        multiplyByTwo(myArray);
        printMyArray(myArray);
    }

    public static void fillMyArray(int[][] myArray){

        // Generating random values
        Random random = new Random();

        // Adding random values into our arrays
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(101, 201); // 0 to 101 inclusive
            }
        }
    }

    public static void printMyArray(int[][] myArray){

        for(int[] iValues : myArray) {
            for(int rows : iValues) {
                System.out.print(rows + " ");
            } // inner for loop
            System.out.println();
        } // loop for 2-D Array
    }

    public static void multiplyByTwo(int [][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = myArray[i][j] * 2 ;
            }
        }
    }

}
