import java.util.Arrays;
public class learnwitharrays
{
public static void main(String[] args)
{
int a=1;
int b=2;
int c=3;
int d=4;
int e=5;
int[] marks=new int[5];
marks[0]=81;
marks[1]=92;
marks[2]=94;
marks[3]=88;
marks[4]=81;
int[] scores = {80,50,100,10,78};
int lengthOfArray= scores.length;
System.out.println(lengthOfArray);
System.out.println("Score in 3rd match is "+scores[2]);
Arrays.sort(scores);
for (int i = 0; i < lengthOfArray ; i++)
{
System.out.println(scores[i]);
}
System.out.println("Least Value " +scores[0]);
System.out.println("Largest value " +scores[lengthOfArray-1]);
}
}
