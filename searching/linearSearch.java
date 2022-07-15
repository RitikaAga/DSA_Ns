import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i<n;i++){
            if(arr[i]==target){ // for string if(arr[i].equals(target))
                System.out.println ("Target is found at :"+ i +" position");
                count++;
            }
        }
        if(count==0){
                System.out.println("Target is not found"); 
        }
    }
}
