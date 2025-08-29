class BankAccount 
{
private int balance;
public BankAccount(int initialBalance) 
{
this.balance = initialBalance;
}
public synchronized void deposit(int amount, String depositor) 
{
System.out.println(depositor + " is depositing: " + amount);
int newBalance = balance + amount;
try 
{
Thread.sleep(500);
} 
catch (InterruptedException e) 
{
System.out.println("Thread interrupted");
}
balance = newBalance;
System.out.println(depositor + " completed deposit. New Balance = " + balance);
}
}
class Deposit extends Thread
{
private BankAccount account;
private int amount;
private String depositor;
public Deposit(BankAccount account, int amount, String depositor) 
{
this.account = account;
this.amount = amount;
this.depositor = depositor;
}
@Override
public void run()
{
account.deposit(amount, depositor);
}
}
public class DepositThread
{
public static void main (String[] args)
{
BankAccount account = new BankAccount(1000);
Deposit d1 = new Deposit(account, 500, "Alice");
Deposit d2 = new Deposit(account, 700, "Bob");
d1.start();
d2.start();
}
}
