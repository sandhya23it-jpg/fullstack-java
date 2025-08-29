import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class LearnSet
{
public static void main(String[] args)
{
Set<String> mentors =new LinkedHashSet<String>();
mentors.add("Saranya");
mentors.add("Vinoth");
mentors.add("Bhuvanesh");
mentors.add("Anburaj");
System.out.println("Mentors Names: "+mentors);
mentors.remove("Vinoth");
System.out.println("Current set: "+mentors);
mentors.add("Saranya");
System.out.println("After adding duplicate: "+mentors);
int sizeOfSet = mentors.size();
System.out.println("Set Size is :"+sizeOfSet);
Set<String> trainers=new HashSet<String>();
trainers.addAll(mentors);
System.out.println("Current trainers names: "+trainers);
List<String> staffs=new ArrayList<String>(trainers);
System.out.println("Current List is: "+staffs);
String index1Value= staffs.get(1);
System.out.println("Index 1 value: "+index1Value);
}
}
