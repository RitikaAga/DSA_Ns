//Insertion sort
// in insertion short we 1st compare 1st element to 2nd element    7 5 1 6 2
// if 1st elemnt is greater then we shift it to the right and 2nd elemnt take 1st element's place  5 7 1 6 2
// now we again check 3rd element 1st from 2nd then from 1
// if it is greator then the 1st element then it will take place of 1st element and 1st will shift to the 2nd index .  1 5 7 6 2 
// again it will check same this process would follow until the array will not short   1 2 5 6 7
// Tc = O(n) in best case O(n^2) in average and worst case 

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
	     // from here we start searching from insertion sort
	for(int i =1;i<n;i++)
{ 
  int key = arr[i];
  int j = i-1;     // the ending of shorted array
  while(j>=0 && arr[j]>key){
      arr[j+1] = arr[j];
      j = j-1;
       }
 arr[j+1] = key;   
 }
 System.out.println();
for(int i =0;i<n;i++){   // this loop will print the array element after shorting
	    System.out.print(arr[i] +" ");
	}
	}
}
