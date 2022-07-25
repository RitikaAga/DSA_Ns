//  Strings are immutable we can not modity or change it 
//if we want to modify it so we have to create a new string 
// operation perform - char at index 0 ,set char at index 0 , insert char at some position ,delete char at some position

import java.util.*;
public class Main{
    public static void main(String[] args){
     StringBuilder sb = new StringBuilder("Tony");
     System.out.println(sb);

     //char at index 0
     System.out.println(sb.charAt(0));

//set char at index 0
sb.setCharAt(0,'M');
System.out.println(sb);

//insert character at some position
sb.insert(3,'y');
System.out.println(sb);

//delete character at some position
sb.delete(3,4);
System.out.println(sb);
    }
}
