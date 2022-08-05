class Solution {
    public int maxProduct(int[] nums) {
        
        int ans = Integer.MIN_VALUE;
        int min = 1;
        int max = 1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                int temp = min;
                min = max;
                max = temp;
            }
            
            
            min= Math.min(nums[i], min*nums[i]);
            max=Math.max(nums[i], max*nums[i]);
           
            ans= Math.max(ans, max);
        }
        return ans;
    }
}
