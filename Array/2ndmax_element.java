// 1st approach


public class Main {
    public static void main(String args[]) {
     int arr[] = {9,1,8,2,7,6,5};
     int n = arr.length;
     int c;
for(int i =0;i<n;i++){
    for(int j =i+1;j<n;j++){
        if(arr[i]<arr[j]){
           c =  arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }
}
 System.out.println("1st max number is at: " + arr[0]);
  System.out.println("2nd max number is at: "+ arr[1]);
   System.out.println("3rd max number is at: "+ arr[2]);
    }
}

// 2nd approach
// finding of 2nd max element can be done in O(N) tc and we also have no need of extra space here
//  N is the size of array that we are taking and by X we will take user value of array
import java.util.*;
public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int max1 = 0, max2=0;
      int n = sc.nextInt();
        for(int i = 0;i<n;i++){
          int x = sc.nextInt();
            if(max1 < x){
              max2 = max1;
              max1 = x;
            }else if(max2< x){
              max2= x;
            }
        }
        System.out.println(max1+" "+max2);
      }
    }
