// output - 7
 // it will check the max number 1st here is 4 then will add array


public class Main {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        int max = maxSubArray(arr);

        System.out.print(max);
    }

    public static int maxSubArray(int arr[]) {
        int sum = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
