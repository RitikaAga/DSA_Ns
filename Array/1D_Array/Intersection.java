import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first array
        int n = sc.nextInt();
         int m = sc.nextInt();
        int[] nums1 = new int[n];
         int[] nums2 = new int[m];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
       
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        // Find the common elements
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        // Convert the set to an array and sort it
        int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }
        Arrays.sort(result);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
