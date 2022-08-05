public class smallestpositvenumber {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 8, -1, -10, 15};
        int n = arr.length;
        int smallest = 1;
        Arrays.sort(arr);
        for(int i =0;i<n;i++){
            if(arr[i]==smallest){
                smallest++;
            }

        }System.out.println(smallest);

    }
}
