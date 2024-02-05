package CSP014_lab_1;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SecondGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        JPanel buttonPanel = new JPanel();
        JButton nextButton = new JButton("Next");// creating next button through which we will move to next card.
        buttonPanel.add(nextButton);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);// placing the next button in bottom of the layout
        final JPanel cardPanel = new JPanel();
        final CardLayout cardLayout = new CardLayout(); // creating card layout
        /* final CardLayout cardLayout = new CardLayout(30,30); creating card layout with     vertical gap= 30 and horizontal gap= 30. */
        cardPanel.setLayout(cardLayout);
        for (int i = 1; i <= 5; i++) { // craeting 5 cards
            JButton card = new JButton("Card " + i);
            card.setPreferredSize(new Dimension(500, 500));
            String cardName = "card" + 1;
            cardPanel.add(card, cardName);
        }
        contentPane.add(cardPanel, BorderLayout.CENTER);
        nextButton.addActionListener(e -> cardLayout.next(cardPanel)); //adding action to next button.
        frame.pack();
        frame.setVisible(true);
    }
}
