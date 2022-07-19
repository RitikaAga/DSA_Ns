public class Main
{
public static void main(String[] args) {
int arr[] ={1,5,7,3,2,90,80};
int target = 90;
int answer = recLinearSearch(arr,0,arr.length-1,target);
System.out.println("value found at position"+answer);
}
static int recLinearSearch(int arr[], int i, int j, int target){
if(j<i) return -1;
if(arr[i]==target){
return i;
}
else if(arr[j]==target){
return j;
}
else{
return recLinearSearch(arr, i+1, j-1,target);
}
}
}
