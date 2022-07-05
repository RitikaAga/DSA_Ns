import java.util.*;
        public class Main
        {
 public static void main(String[] args) {
 int n,target;
Scanner scn = new Scanner(System.in);
    n = scn.nextInt();
  target = scn.nextInt();
    int[] arr = new int[n];
  for(int i=0;i<n;i++){
 arr[i] = scn.nextInt();
    }
 int start = 0, end = arr.length-1, flag = 0;
 while(start<end){
    int mid = start + (end-start) / 2;
    if(arr[mid]==target)
    {
     System.out.println(mid);
     flag = 1;
     break;
    }
 else if(arr[mid]>target){
     end = mid-1;
 }
 else {
start = mid+1;
  } }
if(flag==0) System.out.println(start);
 } } }
