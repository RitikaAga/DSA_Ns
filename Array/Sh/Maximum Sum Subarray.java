// Given an array find the maximum sum subarray. Return the maximum sum of the subarray.
// Input:-[5,2,-4,-5, 3,-1,2,3,1]
// Output:-8


public static int find_maximum_subarray(int arr[],int length)
    {
     
  int maxsum=Integer.MIN_VALUE;
        int counter=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k= i;k<=j;k++)
                    counter += arr[k];

                if (counter > maxsum)
                    maxsum = counter;

            }
        }
        return maxsum;
    } 
