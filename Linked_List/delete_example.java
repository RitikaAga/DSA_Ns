class Node
{
   int data;
   Node next = null;
   Node(int v)
   {               // consturtor of class node 
      data = v;
   }
}
 class LinkedList
  {
     Node head;
     int size = 0;
   
     void insert(int data)
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
        size++;
      }
     void addFirst(int data){                 // will add first node
         Node newNode = new Node(data);
         newNode.next = head;
         head = newNode;
         size++;
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
  
        void deleteHead()  // to delete head 
        {
            if(head == null)
               return;
          else{
             head = head.next;
          }
       }
       
       void deleteNode(int data){   // if you want to delete at perticular node 
         if(head.data == data)
         deleteHead();
         else{
             Node curr = head;
             while(curr.next !=null && curr.next.data != data){
                 curr = curr.next;
             }
              if(curr.next !=null){
                  curr.next = curr.next.next;
              }
           }
       }
       
       void deleteLast(){   // fuction is write for delete last node 
           if(head == null)
           return;
           if(head.next == null)
           head = null;
           
           else{
               Node curr = head;
              while(curr.next !=null && curr.next.next != null){
                 curr = curr.next;
                } 
                if(curr.next != null)
                curr.next = null;
           }
       }
   }

public class Example {
	public static void main (String[] args) {
	    LinkedList l = new LinkedList();
	    l.insert(6);                                        // this line will insert element in the list
	    l.insert(7);
	    l.insert(1);
	    l.insert(2);
	   l.insert(5);
	    l.insert(4);
	    l.printList();
	    
	    l.deleteHead();      // will detele head
	    l.printList();
	    
	    l.deleteNode(4);     //will delete perticular node 
	     l.printList();
	     
	     l.deleteLast(); // will delete last node  
	     l.printList();
	}
}
