import java.util.*;
public class Main
{
   
    public static int reverse(int n)
    {
         /* Function to return the reverse of a number n */
int r=0;
while(n != 0) {
      int digit = n % 10;
      r = r * 10 + digit;
      n /= 10;
    }     
       
        /* Do not change the code beyond this point*/
        
    return r;
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int output = reverse(n);
        System.out.println(output);
    }
}
