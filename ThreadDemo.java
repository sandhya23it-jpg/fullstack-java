import java.lang.*;
class ThreadDemo extends Thread
{
public void run()
{
System.out.println("Inside run method");
}
public static void main(String[] args)
{
Thread.currentThread().setPriority(6);
System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
ThreadDemo t1 = new ThreadDemo();
System.out.println("t1 thread priority: " + t1.getPriority());
}
}
