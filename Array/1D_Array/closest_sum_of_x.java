
// Given a sorted array and a number x, find a pair in an array whose sum is closest to x.
// Examples:    Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
// Output: 22 and 30



class Main{
    static void findPair(int[] arr, int n, int x){
        int right =0;
        int left  =0;
        int diff = Integer.MAX_VALUE;
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(Math.abs(x-(arr[i] + arr[j]))<diff){
                diff = x- (arr[i] + arr[j]);
                right = arr[i];
                left = arr[j];
                
            }
            if(arr[i] + arr[j] > x ) {
                
                j--;;
            }
            else {
                i++;
            }
        }
        System.out.println(right+" "+ left);
    }
    public static void main(String[] args){
        
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54;
        int n = arr.length;
        
        findPair(arr, n, x);
    
       
    }
}
