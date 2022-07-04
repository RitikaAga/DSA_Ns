import java.util.Scanner;

public class binarysearch3 {
    public static void main(String[] args) {
        int n, target;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        target = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){ // taking array input from user
            arr[i] = scn.nextInt();
        }
        int ans = weDoNotKnow(arr,target);
        System.out.println("ans mil gya:-" +ans);
    }
    static int weDoNotKnow(int[] arr, int target){
        int start = 0, end = arr.length-1;
        boolean Asc = arr[0]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(Asc){                                            // if array is in ascending order(1 2 3)
                if(arr[mid]<target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }else{
                if(arr[mid]<target){    // if array is in descending order (3 2 1)
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }}
        return -1;
    }}
