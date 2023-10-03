// Write a program to declare an array of size n and store the numbers 1,2,3,4 ...n in the array and return the array.



  public static int[] store_array(int n)
    {
        /*Function to store the number from 1 to n 
        Note - After storing return the array (Create an array of size n)*/
    
int output[] = new int[n];
for(int i =1;i<=n;i++){
   output[i-1] = i;
}
