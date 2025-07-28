import javax.swing.*;

public class Swing {
    public Swing() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Start");
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Swing();
    }
}