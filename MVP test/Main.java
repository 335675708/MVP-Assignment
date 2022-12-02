import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        // GUI that shows the option for frequency of compounding (annual, monthly, etc)
        new Options();
        // The user will choose what compounding frequency they want to use
        String compoundInterest = JOptionPane.showInputDialog(null, "What is the compounding frequencies (Choose from one of the options from the top left window)");
        FrequencyOfCompounding choice=null;
        // Creates the object
        choice = CompoundInterestFactory.solver(compoundInterest);
        // Prints out the future amount and accumulated interest on two separate GUI 
        choice.futureAmount();
        choice.accumulatedInterest();
    }
}
