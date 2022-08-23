import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          int n  = sc.nextInt();
          int a[][] = new int[n][n];
          int ans[][] = new int[n][n];
          for(int i =0;i<n;i++)  {                           
              for(int j =0;j<n;j++)       {
                  a[i][j] = sc.nextInt();
                }
           }
            antiClockWise(a,n,ans);
             for(int i =0;i<n;i++)        
           {                           
              for(int j =0;j<n;j++)     
               {
     //             System.out.print(ans[i][j]+" ");
                }
                System.out.println(" ");
           }
            
    }
     static int[][] antiClockWise(int a[][],int n,int [][]ans){
      for( int i =n-1;i>=0;i--){
       for(int j =0;j<n;j++)
       { 
           ans[n-1-i][j] = a[j][i];
           System.out.print(ans[n-1-i][j]+" ");
       }
       
      }
      return ans;
    }     
}
