// 1st approach


public class Main {
    public static void main(String args[]) {
     int arr[] = {9,1,8,2,7,6,5};
     int n = arr.length;
     int c;
for(int i =0;i<n;i++){
    for(int j =i+1;j<n;j++){
        if(arr[i]<arr[j]){
           c =  arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }
}
 System.out.println("1st max number is at: " + arr[0]);
  System.out.println("2nd max number is at: "+ arr[1]);
   System.out.println("3rd max number is at: "+ arr[2]);
    }
}
