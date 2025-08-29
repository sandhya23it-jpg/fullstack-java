public class ReverseSentence
{
public static void main(String[] args)
{
String input = "Amazon development centre,Chennai";
input = input.toLowerCase();
String[] words = input.split(" ");
int wordCount = words.length;
System.out.println("Word Count: " + wordCount);
for (int i = wordCount -1; i >=0; i--)
{
System.out.print(words[i] + " ");
}
}
}