import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {7,8,1,2,3,4,5};// 2 rotated array
        int target = 9;
        int ans = RotatedSearch(arr,target);
        System.out.println(ans);
    }
    static int RotatedSearch(int[] arr, int target){
        int pivot = FindPivot(arr);
        if(pivot==-1){ // first condition
            return binarySearch(arr,0,arr.length-1,target);
        }
        if(arr[pivot]==target) return pivot; // second condition
        if(arr[0]<=target){
            return binarySearch(arr,0,pivot-1,target);
        }
        else{
            return binarySearch(arr,pivot+1,arr.length-1,target);
        }
    }
    static int FindPivot(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) return mid; // 4,5,1,2,3
            if(mid>start && arr[mid]<arr[mid-1]) return (mid-1); // 4,5,1,2,3
            if(arr[start]>=arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
