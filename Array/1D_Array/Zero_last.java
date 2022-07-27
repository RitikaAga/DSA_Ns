// this program will move all zero to last

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]={1,2,3,0,0,4,5,6};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
        int a = 0;
        for (int i=0;i<n;i++){
            if(arr[i]==a){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
