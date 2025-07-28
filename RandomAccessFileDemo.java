import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("output.txt", "rw");

            file.writeUTF("Hello");

            file.seek(10);
            file.writeUTF("World");

            file.seek(0);
            System.out.println("Read 1: " + file.readUTF());

            file.seek(10);
            System.out.println("Read 2: " + file.readUTF());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
