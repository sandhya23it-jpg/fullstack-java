public class LearnAccessModifier1
{
public void depositAmount()
{
System.out.println("5000");
}
private void atmPin()
{
System.out.println("12XX");
}
void knowsAtmPin()
{
System.out.println("1234");
}
public static void main(String[] args)
{
LearnAccessModifier1 access=new LearnAccessModifier1();
access.depositAmount();
access.atmPin();
access.knowsAtmPin();
}
}