class MyRunnable implements Runnable 
{
@Override
public void run() 
{
for (int i = 1; i <= 5; i++) 
{
System.out.println(i + " executed by " + Thread.currentThread().getName());
}
}
}

public class RunnableExample 
{
public static void main(String[] args) 
{
Thread t1 = new Thread(new MyRunnable());
t1.start(); 
}
}
