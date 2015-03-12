package week7;

public class PaymentFacade {
private int bankID,custID,payeeID;
public PaymentFacade(int i,int j,int k)
{
bankID = i;
custID = j;
payeeID = k;
System.out.println("Made payment facade");
}
public void makePayment()
{
System.out.println("Making payment");
BankAccount b = new BankAccount(bankID);
Customer c = new Customer(custID);
Payee p = new Payee(payeeID);
}
}
