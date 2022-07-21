import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n   = sc.nextInt();
	    boolean flag = true;
	    for(int i = 2; i<=n/2; i++){
	   if(n%i == 0){
	       flag = false;
	   }}
	   if(flag == true)
	   System.out.println(" Number is Prime");
	   else{
	    	   System.out.println("Number is not Prime");
    
	    }
	}
}

