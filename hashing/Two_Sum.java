class Solution {
    public int[] twoSum(int[] arr, int target) {
/*        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[j]== target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
        
    }
}           */


HashMap<Integer,Integer>Map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            Map.put(arr[i],i);
        }
        for(int j = 0;j<arr.length;j++){
            int arun = target-arr[j];
            if(Map.containsKey(arun)){
                if(Map.get(arun) == j)
                    continue;
                return new int[] {j,Map.get(arun)};
            }
        }

        return new int[] {-1,-1};
    }
}
