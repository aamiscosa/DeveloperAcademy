package Chapter9.Exercise2;

import java.text.NumberFormat;

public class PersonalAccount extends Account {
    public PersonalAccount(
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
     * Personal Accounts:
     *  For withrawals when balance is below $100, $2 is charged.
     */
    @Override
    public void withdrawal(double amt) {
        System.out.println(super.toString());
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.printf("\nWithdrawn amount is %s", money.format(amt));
        super.withdrawal(amt);
        if(this.getBalance() < 100) {
            super.withdrawal(2);
            System.out.printf("\nAdditional charge of %s as account is below minimum balance.", money.format(2));
        }
        System.out.printf("\nEnding balance is %s", money.format(this.getBalance()));
    }
}
