package pkbanking.pkinterface;

public interface Transaction {
    double min_balance = 500;
    void withdraw(double a);
    void deposit(double b);
}
