// Here T means typecaste we can change data type here according to need  
// it is also called generic 
class Node<T>
{
   T data;
   Node next = null;
   Node(T v)
   {               // consturtor of class node 
      data = v;
   }
}
 class LinkedList<T>
  {
     Node head;

     void insert(T data)
     {
        Node newNode = new Node(data);
       if(head==null)
       {
           head = newNode;
           
       }
           else{
               Node curr = head;
               while(curr.next != null){
                   curr = curr.next;
               }
               curr.next = newNode;
        }
      }
     void addFirst(T data){                 // will add first node
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
       }
   
      
     void printList()   // for print the list
     {
       Node curr = head;
       while(curr != null)
       {
         System.out.print(curr.data+" ");
         curr = curr.next;
       }
        System.out.println();
     }
  
    }

public class Example {
	public static void main (String[] args) {
	    LinkedList<String> l = new LinkedList<String>();     // in this line we can define our data type as we require 
	                                                        // if we want we can also take integer here
	    l.insert("A");                                        // this line will insert element in the list
	    l.insert("B");
	    l.insert("C");
	    l.insert("D");
	   l.insert("E");
	    l.insert("F");
	    l.insert("G");
	    l.insert("H");
	    l.printList();      // result :  A B C D E F G H
	   
	}
}
