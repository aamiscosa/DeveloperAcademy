package Chapter9.Exercise2;

import java.text.NumberFormat;

public class BusinessAccount extends Account {
    public BusinessAccount(
        double bal,
        String fName,
        String lName,
        String str,
        String city,
        String st,
        String zip) {
        super(bal, fName, lName, str, city, st, zip);
    }

    /**
     * A withdrawal is made from the account if there is enough money.
     * pre: none
     * post: The balance has been decreased by the amount withdrawn.
     * 
     * Business Accounts:
     *  For withrawals when balance is below $500, $10 is charged.
     */
    @Override
    public void withdrawal(double amt) {
        System.out.println(super.toString());
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.printf("\nWithdrawn amount is %s", money.format(amt));
        super.withdrawal(amt);
        if(this.getBalance() < 500) {
            super.withdrawal(10);
            System.out.printf("\nAdditional charge of %s as account is below minimum balance.", money.format(10));
        }
        System.out.printf("\nEnding balance is %s", money.format(this.getBalance()));
    }
}
