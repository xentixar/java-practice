import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectSerialization {
    public static void main(String[] args) {
        Student student = new Student("Ram", 21);

        try {
            FileOutputStream fileOut = new FileOutputStream("../data/student.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(student);

            out.close();
            fileOut.close();
            System.out.println("Student object written to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream("../data/student.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student rwStudent = (Student) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Read object: " + rwStudent);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
