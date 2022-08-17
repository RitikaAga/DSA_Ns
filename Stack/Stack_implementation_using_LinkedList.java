//stack using Linked List
class Node{
    int data;
    Node next;
    
     Node(int data){
         this.data = data;
         next = null;
     }
}
class Stack1{
    
     Node head = null;
    
    public Node push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    public boolean isEmpty(){
        
        if( head == null)
        return true;
        else{
            return false;
        }
    }
    public int pop(){
      if(isEmpty()){
          return -1;
      }  
      Node top = head;
      head = head.next;
      return top.data;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        Node top = head;
        return top.data;
    }
}
public class Main{
public static void main(String[] args){
    Stack1 st = new Stack1();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
     System.out.println(st.isEmpty());
         System.out.println(st.peek());
         st.pop();
     }
}
