import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class SemiAnnual extends FrequencyOfCompounding {
    
    /**
     * The compounding period value will be multiplied by 2
     * @return compoundingPeriods
     */
    public double getNumberOfCompoundingPeriods(){
        return compoundingPeriods*2;
    } 

    /**
     * The interest rate value will be divided by 2
     * @return interestRate
     */
    public double getUpdatedInterestRate(){
        return interestRate/2;
    } 

    /**
     * Displays the future amount on a GUI
     */
    public void futureAmount(){
        DecimalFormat dFormatter = new DecimalFormat("0.00");
        // The calculation
        double answer1 = 1 + getUpdatedInterestRate();
        double answer2 = Math.pow(answer1,getNumberOfCompoundingPeriods());
        double answer3 = principleInvested*answer2;
        // Rounds the decimal to the nearest hundredth
        String finalAnswer = dFormatter.format(answer3);
    
        // The GUI
        JLabel label;
        JFrame frame;
        JPanel panel;
        frame = new JFrame(); // Create a JFrame object
        label = new JLabel("After investing $" + principleInvested + " for " + compoundingPeriods + " years, at an interest rate of " + (interestRate)*100 + "% that is compounded semi annually, your total amount is $" + finalAnswer);
        panel = new JPanel(); // Create a JPanel object
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);  // Add the pannel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set what happens when they close the frame
        frame.setTitle("Total future amount"); // Set title of the window
        frame.pack(); // Set the window to match a certian size
        frame.setVisible(true); // Set the windoe to be visible and be in focus
    }

    /**
     * Displays the accumulated interest on a GUI
     */
    public void accumulatedInterest(){
        DecimalFormat dFormatter = new DecimalFormat("0.00");
        // The calculation
        double answer1 = 1 + getUpdatedInterestRate();
        double answer2 = Math.pow(answer1,getNumberOfCompoundingPeriods());
        double answer3 = principleInvested*answer2; 
        double answer4 = answer3 - principleInvested;
        // Rounds the decimal to the nearest hundredth
        String finalAnswer = dFormatter.format(answer4);

        // The GUI
        JLabel label;
        JFrame frame;
        JPanel panel;
        frame = new JFrame(); // Create a JFrame object
        label = new JLabel("The interest accumulated is $" + finalAnswer);
        panel = new JPanel(); // Create a JPanel object
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100)); 
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);  // Add the pannel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set what happens when they close the frame
        frame.setTitle("Interest accumulated"); // Set title of the window
        frame.pack(); // Set the window to match a certian size
        frame.setVisible(true); // Set the windoe to be visible and be in focus
    }
}
