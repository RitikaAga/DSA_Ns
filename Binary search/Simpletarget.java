// PROGRAM TO FIND TARGET VALUE IN SHORTED ARRAY
import java.util.*;
public class binarysearch1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer =  Binarysearch(arr,target);
        System.out.println("the output index is"+answer);
    }
    static int Binarysearch(int[] arr, int target){
        int startP = 0;
        int endP = arr.length - 1;
        while (startP <= endP) {
            int mid = (startP + endP) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                startP = mid + 1;
            } else {
                endP = mid - 1;
            }
        }
        return -1;
    }
}
