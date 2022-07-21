import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	   
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	    }
	    countFreq(a,n);
	}
	    static void countFreq(int a[],int n){
	        HashMap<Integer,Integer>map =new HashMap<>();
	        for(int i =0;i<n;i++){
	            if(map.containsKey(a[i])){
	                map.put(a[i],map.get(a[i])+1);
	            }else{
	                map.put(a[i],1);
	            }
	        }
	        for(Map.Entry<Integer,Integer>val: map.entrySet()){
	            System.out.println(val.getKey() + " " + val.getValue());
	            
	        }
	            }
	            }


// 2 approach

import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      int b[] = new int[n];
    int count = 0;
      for(int i = 0; i<n;i++){
          a[i] = sc.nextInt();
      }
      for(int i= 0; i<n;i++){
                count = 1;
                if(a[i]!=-1){
                for(int j= i+1; j<n;j++){
             if(a[i]==a[j]){
              count++ ;
              a[j] = -1;
              }
      }
      b[i] = count;
      }
      }
       for(int i= 0; i<n;i++){
       if(a[i]!=-1){
        System.out.println(a[i] + " " + b[i]);
        }
        }
        }
        }


// 3rd APPROACH

import java.util.*;
public class Main
{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0; i<n;i++){
          a[i] = sc.nextInt();
      }
frequency(a);
}
static void frequency(int []a){
int n = a.length;
int[] freq = new int[10];
for(int i=0; i<n;i++){
freq[a[i]]++;
}
 for(int i=0;i<n;i++){ // O(n) time complexity
 if(freq[a[i]]!=0){
 System.out.println(a[i] + " " + " " + freq[a[i]] + " ");
freq[a[i]] = 0;
}
}
}
}
