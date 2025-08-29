class Bank
{
private int balance = 5000;
public synchronized void showBalance()
{
System.out.println(Thread.currentThread().getName() + " checking balance: " + balance);
}
}
class BalanceWorker extends Thread 
{
private Bank bank;
public BalanceWorker(Bank bank) 
{
this.bank = bank;
}

public void run()
{
bank.showBalance();
}
}
public class CheckBalance
{
public static void main(String[] args)
{
Bank myBank = new Bank();
Thread t1 = new BalanceWorker(myBank);
Thread t2 = new BalanceWorker(myBank);
t1.setName("Worker1");
t2.setName("Worker2");
t1.start();
t2.start();
}
}