package CSP014_lab_1;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q2_lab_15_jan extends JFrame {
    //2. Write a java program to create a frame containing three buttons (Yes, No, Close).
    // When button yes or no is pressed, the message "Button Yes/No is pressed" gets displayed in label control.
    // On pressing the CLOSE button frame window gets closed.

    private JLabel messageLabel;

    public Q2_lab_15_jan() {
        setTitle("Button Click Example");
        setLayout(new FlowLayout());

        // Create buttons
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");
        JButton closeButton = new JButton("Close");

        // Create label
        messageLabel = new JLabel("Press a button");

        // Add buttons and label to the frame
        add(yesButton);
        add(noButton);
        add(closeButton);
        add(messageLabel);

        // Add action listeners to the buttons
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Button Yes is pressed");
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Button No is pressed");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the frame
                dispose();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q2_lab_15_jan());
    }

    public static class MenuBarExample {
        public MenuBarExample() {
            Frame frame = new Frame("Menu Bar Example");

            // Create the menu bar
            MenuBar menuBar = new MenuBar();

            // Create menus
            Menu fileMenu = new Menu("File");
            Menu editMenu = new Menu("Edit");
            Menu viewMenu = new Menu("View");

            // Create menu items
            MenuItem newMenuItem = new MenuItem("New");
            MenuItem openMenuItem = new MenuItem("Open");

            // Add menu items to the File menu
            fileMenu.add(newMenuItem);
            fileMenu.add(openMenuItem);

            // Add menus to the menu bar
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(viewMenu);

            // Set the menu bar to the frame
            frame.setMenuBar(menuBar);

            // Set frame size and visibility
            frame.setSize(400, 300);
            frame.setLayout(null);
            frame.setVisible(true);

            // Handle window close event
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
        }

        public static void main(String[] args) {
            new MenuBarExample();
        }
    }
}
