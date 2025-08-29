public class LearnMethods
{
public void makeCall()
{
System.out.println("Make Call");
}
public void sendSms()
{
System.out.println("Send Sms");
}
public static void main(String[] args)
{
System.out.println("Main method");
LearnMethods phone= new LearnMethods();
phone.makeCall();
phone.sendSms();
}
}
