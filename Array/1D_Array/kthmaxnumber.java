import java .util.*;
public class MyClass {
 public static void main (String[] args)
    {
     int [] a = {2,1,8,9,7,15,18,25,6,10,78,59};
     int k = 9;   
    kthmaxnumber(a,k);
    }
    static void kthmaxnumber(int a[],int k)
    {   
       for(int i=0;i<a.length-1;i++)
       {
        for(int j =i+1;j<a.length;j++)
        {
          if(a[i]<a[j])
          {
          int temp = a[i];
          a[i] =a[j];
          a[j]=temp; 
          }
          }
          if(i==k-1){
          System.out.print(a[i] + " ");
          break;
          }
       }
       System.out.println("");
       for(int i =0;i<a.length;i++)
       {
        System.out.print(a[i]+ " " );
       }
 } 
 
}
