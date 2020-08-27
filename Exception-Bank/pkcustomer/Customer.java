package pkcustomer;
import pkaccount.sb.*;
import pkaccount.fd.*;
import java.util.*;
import pkbanking.pkexception.*;
public class Customer
{
public int cust_id;
public String name;
public String address;

static int sbacc=1000;
static int fdacc=10000;
Scanner sc=new Scanner(System.in);
SBAccount sba;
FDAccount fda;

public Customer()
{
}
public Customer(int cust_id,String name,String address)
{
this.cust_id=cust_id;
this.name=name;
this.address=address;
}
public void createAccount(int type)
{
if(type == 1)
{
System.out.println("Enter Initial amount :");
double sbamt=sc.nextDouble();
sba=new SBAccount(sbacc,sbamt);
System.out.println("------------SBAccount Created successfully------------");
System.out.println("Customer id   = "+(cust_id+1));
System.out.println("Customer Name = "+name);
}
else
{
System.out.println("Enter amount :");
double fdamt=sc.nextDouble();
System.out.println("Enter period :");
int period=sc.nextInt();
fda=new FDAccount(fdacc,period,fdamt);
System.out.println("-------------FDAccount Created successfully------------");
System.out.println("Customer id   = "+(cust_id+1));
System.out.println("Customer Name = "+name);
System.out.println("Period 	      = "+period+" years");

}
}

public void transaction(int type)
{
if(type==1)
{
System.out.println("Enter amount :");
double amount=sc.nextDouble();
try
{
sba.withdraw(amount);
}catch(InsufficientFundsException e)
{
	System.out.println(e);
}
}
else if(type==2)
{
System.out.println("Enter amount :");
double amt=sc.nextDouble();
try
{
sba.deposit(amt);
}catch(IllegalArgumentException e)
{
	System.out.println(e.getMessage());
}
}
else if(type==3)
{
sba.cal_interest();
}
else if(type==4)
{
fda.close();
}
}
}

