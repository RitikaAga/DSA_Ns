//using while loop

import java.util.*;
public class Main
{
   
    public static void print_pattern()
    {
         /* Function to print the pattern */
int r=5;
int i=r;
while(i>0){
    int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
}


  // for loop

  for(int i =5;i>=1;i--){
    for(int j =1;j<=i;j++){
        System.out.print("*");
    }
     System.out.println();
}
