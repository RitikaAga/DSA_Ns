import java.util.*;
public class Main
{
   
    public static void check_armstrong(int n)
    {
         /*Function to check whether a number is an armstrong number or not
        Print true if yes else false */
        int a,b,c=0,d=0,e;
        e=n;
        while(c!=n){
            a=n%10;
            b = a*a*a;
            d= d+b;
       n=n/10;
        }
        if(e==d){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        /* Do not change the code beyond this point*/  
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        check_armstrong(n);
    }
}
