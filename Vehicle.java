public class Vehicle
{
public void applyBrake()
{
System.out.println("Brake Applied");
}
public void applyHorn()
{
System.out.println("Horn Applied");
}
public static void main(String[] args)
{
Vehicle veh=new Vehicle();
veh.applyBrake();
veh.applyHorn();
}
}
