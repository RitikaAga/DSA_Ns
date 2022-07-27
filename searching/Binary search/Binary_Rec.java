public class Recursion {
    public static void main(String[] args) {
        int []arr = {1,4,5,7,8,9,11,45};
        int target = 9;
        int ans = RecBS(arr,0,arr.length-1,target);
        System.out.println(ans);
    }
    static int RecBS(int[]arr,int start,int end,int  target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                return RecBS(arr,mid+1,arr.length-1,target);
            }else if(arr[mid]>target){
                return RecBS(arr,0,start-1,target);
            }else {
                return RecBS(arr,mid+1,arr.length-1,target);
            }
        }
        return -1;
    }
}
