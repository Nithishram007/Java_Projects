package BankDemo.pkaccount.fd;

import BankDemo.pkaccount.Account;
import BankDemo.pkbanking.pkinterface.InterestRate;

public class FDAccount extends Account implements InterestRate {
int period;

    public FDAccount(int accnumber,int period , double balance) {
        super(accnumber, balance);
        this.period = period;
    }

    public double calc_interest()
    {
        return(balance+=balance*fdrate);
    }
    public void close()
    {
        balance+=calc_interest();
    }


}
