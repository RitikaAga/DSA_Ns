import java.util.*;
public class Main{
     
    public static void main(String[] args){
         String fullname = "Tony Stark";
  

            System.out.println("");  
           
            String sentence = "My name is Tony";
            String name = sentence.substring(11,sentence.length()); will print value on given index
          System.out.println(name);
          System.out.println(name.contains("o"));  // contain will check if given value is availabe or not
          String s3 = "hee";
         System.out.println(s3+ " "+ s3.replace('e','i')); // it will print hii instead of hee
         String s4 = "nEWton";
         System.out.println(s4.equalsIgnoreCase("Newton"));  // will return ture here
         System.out.println(s4.indexOf("n")); // will retrurn 0
          System.out.println(s4.lastIndexOf("n")); // will return 5
      
    }
}
