import pkcustomer.Customer;

import java.util.Scanner;

public class BankDemo {
    public static void main(String[] arg) {
        Customer[] customer = new Customer[5];
        int t2, t3, i = 0, t1;
        String name, address;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Transaction");
            System.out.println("3. Exit");
            System.out.println("Enter your choice :");
            t1 = scanner.nextInt();
            switch (t1) {
                case 1:
                    System.out.println("1. SB Account");
                    System.out.println("2. FD Account");
                    t2 = scanner.nextInt();
                    System.out.println("Enter your name :");
                    name = scanner.next();
                    System.out.println("Enter your address :");
                    address = scanner.next();
                    try {
                        customer[i] = new Customer(i, name, address);
                        customer[i++].createAccount(t2);
                    } catch (Exception e)
                    {
                        System.out.println("Customer Limit Over!!");
                        t1=3;
                    }
                    break;

                case 2:
                    try {
                        System.out.println("1. Withdraw");
                        System.out.println("2. Deposit");
                        System.out.println("3. Calculate Interest");
                        System.out.println("4. FD close");
                        System.out.println("Enter your choice :");
                        t3 = scanner.nextInt();
                        System.out.println("Enter Customer id :");
                        int cust_id = scanner.nextInt();
                        if (t3 == 4) {
                            customer[cust_id - 1].transaction(t3);
                            customer[cust_id - 1] = null;
                        } else
                            customer[cust_id - 1].transaction(t3);
                        break;
                    } catch (Exception e) {
                        System.out.println("You do not have such account");

                    }

                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (t1 != 3);

    }
}

