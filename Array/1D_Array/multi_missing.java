import java.util.*;
public class Main
{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int arr[] = new int[N]; //{1,3,5,7}
      for(int i = 0; i<N;i++){
          arr[i] = sc.nextInt();
      }
missingElement(arr,N);
}
static void missingElement(int []arr,int N){
 int[] b = new int[arr[N - 1] + 1];
    for(int i = 0; i < N; i++)
    {
        b[arr[i]] = 1;
    }
    for(int i = arr[0]; i <= arr[N - 1]; i++)
    {                                               
        if (b[i] == 0)                          
        {
            System.out.print(i + " ");
        }
    }
}
}
