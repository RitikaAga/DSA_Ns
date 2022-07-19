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
      }
     void addFirst(int data){                 // will add first node
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
  
        void deleteHead()  // to delete head 
        {
            if(head == null)
               return;
          else{
             head = head.next;
          }
       }
       
       void deleteNode(int data){   // if you want to delete a perticular node 
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
       
       void deleteByPos(int pos){      // // if we want to delete node at perticular position 
          Node curr = head;
          
          if(pos == 1)
          deleteHead();
           while(pos-- > 2 && curr != null){
               curr = curr.next;
           }
           if(curr != null && curr.next != null){
               curr.next = curr.next.next;
           }
       }
       
        void updateData(int oldData, int newData){    // it will update old data into new data
            Node curr = head;
            while(curr != null && curr.data != oldData){
               curr = curr.next; 
            }
            if(curr != null)
            curr.data = newData;
             }
             
             boolean containData(int data){
                 Node curr =  head;
                 while(curr != null){
                     if(curr.data == data)
                     return true;
                     else 
                     curr = curr.next;
                 }
                 return false;
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
	    l.insert(3);
	    l.insert(8);
	    l.printList();      // result :  6 7 1 2 5 4 3 8
	    
	    l.deleteHead();      // will detele head
	    l.printList();         // 7 1 2 5 4 3 8
	    
	    l.deleteNode(4);     //will delete perticular node 
	     l.printList();         // result  7 1 2 5 3 8 
	     
	     l.deleteLast(); // will delete last node  
	     l.printList();         //  result 7 1 2 5 3 
	     
	     l.deleteByPos(2); // if we want to delete node at perticular position 
	     l.printList();     //   result 7 2 5 3
	     
	     l.updateData(2,6); // it will update old data into new data    
	     l.printList();         //  result 7 6 5 3 
	     
	    System.out.println(l.containData(6));    // true
        System.out.println(l.containData(2));    // false
	}
}
   
