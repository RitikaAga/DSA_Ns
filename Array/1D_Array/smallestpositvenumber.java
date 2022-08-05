public class smallestpositvenumber {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 8, -1, -10, 15};
        int n = arr.length;
        int smallest = 1;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            if(arr[i]==smallest){
                smallest++;
            }

        }System.out.println(smallest);

    }
}

//count smallest positive 2nd approach

import java.util.*;

public class Main {
    public static void main(String[] args) {
       int arr[] = {2, 1, 3, 4, 8, -1, -10, 15};
       
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > 0){
                if((arr[i+1] - arr[i]) != 1){
                    System.out.print(arr[i]+1);
                    break;
                }
            }
        }
    }
}
