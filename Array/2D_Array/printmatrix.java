import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      int a[][] = new int[r][c]; 
   //   int min = sc.nextInt();
    //  int max = sc.nextInt();
      for(int i =0;i<r;i++){
          for(int j =0;j<c;j++){
              a[i][j] = sc.nextInt();
              System.out.print(a[i][j]+" "); 
          }
         System.out.println();
        }
      
    }
}
