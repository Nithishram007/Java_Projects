package pkaccount.sb;
import pkbanking.pkinterface.*;
import pkaccount.*;
import pkbanking.pkexception.*;
public class SBAccount extends Account implements Transaction,InterestRate
{
public SBAccount(){}
public SBAccount(int accnumber,double init_balance)
{
super(accnumber,init_balance);
}
public void deposit(double amount)
{
if(amount >0)
{
balance+=amount;
System.out.println("Amount Credited Successfully!");
System.out.println("Balance = "+balance);
}
else
throw new IllegalArgumentException("IllegalArgumentException");
}
public void withdraw(double amount)throws InsufficientFundsException
{
if(balance - amount > min_balance)
{
balance-=amount;
System.out.println("Debited Successfull");
System.out.println("Balance = "+balance);
}
else
throw new InsufficientFundsException("Low balance");
}

public void cal_interest()
{
balance+=balance*sbrate;
System.out.println("Total amount = "+balance);
}

}