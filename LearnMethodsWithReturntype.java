public class LearnMethodsWithReturntype
{
public String takePhoto()
{
return "png";
}
public int browserVersion()
{
return 21;
}
public boolean isCameraAvailable()
{
return true;
}
public static void main(String[] args)
{
LearnMethodsWithReturntype returnValue=new LearnMethodsWithReturntype();
System.out.println(returnValue.takePhoto());
System.out.println(returnValue.browserVersion());
System.out.println(returnValue.isCameraAvailable());
}
}
