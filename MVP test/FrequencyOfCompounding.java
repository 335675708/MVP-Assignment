import javax.swing.JOptionPane;

public abstract class FrequencyOfCompounding{
    // Atributes (values required from the user)
    double principleInvested; // 'p' value
    double interestRate; // 'i' value
    double compoundingPeriods; // 'n' value

    // Constructor
    /**
     * The constructor will ask the user for values and then any childclass will inherit the attirbutes
     */
    public FrequencyOfCompounding(){
        principleInvested = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the inital amount (Do not include a symbol)"));
        interestRate = (Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the interest rate (Do not include a symbol)")))/100.00;
        compoundingPeriods = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the compounding period (in years)"));
    }

    /**
     * Calculates and displays the future amount on a GUI
     */
    public void futureAmount(){}

    /**
     * Calculates and displays the accumulated interest on a GUI
     */
    public void accumulatedInterest(){}

    /**
     * Will change the value of the compounding periods (depending on the compounding frequency)
     * @return 0.0 
     */
    public double getNumberOfCompoundingPeriods(){
        return 0.0;
    } 

    /**
     * Will change the value of the interest rate (depending on the compounding frequency)
     * @return 0.0 
     */
    public double getUpdatedInterestRate(){
        return 0.0;
    } 
}