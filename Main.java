class Singleton 
{
private static Singleton singleInstance;
private Singleton() 
{
System.out.println("Singleton instance created!");
}
public static Singleton getInstance() 
{
if (singleInstance == null) 
{
singleInstance = new Singleton();
}
return singleInstance;
}
public void showMessage() 
{
System.out.println("Hello from Singleton!");
}
}
public class Main 
{
public static void main(String[] args) 
{
Singleton obj1 = Singleton.getInstance();
obj1.showMessage();
Singleton obj2 = Singleton.getInstance();
if (obj1 == obj2) 
{
System.out.println("Both objects are the same instance!");
} 
else 
{
System.out.println("Different instances created!");
}
}
}