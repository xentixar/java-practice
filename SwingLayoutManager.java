import java.awt.*;
import javax.swing.*;

class BorderLayoutDemo {
    public BorderLayoutDemo() {
        JFrame frame = new JFrame("BorderLayout Example");

        frame.add(new JButton("Button East"), BorderLayout.EAST);
        frame.add(new JButton("Button West"), BorderLayout.WEST);
        frame.add(new JButton("Button North"), BorderLayout.NORTH);
        frame.add(new JButton("Button South"), BorderLayout.SOUTH);
        frame.add(new JButton("Button Center"), BorderLayout.CENTER);

        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

class FlowLayoutDemo {
    public FlowLayoutDemo() {
        JFrame frame = new JFrame("FlowLayout Example");
        JPanel panel = new JPanel();

        frame.add(panel);

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));
        panel.add(new JButton("Button 10"));
        panel.add(new JButton("Button 11"));
        panel.add(new JButton("Button 12"));
        panel.add(new JButton("Button 13"));
        panel.add(new JButton("Button 14"));
        panel.add(new JButton("Button 15"));
        panel.add(new JButton("Button 16"));
        panel.add(new JButton("Button 17"));
        panel.add(new JButton("Button 18"));
        panel.add(new JButton("Button 19"));
        panel.add(new JButton("Button 20"));

        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

class GridLayoutDemo {
    public GridLayoutDemo() {
        JFrame frame = new JFrame("GridLayout Example");

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));
        frame.add(new JButton("Button 7"));
        frame.add(new JButton("Button 8"));
        frame.add(new JButton("Button 9"));
        frame.add(new JButton("Button 10"));
        frame.add(new JButton("Button 11"));
        frame.add(new JButton("Button 12"));
        frame.add(new JButton("Button 13"));
        frame.add(new JButton("Button 14"));
        frame.add(new JButton("Button 15"));
        frame.add(new JButton("Button 16"));
        frame.add(new JButton("Button 17"));
        frame.add(new JButton("Button 18"));
        frame.add(new JButton("Button 19"));
        frame.add(new JButton("Button 20"));

        frame.setLayout(new GridLayout(0, 2));
        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

class BoxLayoutDemo {
    public BoxLayoutDemo() {
        JFrame frame = new JFrame("BoxLayout Example");

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));
        frame.add(new JButton("Button 7"));
        frame.add(new JButton("Button 8"));
        frame.add(new JButton("Button 9"));
        frame.add(new JButton("Button 10"));
        frame.add(new JButton("Button 11"));
        frame.add(new JButton("Button 12"));
        frame.add(new JButton("Button 13"));
        frame.add(new JButton("Button 14"));
        frame.add(new JButton("Button 15"));
        frame.add(new JButton("Button 16"));
        frame.add(new JButton("Button 17"));
        frame.add(new JButton("Button 18"));
        frame.add(new JButton("Button 19"));
        frame.add(new JButton("Button 20"));

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

class GridBagLayoutDemo {
    public GridBagLayoutDemo() {
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(button1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(button2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        frame.add(button3, gbc);

        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
}

class CardLayoutDemo {
    public CardLayoutDemo() {
        JFrame frame = new JFrame("CardLayout Example");

        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new CardLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        cardPanel.add(button1, "Card 1");
        cardPanel.add(button2, "Card 2");
        cardPanel.add(button3, "Card 3");

        frame.add(cardPanel);

        CardLayout cl = (CardLayout) (cardPanel.getLayout());
        cl.show(cardPanel, "Card 2");

        frame.setSize(1000, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class GroupLayoutDemo {
    public GroupLayoutDemo() {
        JFrame frame = new JFrame("GroupLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(label)
                    .addComponent(textField))
                .addComponent(submitButton)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(label)
                    .addComponent(textField))
                .addComponent(submitButton)
        );

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}

public class SwingLayoutManager {
    public static void main(String[] args) {
        // new BorderLayoutDemo();
        // new FlowLayoutDemo();
        // new GridLayoutDemo();
        // new BoxLayoutDemo();
        // new GridBagLayoutDemo();
        // new CardLayoutDemo();
        new GroupLayoutDemo();
    }
}
