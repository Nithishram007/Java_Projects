package pkcustomer;

import pkaccount.fd.FDAccount;
import pkaccount.sb.SBAccount;

import java.util.Scanner;

public class Customer {
    int cust_id;
    String name;
    String address;
    SBAccount sba;
    FDAccount fda;
    static int sbacc=10000;
    static int fdacc=1000;
    Scanner scanner=new Scanner(System.in);
    public Customer(int cust_id, String name, String address) {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
    }
    public void createAccount(int type)
    {
        if(type==1)
        {
            System.out.println("Enter amount :");
            double amt =  scanner.nextDouble();
            sba=new SBAccount(sbacc,amt);

        }
        else
        {
            System.out.println("Enter amount :");
            double amount=scanner.nextDouble();
            System.out.println("Enter period :");
            int period=scanner.nextInt();
            fda=new FDAccount(fdacc,period,amount);
        }

    }
    public void transaction(int type)
    {
        if(type == 1)
        {
            System.out.println("Enter amount :");
            double amount=scanner.nextDouble();
            sba.withdraw(amount);
        }
        else if(type == 2)
        {
            System.out.println("Enter amount :");
            double amt=scanner.nextDouble();
            sba.deposit(amt);
        }
        else if(type == 3)
            sba.calc_interest();

        else
            fda.close();

    }
}
