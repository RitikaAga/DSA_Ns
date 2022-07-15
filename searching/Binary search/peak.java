//find peak;


class Solution {
    public int findPeakElement(int[] ar) {
       int start=0,end = ar.length-1;
        while(start<end){
        int mid = (start + (end-start)/2);
            if(ar[mid]> ar[mid+1]){
              end = mid;
            }

            else {
            start = mid + 1;
            }


    }
         return end;
}
}
