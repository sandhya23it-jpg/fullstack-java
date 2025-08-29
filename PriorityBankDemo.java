class BankAccount 
{
private int balance = 1000;
public synchronized void withdraw(String name, int amount)
{
if (balance >= amount) 
{
System.out.println(name + " is trying to withdraw " + amount);
try 
{
Thread.sleep(300);
} 
catch (InterruptedException e) 
{
e.printStackTrace();
}
balance -= amount;
System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
} 
else 
{
System.out.println(name + " tried to withdraw " + amount + " but insufficient balance!");
}
}
}
class Customer extends Thread
{
BankAccount account;
int amount;
Customer(BankAccount account, String name, int amount, int priority) 
{
super(name);
this.account = account;
this.amount = amount;
this.setPriority(priority); 
}
public void run() {
System.out.println(getName() + " has priority: " + getPriority()); 
account.withdraw(getName(), amount);
}
}
public class PriorityBankDemo
{
public static void main(String[] args)
{
BankAccount account = new BankAccount();
Customer c1 = new Customer(account, "Alice", 600, Thread.MAX_PRIORITY);
Customer c2 = new Customer(account, "Bob", 400, Thread.NORM_PRIORITY);  
Customer c3 = new Customer(account, "Charlie", 300, Thread.MIN_PRIORITY); 
System.out.println("Assigned Priorities:");
System.out.println("Alice: " + c1.getPriority());
System.out.println("Bob: " + c2.getPriority());
System.out.println("Charlie: " + c3.getPriority());
c1.start();
c2.start();
c3.start();
}
}

