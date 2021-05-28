package sw.problem.pkg1;

/**
 * The Account class
 *
 * @author Marwan Mohamed Abd Almonem
 * @version 0.1
 */
public class Account {

    /**
     * The balance of money in the account.
     */
    private double Balance;
    /**
     * The ID number of the account.
     */
    private int Account_Number;

    /**
     * string function to print the account info.
     *
     * @return account info which is balance and account number.
     */
    @Override
    public String toString() {
        return "Account{" + "Balance=" + Balance + ", Account_Number=" + Account_Number + '}';
    }

    /**
     * a parameterized constructor for the class.
     *
     * @param Balance amount of money in the account.
     * @param Account_Number the number of the account.
     */
    public Account(double Balance, int Account_Number) {
        this.Balance = Balance;
        this.Account_Number = Account_Number;
    }

    /**
     * a getter function to get the balance.
     *
     * @return the balance of the account.
     */
    public double getBalance() {
        return Balance;
    }

    /**
     * a setter function to set the balance.
     *
     * @param Balance amount of money in the account.
     */
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    /**
     * a getter function to get the account number.
     *
     * @return the number of the account.
     */
    public int getAccount_Number() {
        return Account_Number;
    }

    /**
     * a setter function to set the number of the account.
     *
     * @param Account_Number number of the account.
     */
    public void setAccount_Number(int Account_Number) {
        this.Account_Number = Account_Number;
    }

    /**
     * a function to withdraw an amount of money.
     * <p>
     * first if condition is used to check if there is no money in the account.
     * second if condition is used to check if the amount is greater than the
     * balance. if the two conditions are not met then the amount would be
     * withdrew successfully.
     * <p>
     *
     * @param amount the amount of money the user want to withdraw.
     */
    public void withdraw(double amount) {
        if (Balance == 0) {
            System.out.println("Your balance = 0, you have nothing to withdraw");
        } else if (amount > Balance) {
            System.out.println("The maximum amount to withdraw is " + Balance);
        } else {
            Balance = Balance - amount;
            System.out.println("Your balance after withdrawing " + amount + " = " + Balance);
        }

    }

    /**
     * a function to deposit an amount of money. (1)
     * <p>
     * the amount of money that is inserted is added to the balance then display
     * the new balance.
     * <p>
     *
     * @param amount the amount of money the user want to deposit.
     */
    public void deposit(double amount) {
        Balance += amount;
        System.out.println("Your balance after depositing " + amount + " = " + Balance);
    }

}
