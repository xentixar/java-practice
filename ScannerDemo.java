import java.util.Scanner;

class ScannerDemo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("You have entered: " + text);
        scanner.close();
    }
}
