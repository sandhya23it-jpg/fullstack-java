import java.util.*;
import java.util.stream.*;
interface Account 
{
int getAccountNumber();
String getHolderName();
double getBalance();
void deposit(double amount);
}
class SavingsAccount implements Account 
{
private int accountNumber;
private String holderName;
private double balance;
public SavingsAccount(int accountNumber, String holderName, double balance) 
{
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
}
@Override
public int getAccountNumber() 
{
return accountNumber;
}
@Override
public String getHolderName() 
{
return holderName;
}
@Override
public double getBalance()
{
return balance;
}
@Override
public void deposit(double amount) 
{
balance += amount;
}
@Override
public String toString() 
{
return "SavingsAccount{" +
"AccNo=" + accountNumber +
", Name='" + holderName + '\'' +
", Balance=" + balance +
'}';
}
}
class CurrentAccount implements Account 
{
private int accountNumber;
private String holderName;
private double balance;
public CurrentAccount(int accountNumber, String holderName, double balance) 
{
this.accountNumber = accountNumber;
this.holderName = holderName;
this.balance = balance;
}
@Override
public int getAccountNumber() 
{
return accountNumber;
}
@Override
public String getHolderName() 
{
return holderName;
}
@Override
public double getBalance() 
{
return balance;
}
@Override
public void deposit(double amount) 
{
balance += amount;
}
@Override
public String toString() {
return "CurrentAccount{" +
"AccNo=" + accountNumber +
", Name='" + holderName + '\'' +
", Balance=" + balance +
'}';
}
}
class AccountFactory 
{
public static Account createAccount(String type, int accNo, String name, double balance) 
{
if ("SAVINGS".equalsIgnoreCase(type)) 
{
return new SavingsAccount(accNo, name, balance);
} 
else if ("CURRENT".equalsIgnoreCase(type)) 
{
return new CurrentAccount(accNo, name, balance);
}
throw new IllegalArgumentException("Unknown account type: " + type);
}
}
public class DesignPattern 
{
public static void main(String[] args) 
{
List<Account> accounts = Arrays.asList(
AccountFactory.createAccount("SAVINGS", 101, "Alice", 5000),
AccountFactory.createAccount("CURRENT", 102, "Bob", 3000),
AccountFactory.createAccount("SAVINGS", 103, "Charlie", 7000),
AccountFactory.createAccount("CURRENT", 104, "Diana", 2000)
);
System.out.println("Initial Accounts:");
accounts.forEach(System.out::println);
accounts.stream().forEach(acc -> acc.deposit(1000));
System.out.println("\nAfter Depositing 1000 into Each Account:");
accounts.forEach(System.out::println);
System.out.println("\nAccounts with balance > 6000:");
accounts.stream()
.filter(acc -> acc.getBalance() > 6000)
.forEach(System.out::println);
double totalBalance = accounts.stream()
.map(Account::getBalance)
.reduce(0.0, Double::sum);
System.out.println("\nTotal Balance in Bank: " + totalBalance);
}
}
