class Solution
{
    //Function to merge the arrays.
    static void sortArray2(long[] arr2, int m){
        for(int i=1; i<m; i++){
            if(arr2[i]<arr2[i-1]){
                long temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp; 
            }
        }
    }
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
      int i =0;
      
        while(i<n){
            if(arr1[i] > arr2[0]){
                long temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
              sortArray(arr2, m);
                
            }
             i++;
        }
      
        
    }
}
