class Solution
{
    static int validElement(int[] arr){
        int val = arr[0];
        int count = 1;
        for(int i=0; i<arr.length; i++){
            if(val == arr[i]){
                count++;
            }else{
                count--;
            }
            
            if(count==0){
                val = arr[i];
                count =1;
            }
        }
        return val;
    }
    
    static int majorityElement(int a[], int size)
    {
        // your code here
        int value = validElement(a);
        
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]==value){
                count++;
            }
