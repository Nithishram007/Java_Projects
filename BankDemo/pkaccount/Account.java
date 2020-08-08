package BankDemo.pkaccount;

abstract public class Account {
  protected int accnumber;
  protected double balance;

    public Account(int accnumber, double balance) {
        this.accnumber = accnumber;
        this.balance = balance;
    }
}
