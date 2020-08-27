package pkaccount.fd;
import pkaccount.*;
import pkbanking.pkinterface.*;
public class FDAccount extends Account implements InterestRate
{
int period;
public FDAccount(int accno,int period,double amount)
{
super(accno,amount);
this.period=period;
}
public double cal_interest()
{
	return balance*fdrate;
}
public void close()
{
balance+=cal_interest();
System.out.println("----------FD account closed-----------");
System.out.println("Total amount = "+balance);
}
}