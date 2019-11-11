/**
    @version date (in_ISO_8601 format): 2019-09-25
    @author Carly Kehoe
*/


/**
    A class to create a bank account and withdraw and deposit funds into 
    the account

    A bank account has two variables: accountBalance(the balance in the
    account), and account(the account number)
*/
public class BankAccount {
    private double accountBalance;
    private int account;

    /**
        Constructor for a new bank account, sets account ID and the starting balance
        to 0

        @param accountID the account ID number
    */
    public BankAccount(int accountID) {
        account = accountID;
        accountBalance = 0.0;
    }

    /**
        Getter method for the account number

        @return the account number
    */
    public int getAccountNumber() {
        return account;
    }

    /**
        Getter method for getting the account balance

        @return the balance of the account
    */
    public double getAccountBalance() { 
        return accountBalance;
    }

    /**
        Method to add money to the account

        @param deposit the amount to be deposited in the 
        account
    */
    public void depositFunds(double deposit) {
        accountBalance += deposit;
    }

    /**
        Method to withdraw funds from the account, if the account balance
        minus the withdrawal amount is less than 0, throw an InsufficientFunds exception

        @param withdrawal the amount to withdraw from the account
    */
    public void withdrawFunds(double withdrawal) throws InsufficientFundsException {
        if ( accountBalance - withdrawal < 0) {
            throw new InsufficientFundsException
            (Math.abs((accountBalance - withdrawal)));
        }
        else {
            accountBalance -= withdrawal;
        }
    }
}