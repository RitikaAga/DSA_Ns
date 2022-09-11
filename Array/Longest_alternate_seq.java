import java.util.Scanner;
public class Main {
    static int LAS(int[] arr, int n)
    {
        int inc = 1;
        int dec = 1;
        for (int i = 1; i < n; i++)   // Iterate from second element
        {
            if (arr[i] > arr[i - 1]){
               
                inc = dec + 1;   // "inc" changes iff "dec  
            }
            else if (arr[i] < arr[i - 1])  {
                dec = inc + 1;  // "dec" changes iff "inc"
            } }
        return Math.max(inc, dec);   // Return the maximum length
    }
 
    public static void main(String[] args){
        int[] arr = { 10, 22, 9, 33, 49, 50, 31, 60 };
        int n = arr.length;
        System.out.println(LAS(arr, n));
    }}
