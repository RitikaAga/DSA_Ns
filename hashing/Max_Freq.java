import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class Main {
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
	       int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : map.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
         System.out.print(res +" " );
	        }
	    }
