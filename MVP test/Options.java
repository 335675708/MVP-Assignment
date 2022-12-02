import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Options{
    // The attriubtes of the GUI
    JLabel label0;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JFrame frame;
    JPanel panel;

    /**
     * Creates a GUI that will show the user the options for the Frequency of Compounding
     */
    public Options(){
        frame = new JFrame(); // Create a JFrame object
        label0 = new JLabel("Frequency of Compounding: ");
        label1 = new JLabel("   - Annual");
        label2 = new JLabel("   - Semi-annual"); 
        label3 = new JLabel("   - Quarterly"); 

        panel = new JPanel(); // Create a JPanel object
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); // Top, bottom, left, right in pixels
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label0);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.add(panel, BorderLayout.CENTER);  // Add the pannel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set what happens when they close the frame
        frame.setTitle("Frequency of Compounding options"); // Set title of the window
        frame.pack(); // Set the window to match a certian size
        frame.setVisible(true); // Set the windoe to be visible and be in focus
    }
}
