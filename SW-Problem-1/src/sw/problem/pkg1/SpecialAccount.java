/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw.problem.pkg1;

/**
 * Special account class inherits from the account class
 *
 * @author Marwan Mohamed Abd Almonem
 * @version 0.1
 */
public class SpecialAccount extends Account {

    /**
     * a parameterized constructor for the class.
     *
     * @param Balance Description text text text.
     * @param Account_Number Description text text text.
     */
    public SpecialAccount(double Balance, int Account_Number) {
        super(Balance, Account_Number);
    }

    /**
     * a function to withdraw an amount of money.
     * <p>
     * first if condition is used to check if the balance is equal to -1000. if
     * the balance after withdrawing is less than -1000 then it will print error
     * massage. if the money within the range then it will withdraw.
     * <p>
     *
     * @param amount the amount of money the user want to withdraw.
     */
    @Override
    public void withdraw(double amount) {
        if (this.getBalance() == -1000) {
            System.out.println("You do not have Balance to withdraw ");
        } else {
            double balance = this.getBalance();
            balance -= amount;
            if (balance < -1000) {
                System.out.println("Your maximum amount to withdraw is " + (this.getBalance() + 1000));
            } else {
                this.setBalance(balance);
                System.out.println("Your balance after withdrawing " + amount + " = " + balance);
            }
        }

    }

}
