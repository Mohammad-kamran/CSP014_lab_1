package CSP014_lab_1;
import javax.swing.*;
import java.awt.*;
public class Q3_lab_15_jan extends JFrame{
    public Q3_lab_15_jan() {
        setTitle("BorderLayout Example");
        setLayout(new BorderLayout());

        // Create label, button, and text field
        JLabel label = new JLabel("North Region (Label)");
        JButton button = new JButton("South Region (Button)");
        JTextField textField = new JTextField("Center Region (Text Field)");

        // Add components to the frame with specified regions
        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        add(textField, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q3_lab_15_jan());
    }
}
