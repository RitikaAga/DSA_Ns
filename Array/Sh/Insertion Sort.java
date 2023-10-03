import java.util.*;
public class Main
{
   
    public static int[] sort_array(int arr[],int length)
    {
    
for(int i =1;i<length;i++)
{ 
  int key = arr[i];
  int j = i-1;     // the ending of shorted array
  while(j>=0 && arr[j]>key){
      arr[j+1] = arr[j];
      j = j-1;
       }
 arr[j+1] = key;   
 } 
 return arr;  
    }
   
