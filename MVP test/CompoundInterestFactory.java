public class CompoundInterestFactory {
    /**
     * @param compoundInterest the type frequency of compounding the user selected
     * @return new Annual() or new Quarterly() or new SemiAnnual() or null
     */
    public static FrequencyOfCompounding solver(String compoundInterest){
        if(compoundInterest.equals("Annual")){
            return new Annual();
        }
        else if(compoundInterest.equals("Quarterly")){
            return new Quarterly();
        }
        else if(compoundInterest.equals("Semi-annual")){
            return new SemiAnnual();
        }
        else{
            return null;
        }
    }  
}
