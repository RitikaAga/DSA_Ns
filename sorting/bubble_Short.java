// Bubble shorting is a technique in which we compare 1st element to 2nd element if 1st element is > then 2nd element then it swap place 
// when 1st pass will complete then the shorting will start from 2nd element 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();    
	int arr[] = new int[n];
	for(int i =0;i<n;i++){                         // this loop will insert the array element
	    arr[i]= sc.nextInt();
	}
	for(int i =0;i<n;i++){                                      // this loop will print the array element
	    System.out.print(arr[i] +" ");
	}
for(int i = 0; i<n;i++){                // both array are used to perform bubble shorting
    for(int j = 0;j<n-i-1;j++){    // for 1st pass when j will equal to j-1-i then the i value will change for 2nd pass i=1
        if(arr[j]>arr[j+1]){
         int temp = arr[j];
         arr[j]= arr[j+1];
         arr[j+1] = temp;
        }
    }
    }
    System.out.println();
for(int i =0;i<n;i++){   // this loop will print the array element after shorting
	    System.out.print(arr[i] +" ");
	}
	}
}
