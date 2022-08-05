import java.util.*;

public class Main {
    public static void SubsetsOfArray(int arr[], int idx,
            String set, int sos, int target) {
        if (idx == arr.length) {
            if (sos == target) {
                System.out.println(set + " ");
            }
            return;
        }
        SubsetsOfArray(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], target);
        SubsetsOfArray(arr, idx + 1, set, sos, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        SubsetsOfArray(arr, 0, "", 0, target);
    }
}
