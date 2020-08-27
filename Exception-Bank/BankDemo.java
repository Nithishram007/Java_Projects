import java.util.*;
import pkcustomer.*;
class BankDemo
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
Customer c[]=new Customer[5];
int i=0;
int type,cid,ch=0,choice;
do
{
System.out.println("1. Create account");
System.out.println("2. Transaction");
System.out.println("3. Exit");
System.out.print("Enter your choice : ");
type=sc.nextInt();
switch(type)
{
case 1:
System.out.println("1. SB Account");
System.out.println("2. FD Account");
System.out.println("Enter your choice");
ch=sc.nextInt();
System.out.println("Enter name & address :");
String name=sc.next();
String address=sc.next();
try
{
c[i]=new Customer(i,name,address);
c[i++].createAccount(ch);
}catch (Exception e)
{
 System.out.println("Customer Limit Over!!");
 type=3;
}
break;
case 2:
try
{
System.out.println("1. SB Withdraw");
System.out.println("2. SB Deposit");
System.out.println("3. SB Calculate interest");
System.out.println("4. FD Closing account");
System.out.println("Enter choice");
choice=sc.nextInt();
System.out.println("Enter Customer id ");
cid=sc.nextInt();
if(choice == 4)
{
c[cid-1].transaction(choice);
c[cid-1]=null;
}
else
c[cid-1].transaction(choice);
break;
}catch(Exception e)
{
System.out.println("You do not have such Account");
}
case 3:
break;
default :
System.out.println("Invalid choice");
}
}while(type!=3);
}
}
