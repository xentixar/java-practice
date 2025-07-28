public class ClassDemo {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(0, 0));
    }
}

class Calculator{
    protected static int sum(int x, int y) {
        return x + y;
    }
}