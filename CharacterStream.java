import java.io.*;

public class CharacterStream {
    public static void main(String[] args) {
        try {

            FileReader inputStream = new FileReader("../data/input.txt");
            FileWriter outputStream = new FileWriter("../data/output.txt");

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
