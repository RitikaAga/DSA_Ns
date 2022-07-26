// It will follow LIFO last In First Out
// Syntax :- collection<DataType> name = new Collection<DataType>();

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
  Stack<Integer> st = new Stack<Integer>();   // Syntax
  
  System.out.println(st.push(1));    // will add element in the stack 
   System.out.println(st.push(2)); 
    System.out.println(st.push(3)); 
     System.out.println(st.push(4));    
    System.out.println(st.push(5) + " "+ st.push(6) ); // last inserted element will be on top
    
     System.out.println("***********************"); 
     
     int top = st.peek();   // will check in stack which element is on top
     
  System.out.println("Element which is present opn top is: " +top);
  
  st.pop();  // will remove element from the stack 
  System.out.println(st.peek());
  
  System.out.println(st.isEmpty());   // this fuction will check if stack is empty. will return false here bcoz fuction is not empty
  
 System.out.println(st.size());    // return the number of element which present in stack here will return 5.
 
    }
}
