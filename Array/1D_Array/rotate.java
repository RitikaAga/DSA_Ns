class Solution {
   public void rotate(int[] nums, int k) {
      k = k%nums.length;
        reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
   }
   static void reverse(int []nums,int s,int e)
   {
       
      while(s<e)
      {
          int temp = nums[s];
          nums[s] = nums[e];
          nums[e] = temp;
          s++;
          e--;    
       }
    }
}


//  2nd approach
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int new_array[] = new int[arr.length];
        int k = 2;
        int rotating_point = k;

        int i = 0;
        while (rotating_point < arr.length) {
            new_array[i] = arr[rotating_point];
            i++;
            rotating_point++;
        }
        rotating_point = 0;
        while (rotating_point < k) {
            new_array[i] = arr[rotating_point];
            i++;
            rotating_point++;
        }
        System.out.println("Rotating array is: ");
        
        for (int j = 0; j < new_array.length; j++) {
            System.out.print(new_array[j] + " ");
            ;
        }
    }
}
