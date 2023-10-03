class Solution {
    public int maximum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] i : arr){
            for(int num : i){
                if(num>max){
                    max = num;
                }
            }
        }
        return max;
        
    }
}
