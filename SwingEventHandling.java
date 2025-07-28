import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventHandling {
    public EventHandling() {
        JFrame frame = new JFrame();

        JTextField name = new JTextField(10);
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name.setText("Welcome to event handling!!");
            }
        });

        name.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent event) {
                System.out.println(event.getKeyChar() + " pressed");
            }
        });

        name.setBounds(60, 50, 170, 20);
        button.setBounds(100, 120, 80, 30);

        frame.add(name);
        frame.add(button);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(3);
    }
}

class AdapterExample {
    public AdapterExample() {
        JFrame frame = new JFrame();
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Graphics graphics = frame.getGraphics();
                graphics.setColor(Color.BLUE);
                graphics.fillOval(e.getX(), e.getY(), 30, 40);
            }
        });

        frame.setVisible(true);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(3);
    }
}

public class SwingEventHandling {
    public static void main(String[] args) {
        new EventHandling();
        // new AdapterExample();
    }
}
