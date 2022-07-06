// array out of bound error

public class Mergeshort {
    public static void conquer(int arr[],int start,int mid,int end){
        int merged[] = new int[end -start+1];
        int index1 =start;                    //tracking 1st half of array
        int index2 = mid+1;                   //tracking 2nd half of array
        int x = 0;                             //tracking merged array
        while(index1 <= mid && index2<= end){
         if(arr[index1]<=arr[index2]) {
             merged[x] = arr[index1];
             x++;
             index1++;
         }  
         else{
             merged[x] = arr[index2];
             x++;
             index2++;
         }
        }
        while(index1<=mid){       //if copy completed and elements are still left in 1st half of array
            merged[x] = arr[index1];
             x++;
             index1++;
        }
        while(index2<=end){     ////if copy completed and elements are still left in 2nd half of array
            merged[x] = arr[index2];
             x++;
             index2++;
        }
        for(int i = 0;i<=merged.length;i++){  //to copy all element in merge array
            for(int j = start;j<=merged.length;j++){
                arr[j] = merged[i];
            }
        }
    }
    public static void divide(int arr[],int start,int end) {
       int mid = start+(end-start)/2;
      if(start>=end){
          return;
      }
      divide(arr,start,mid);    //1st half of array
      divide(arr,mid+1,end);     //2nd half of array
        conquer(arr,start,mid,end); //for merge both 1st half and 2nd half
    }
      public static void main(String [] args){
          int arr[] = {6,3,9,5,2,8};
          int n = arr.length-1;
          divide(arr,0,n-1);
          for(int i = 0;i<=n;i++){                   //this loop willprint final merged array
            System.out.print(arr[i]+" ");
          }
          System.out.println();
    }
}
