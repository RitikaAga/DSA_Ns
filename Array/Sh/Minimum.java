// Write a program to return the minimum element in the array.


   public static int find_minimum(int arr[],int length)
    {

 int min = arr[0];
          for(int i =0;i<length;i++){
         if(arr[i]<min){
              min = arr[i];
              }}
        return min;
      
    }
