package CSP014_lab_1;

import javax.swing.*;
import java.awt.event.*;

//4. Write a program using AWT to create a menubar where menubar contains menu items
// such as File, Edit, View and create a submenu under the File menu: New and Open

public class Q4_lab29_jan {
    public Q4_lab29_jan() {
        JFrame frame = new JFrame("Menu Bar Example");

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");

        // Create menu items
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");

        // Add menu items to the File menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        // Set the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Set frame size and visibility
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q4_lab29_jan());
    }
}
