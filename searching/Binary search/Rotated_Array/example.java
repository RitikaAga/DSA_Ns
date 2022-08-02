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


 // 2nd approach
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
              }
         return -1; 
    }}


//3rd approach


public class MyClass{
public static void main(String[] args) {
      int []  arr = {4,5,6,7,0,1,2};
      int target = 2;
      int temp = find(arr, target);
        System.out.println(temp);

    }
    public static int find(int [] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo<= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[lo]<= arr[mid]){
                // lo to mid is sorted
                if(target >= arr[lo] && arr[mid] > target){
                    hi = mid -1;
                }else{
                    lo = mid +1;
                }

            }
            else if(arr[mid] <= arr[hi]){
                // mid to high part is sorted
                if(target> arr[mid] && arr[hi] >= target){
                    lo = mid +1;
                }
                else{
                    hi = mid - 1;
                }

            }
        
        }
        return -1;
    }}
