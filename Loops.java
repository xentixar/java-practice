public class Loops {
    public static void main(String[] args) {
        int numbers[] = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
