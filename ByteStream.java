import java.io.*;

public class ByteStream {
    public static void main(String[] args) {
        try {

            FileInputStream inputStream = new FileInputStream("../data/input.txt");
            FileOutputStream outputStream = new FileOutputStream("../data/output.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.println(c);
                outputStream.write(c);
            }

            inputStream.close();
            outputStream.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
