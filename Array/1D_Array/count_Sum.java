import java.util.*;

class Main {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] arr = new int[n];
	 for(int i=0; i<n; i++){
		 arr[i] = sc.nextInt();
	 }
	 int cSum = 0;
	 int sum = 0;
	 for(int i=0; i<n; i++){
		 cSum = Math.max(cSum, cSum + arr[i]);
		 sum = Math.max(sum, cSum);
	}
		System.out.println(sum);
		
	}
}
