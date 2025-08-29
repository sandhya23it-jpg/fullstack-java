public class FindDuplicatesNoMap
{
public static void main(String[] args)
{
int[] nums = {2, 5, 7, 7, 5, 9, 2};
boolean[] visited = new boolean[nums.length];
System.out.println("Duplicate numbers: ");
for (int i=0; i < nums.length; i++)
{
if (visited[i]) continue;
int count = 1;
for (int j = i +1; j < nums.length; j++)
{
if (nums[i] == nums[j])
{
count++;
visited[j] = true;
}
}
if (count > 1)
{
System.out.println(nums[i]);
}
}
}
}
