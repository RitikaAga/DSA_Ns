import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];

      for(int i = 0; i<n;i++){
          arr[i] = sc.nextInt();
      }
      for(int i = n-1;i>=0;i--){
          System.out.print(arr[i]+" ");
      }
      }
      }

// 2nd approarch
// tc = O(N)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       int start = 0;
        int end = n-1;
        while(start<=end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]  = temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}


// 3rd approach

static void reverse(int[]arr,int l){
        int a =l/2;
        for(int i=0;i<a;i++){
            int any = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = any;
        }
        System.out.println();
            System.out.println("Reversed array is =");
        for(int elemnt :arr){
            System.out.print(elemnt+" ");
        }
            System.out.println();
        }
    }
