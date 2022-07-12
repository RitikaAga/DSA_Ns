//  Strings are immutable we can not modity or change it 
//if we want to modify it so we have to create a new string 

import java.util.*;
public class Main{
    public static void main(String[] args){
        String fullname = "Tony Stark";
        System.out.println(fullname.length());

          for(int i = 0;i<fullname.length();i++){
          System.out.println(fullname.charAt(i));    //it will show every character one by one
          }
// compare function check 3 condition 
// 1. s1>s2 = will return +ive value,  
//  2. s1==s2 = will return 0; 
//   3. s1<s2   = will return -tve value 

          String Name1 = "Tony";
          String Name2 = "Tony";
          if(Name1.compareTo(Name2)== 0 ){
            System.out.println("Strings are equal");  }
            else{
                System.out.println("Strings are not equal");  
            }
// substring(begning index,end index) in this example tony will print 
            String sentence = "My name is Tony";
            String name = sentence.substring(11,sentence.length());
          System.out.println(name);
    }
}
