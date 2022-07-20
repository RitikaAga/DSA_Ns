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
