package pkbanking.pkinterface;
import pkbanking.pkexception.*;
public interface Transaction 
{
double min_balance = 500;
void withdraw(double a)throws InsufficientFundsException;
void deposit(double amount);
}
