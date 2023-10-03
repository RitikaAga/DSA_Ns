import java.util.*;

public class Main {
   
    public static int[] sort_array(int arr[], int length) {
        /* Function to sort the array in descending order
           After sorting return the sorted array */

        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i; // Initialize the index of the maximum element
            for (int j = i + 1; j < length; j++) {
                if (arr[j] > arr[maxIndex]) { // Compare with the maximum element
                    maxIndex = j;
                }
            }
            // Swap the maximum element with the current element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
