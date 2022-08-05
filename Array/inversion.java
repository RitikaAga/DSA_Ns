public class inversion {
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,6,1,8,9,1,1};
        int inv = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length;j++){
            if(arr[i]>arr[j]){
                inv ++;
            }}
        }
        System.out.println(inv);
    }
}
