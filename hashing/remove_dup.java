import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a[] = new int[n];
	   
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	    }
	    countFreq(a,n);
	}
	    static void countFreq(int a[],int n){
	        HashMap<Integer,Integer>map =new HashMap<>();
	        for(int i =0;i<n;i++){
	            if(map.containsKey(a[i])){
	                map.put(a[i],map.get(a[i])+1);
	            }else{
	                map.put(a[i],1);
	            }
	        }
	        for(Map.Entry<Integer,Integer>val: map.entrySet()){
	            System.out.println(val.getKey() + " ");
	            
	        }
	            }
	            }



//  remove duplicate from sorted array

class Solution {
    public int removeDuplicates(int[] nums) {
       if(nums.length == 0){
           return 0;
       }
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[i] != nums[j])
                i++;
            nums[i] = nums[j];
        }
        return i+1;
    }
}
