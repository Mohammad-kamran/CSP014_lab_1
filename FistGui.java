package CSP014_lab_1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FistGui {
    public static void main (String[] args){

        Frame frame = new Frame("Basic Program");
        Label label = new Label("Hello world");

        // Align the label to the center
        label.setAlignment(Label.CENTER);
        //Adding Label and setting
        //the size of the frame

        frame.add(label);
        //set the height and width of the frame
        frame.setSize(300,300);

        // Making the Frame visible
        frame.setVisible(true);

        // Using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
