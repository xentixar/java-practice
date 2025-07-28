public class Arrays {
    private int numbers[];
    private static int buffer_size = 100;

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.numbers = new int[buffer_size];

        for (int i = 0; i < buffer_size; i++) {
            arrays.numbers[i] = (int) (Math.random() * buffer_size);
        }

        for (int i = 0; i < buffer_size; i++) {
            System.err.println(arrays.numbers[i]);
        }
    }
}
