package CSP014_lab_1;

import java.awt.*;      //AWT (Abstract Window Toolkit)
import javax.swing.*;   //javax.swing for GUI components,
                        // here's an example using JFrame, JLabel, JButton, and JTextField with BorderLayout


/*  extends JFrame
    The extends JFrame part of a class declaration in Java indicates that the class is inheriting from the JFrame class.
    The JFrame class is part of the Swing framework,
    which provides components for creating graphical user interfaces (GUIs) in Java.    */

/*Inheritance of Functionality: By extending JFrame, your class inherits all the methods and properties of the JFrame class.
 This includes methods for managing the frame's layout, handling events, and controlling its visibility.*/

public class Q1_lab_15_jan extends JFrame{
    public Q1_lab_15_jan() {
        setTitle("User Information Form");
        setLayout(new FlowLayout());

        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameTextField = new JTextField(20);

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameTextField = new JTextField(20);

        JLabel dobLabel = new JLabel("Date of Birth:");
        JTextField dobTextField = new JTextField(10);

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        add(firstNameLabel);
        add(firstNameTextField);
        add(lastNameLabel);
        add(lastNameTextField);
        add(dobLabel);
        add(dobTextField);
        add(submitButton);
        add(clearButton);
        add(exitButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
//        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q1_lab_15_jan());
    }
}
