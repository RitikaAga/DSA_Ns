// find first occurance
/*****************************************************/

import java.util.*;
public class binarysearch2
{
    public static void main(String[] args) {
        int n, target;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        target = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){ // taking array input from user
            arr[i] = scn.nextInt();
        }
        int ans = firstOccurence(arr,target);
        System.out.println("First occurence is"+ans);
    }
    static int firstOccurence(int[] arr, int target){
        int start = 0, end = arr.length - 1, temp = -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                temp = mid; // this might be my potential ans
 // return mid why ? because array used to have unique elements
                end = mid - 1;
// if we want to find last occaurence then we have to change
//code form end = mid -1; to start = mid +1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return temp;
    }
}
