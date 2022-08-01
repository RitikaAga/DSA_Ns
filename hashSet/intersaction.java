class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> uniq = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
             uniq.add(nums1[i]);
        }
        Set<Integer> hs =new HashSet<>();
        for(int i=0; i<nums2.length; i++){
            int ele = nums2[i];
            if(uniq.contains(ele)){
                hs.add(ele);
                uniq.remove(ele);    
            }
            
        }  int i =0;
        int[] res = new int[hs.size()];
        for(int val: hs){
            res[i] = val;
            i++;
        }
          
        return res;
    }
}

//2 approach

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      int a[] = {2,3,5,6,8};
      int n = a.length;
      int b[] = {7,8,9,3};
      Arrays.sort(a);
      Arrays.sort(b);
      int m = b.length;
      int i=0,j=0;
      while(i<n && j<m)
      {
     if(a[i]>b[j])
        {
         j++;
        }
        else if(b[j]>a[i])
        {
         i++;
        }
        else
        {
         System.out.print(a[i] + " ");
          i++;
          j++;
        }
      }
}
}
