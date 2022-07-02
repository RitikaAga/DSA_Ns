import java.util.*;
public class binarylastoccurance{
    public static void main(String[] args) {
        int n, target;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        target = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){ // taking array input from user
            arr[i] = scn.nextInt();
        }
        int ans = lastOccurence(arr,target);
        System.out.println("last occurence is"+ans);
    }
    static int lastOccurence(int[] arr, int target){
        int start = 0, end = arr.length - 1, temp = -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                temp = mid;                   // this might be my potential ans
                                         // return mid why ? because array used to have unique elements
                start = mid +1;
                               }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return temp;
    }
}
