import java.util.HashSet;
import java.util.Set;
class Main
{   
    public static boolean find3PairSum(int[] nums, int target)
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++)
        {
            int x = target - nums[i];
             for (int j = i+1; j < nums.length; j++)
            {
             if (set.contains(x-nums[j]))
            {
                System.out.print( nums[i] + " " +nums[j] + " " +(x-nums[j]));
                    
                return true;
            }
             set.add(nums[j]);
            }
           }
           return false;
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
 
       find3PairSum(nums, target);
    }
}
