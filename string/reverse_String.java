public class Main {
    public static void main(String[] args) {
        String name = "Ahmad";
        int size = name.length();
        String rev = "";
        for(int i=size-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.print(rev);
    }
}


//  2nd Approach


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	 System.out.println("Enter Your Name & See Magic \n");
	  Scanner sc  = new Scanner(System.in);
	  String name = sc.nextLine();
	  var rev = name.toCharArray();
	  int l = rev.length;
	  int n = l/2;
	  for(int i=0;i<n;i++){
	    char temp = rev[l-i-1];
	    rev[l-i-1] = rev[i];
	    rev[i] = temp;
	  }
	  for(char e:rev){
	    System.out.print(e);
	  }
	}
}
// string reverse using string builder

import java.util.*;
 
public class Main {
   public static void main(String args[]) {
     StringBuilder sb = new StringBuilder("HelloWorld");
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;
 
       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);
 
       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }
 
     System.out.println(sb);
   }
}
