/**
    @version date (in_ISO_8601 format): 2019-09-25
    @author Carly Kehoe


*/



/**
    A class for an Insufficient Funds exception, 
    extends Exception class because it's an exception.

    has one variable, shortfall, or, the amount the
    account would be overdrafted by

*/
public class InsufficientFundsException extends Exception {
    double shortfall;

    /**
        Constructor for an insufficent funds exception, takes one arg, the shortfall amount
        calls "super" from parent to throw the exception.

        @param shortfallAmt the amount the account would be overdrafted by
    */
    public InsufficientFundsException(double shortfallAmt) {
        super("Lawl ur poor");
        shortfall = shortfallAmt;
    }

    /**
        Getter method for getting the amount the account is overdrafted by.
        @return shortfall, the amount the account is overdrafted by
    */
    public double getShortfallAmount() {
        return shortfall;
    }
}