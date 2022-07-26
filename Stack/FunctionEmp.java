import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class Stack{
    Node top;
    int size = 0;
    
    void push(int data){
        if(size == 0)
        top = new Node(data);
        else{
            Node newNode  = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        size++;
    }
    
    int pop(){
        if(size>0){
            int retVal = top.data;
            top = top.next;
            size--;
            return retVal;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    
    int peek(){
        return top.data;
    }
    int size(){
        return size;
    }
    
    boolean isEmpty(){
        return size == 0;
    }
}
public class MyClass{
public static void main(String args[]){
    
    Stack st = new Stack();
    st.push(3);
    st.push(4);
    st.push(5);
        System.out.println(st.peek()); // will print 5
         st.pop();
         System.out.println(st.peek());  // will print 4
      System.out.println(st.isEmpty());  //false
       System.out.println(st.size());   // size is 2
     st.pop();
      st.pop();
      System.out.println(st.size());   // will return 0
       st.pop();   // will print stack is empty
}
}
