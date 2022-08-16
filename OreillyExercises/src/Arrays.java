public class Arrays {
    public static void main(String[] args) {
        int[] data = new int[10];

        for (int i = 0; i < 10; i++) {
            data[i] = i + 1;
        }

        for(int values : data) {
            System.out.println(values);
        }
    }
}
