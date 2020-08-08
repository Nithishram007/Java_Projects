package BankDemo.pkaccount.sb;

import BankDemo.pkaccount.Account;
import BankDemo.pkbanking.pkinterface.InterestRate;
import BankDemo.pkbanking.pkinterface.Transaction;

public class SBAccount extends Account implements Transaction, InterestRate {

    public SBAccount(int accnumber, double balance) {
        super(accnumber, balance);
    }

    @Override
    public void withdraw(double amt) {
        if(balance-amt>min_balance)
        {
            balance-=amt;
            System.out.println("Debited successfully");
            System.out.println("Balance="+balance);
        }
        else
            System.out.println("Low balance");
    }

    @Override
    public void deposit(double amt) {
        if(balance>0)
        {
            balance+=amt;
            System.out.println("Amount Credited Successfully !");
            System.out.println("Balance="+balance);
        }
        else
            System.out.println("Invalid amount");
    }
    public void calc_interest()
    {
        balance+=balance*sbrate;
        System.out.println("Total amount="+balance);
    }

}
