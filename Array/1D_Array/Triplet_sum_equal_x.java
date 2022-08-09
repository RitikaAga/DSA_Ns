import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int a[] = {1,2,4,5,8};
	int su = 10;
	int n = a.length;
	triplet(a,su,n);
	}
	static boolean triplet(int[]a,int su,int n){
    	for(int i=0;i<n-2;i++){
	        Set<Integer> hs = new HashSet<>();
	        int ek = su-a[i];
	        for(int j=i+1;j<n;j++){
	            int nn = ek-a[j];
	            if(hs.contains(nn)){
	                System.out.println(a[i]+" "+ a[j]+" "+ nn);
	                return true;
	            }
	            hs.add(a[j]);
	        }
	    }
	    return false;
    }
}
