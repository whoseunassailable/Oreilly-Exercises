public class RecursionTwo {
    public static void main(String[] args) {
        countUpto(1, 11);
    }

    public static void countUpto(int valueStart, int valueEnd) {
        if (valueStart < valueEnd) {
            System.out.println(valueStart);
            valueStart++;
            countUpto(valueStart, valueEnd);
        }
    }
}
