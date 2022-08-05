public class findmaximumdistict {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0};
        int k  =2;
        int count=0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length-1;j++){
                if(arr[i]+arr[j]==k){
                    count++;
            }
        }
    }
        System.out.println(count);
}}
