package Practice;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,0,2,1,0,1,2,0};
        int n=arr.length;
        int k=0;
        int l=0;
        int m=n-1;
        while(l<=m){
            if(arr[l]==1){
                l++;
            }else if(arr[l]==0){
                int temp=arr[k];
                arr[k]=arr[l];
                arr[l]=temp;
                k++;
                l++;
            }else{
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                m--;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
