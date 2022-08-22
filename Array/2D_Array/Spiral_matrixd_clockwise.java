import java.util.*;
class Main {
    public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          int m = sc.nextInt();
          int n  = sc.nextInt();
          int a[][] = new int[m][n];
          for(int i =0;i<m;i++)
           {
              for(int j =0;j<n;j++)
               {
                  a[i][j] = sc.nextInt();
                }
           }
         int i,k=0,l=0;
         while(k<m && l<n)
         {
             for(i =l;i<n;++i)
             {
                 System.out.print(a[k][i] + " ");
             }
             k++;
             for(i =k;i<m;++i)
             {
                 System.out.print(a[i][n-1] + " ");
             }
             n--;
             if(k<m)
             {
                 for(i = n-1;i>=l; --i)
                 {
                     System.out.print(a[m-1][i] + " ");
                 }
                 m--;
             }
         }
         if(l<n)
         {
             for( i =m-1;i>=k;--i)
             {
                System.out.print(a[i][l] + " ");
             }
             l++;
         }
    }     
}
