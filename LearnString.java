public class LearnString {
public static void main(String[] args){
String str1="Prince";
String str2="Prince";
String str3=new String("Prince");
System.out.println(str1==str2);
System.out.println(str1==str3);
System.out.println(str2==str3);
System.out.println(str1.equals(str3));
System.out.println(str2.equals(str3));
System.out.println("---------------");
System.out.println(str1.equalsIgnoreCase(str3));
System.out.println(str1.contains(str3));
System.out.println("-------------------");
String str="WD Sep 2024";
int lengthOfString = str.length();
System.out.println(lengthOfString);
String upperCase = str.toUpperCase();
System.out.println(upperCase);
String replaceAll = str.replaceAll("[0-9]","");
System.out.println("-----------------------");
String amount="10000";
String interest = "100";
System.out.println(amount+interest);
int amount1 = Integer.parseInt(amount);
int interest1 = Integer.parseInt(interest);
System.out.println(amount1+interest1);
}
}
