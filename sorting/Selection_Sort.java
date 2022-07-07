// in Selection sort 1st we check the very min value in array when we find it then we swap it with index 0
// then again we will find 2nd min value then we will swap it with index 1 
// same will happen until the array will not short
// tc = O(n^2) in every case

import java.util.*;
public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();    // number of element that we want in array
	int arr[] = new int[n];                         
	for(int i =0;i<n;i++){                         // this loop will insert the array element
	    arr[i]= sc.nextInt();
	}
	for(int i =0;i<n;i++){                                      // this loop will print the array element
	    System.out.print(arr[i] +" ");
	    }
	    // from here we start searching from selection sort
for(int i = 0; i<n-1;i++)
{ 
  int Min_Index = i;
    for(int j = i+1;j<n;j++){    
        if(arr[j]<arr[Min_Index]){
           Min_Index = j;
         }
    }
    int temp = arr[Min_Index];
    arr[Min_Index] = arr[i];
    arr[i] = temp;
 }
    System.out.println();
for(int i =0;i<n;i++){   // this loop will print the array element after shorting
	    System.out.print(arr[i] +" ");
	}
	}
}
