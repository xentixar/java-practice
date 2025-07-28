import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

abstract class MenuAdapter implements MenuListener {
    @Override
    public void menuSelected(MenuEvent e) {
    }

    @Override
    public void menuDeselected(MenuEvent e) {
    }

    @Override
    public void menuCanceled(MenuEvent e) {
    }
}

class Components {

    public Components() {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);
        textField.setText("Hello world");
        textField.setEditable(false);

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setText("Random texts");

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setActionCommand("ok");
        passwordField.setToolTipText("Please enter your password!!");

        JLabel label = new JLabel("Random Label");

        JCheckBox checkBox = new JCheckBox("Married");

        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");

        maleRadioButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Male Selected"));
        femaleRadioButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Female Selected"));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);

        String countries[] = { "Nepal", "India", "Aus", "USA" };
        JComboBox comboBox = new JComboBox<String>(countries);

        JSlider slider = new JSlider();

        JMenuBar menuBar = new JMenuBar();
        JMenu homeMenu = new JMenu("Home");
        JMenu aboutMenu = new JMenu("About");
        JMenu contactMenu = new JMenu("Contact");
        JMenu loginMenu = new JMenu("Login");
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("Nepali");
        JRadioButtonMenuItem maleRadioButtonMenuItem = new JRadioButtonMenuItem("Male");
        JRadioButtonMenuItem femaleRadioButtonMenuItem = new JRadioButtonMenuItem("Female");
        JMenuItem aboutCompany = new JMenuItem("Company");
        JMenuItem aboutTeam = new JMenuItem("Team");

        aboutMenu.add(aboutCompany);
        aboutMenu.add(aboutTeam);

        ButtonGroup menuButtonGroup = new ButtonGroup();
        menuButtonGroup.add(maleRadioButtonMenuItem);
        menuButtonGroup.add(femaleRadioButtonMenuItem);

        menuBar.add(homeMenu);
        menuBar.add(aboutMenu);
        menuBar.add(contactMenu);
        menuBar.add(loginMenu);
        menuBar.add(checkBoxMenuItem);
        menuBar.add(maleRadioButtonMenuItem);
        menuBar.add(femaleRadioButtonMenuItem);

        loginMenu.setEnabled(false);
        homeMenu.setMnemonic('H');

        homeMenu.addMenuListener(new MenuAdapter() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(frame, "Home Selected");
            }
        });

        // aboutMenu.addMenuListener(new MenuAdapter() {
        // @Override
        // public void menuSelected(MenuEvent e) {
        // JOptionPane.showMessageDialog(frame, "About Selected");
        // }
        // });

        contactMenu.addMenuListener(new MenuAdapter() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(frame, "Contact Selected");
            }
        });

        loginMenu.addMenuListener(new MenuAdapter() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(frame, "Login Selected");
            }
        });

        aboutTeam.addActionListener(e -> JOptionPane.showMessageDialog(frame, "About Team Selected"));

        checkBoxMenuItem.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Nepali Language Selected"));

        aboutTeam.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.SHIFT_DOWN_MASK));

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(fileChooser);
        if (result == 0) {
            File selectedFile = fileChooser.getSelectedFile();
            label.setText(selectedFile.getAbsolutePath());
        }

        frame.add(textField);
        frame.add(textArea);
        frame.add(passwordField);
        frame.add(label);
        frame.add(checkBox);

        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);

        frame.add(comboBox);
        frame.add(slider);

        frame.setJMenuBar(menuBar);

        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 800);
        frame.setVisible(true);
    }
}

public class SwingComponent {
    public static void main(String[] args) {
        new Components();
    }
}
