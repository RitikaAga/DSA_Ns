import java.util.*;
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloumn = sc.nextInt();
        int[][] metric = new int[row][coloumn];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloumn; j++) {
                metric[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < row; j++) {
            for (int i = j; i >= 0; i--) {
                if ((j - i) >= coloumn) {
                    break;

                }
                System.out.print(metric[i][j - i] + " ");
            }
            System.out.println("");
        }

        for (int j = 1; j < coloumn; j++) {
            for (int i = row - 1; i >= 0; i--) {
                if ((j + row - 1 - i) >= coloumn) {
                    break;
                }
                System.out.print(metric[i][j + (row - 1 - i)] + " ");
            }
            System.out.println("");
        }

    }
}
