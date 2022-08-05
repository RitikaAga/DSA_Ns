public class countsmallest {
    public static void main(String[] args) {
        int arr[] = {12, 10, 5, 4, 2, 20, 6, 1, 0, 2};
        int n = arr.length;
        int count[] = new int[n];
        for(int i=0;i<n;i++){
            count[i] = 0;
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[j]< arr[i]){
                    count[i]++;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(count[i]+" ");

        }
    }
}
