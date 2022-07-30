import java.util.*;

class Main{
    static int[] conqure(int[] left, int[] right){
        
        int i=0;
        int j=0;
        int k=0;
        int[] merged = new int[left.length + right.length];
        
        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                merged[k] = left[i];
                k++;
                i++;
            }
            else{
                merged[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            merged[k] = left[i];
            k++;
            i++;
            
        }
        while(j<right.length){
            merged[k] = right[j];
            k++;
            j++;
        }
        return merged;
    }
    static int[] devide(int[] arr, int lo, int hi){
        if(lo==hi){
            int[] base = new int[1];
            base[0] = arr[lo];
            return base;
        }
        int mid = lo + (hi-lo)/2;
        int[] left = devide(arr, lo, mid);
        int[] right = devide(arr, mid+1, hi);
        
        int[] merged = conqure(left, right);
        
        return merged;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }  
       
     System.out.println(Arrays.toString(devide(arr, 0, n-1)));
    }
}

// 2nd approach
import java.util.Scanner;

public class Main {

    public static void mergeSort(int arr[], int l, int h) {
        if (l < h) {

            int mid = (l + h) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void merge(int arr[], int l, int mid, int h) {
        int b[] = new int[h - l + 1];

        int idx1 = l;
        int idx2 = mid + 1;
        int k = 0;

        while (idx1 <= mid && idx2 <= h) {
            if (arr[idx1] <= arr[idx2]) {
                b[k] = arr[idx1];
                idx1++;
            } else {
                b[k] = arr[idx2];
                idx2++;
            }
            k++;
        }

        while (idx1 <= mid) {
            b[k] = arr[idx1];
            idx1++;
            k++;
        }
        while (idx2 <= h) {
            b[k] = arr[idx2];
            idx2++;
            k++;
        }

        for (int i = 0, j = l; i < b.length; i++, j++) {
            arr[j] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 15, 6, 9, 4, 1 };

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
