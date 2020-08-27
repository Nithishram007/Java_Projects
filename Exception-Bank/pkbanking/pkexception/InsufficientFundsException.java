package pkbanking.pkexception;
public class InsufficientFundsException extends Exception
{
String description;
public InsufficientFundsException()
{
}
public InsufficientFundsException(String a)
{
super(a);
description = a;
}

public String toString()
{
return "InsufficientFundsException : "+description;
}
}

