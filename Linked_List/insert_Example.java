class Node{
  int data;
  Node next = null;
  Node(int v){               // consturtor of class node 
      data = v;
  }
}
 class LinkedList{
     Node head;
 int size = 0;
   void insert(int data)
   {
       Node newNode = new Node(data);
       if(head==null){
           head = newNode; }
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
   int getSize()
   {          //  this function will return the size of List
       return size;
   }
       void insertAt(int pos,int data){  // if we want to add element to a perticular position
           Node newNode = new Node(data);
                                       if(pos>size)
                                         return;
            Node curr = head;
           while(pos-->2){
               curr = curr.next;
           }
           Node temp = curr.next;
           curr.next = newNode;
           newNode.next = temp;
           size++;
       }
   void printList()   // for print the list
   {
       Node curr = head;
       while(curr != null){
        System.out.print(curr.data+" ");
        curr = curr.next;
       }
        System.out.println();
   }
 }  


public class Example {
	public static void main (String[] args) {
	    LinkedList l = new LinkedList();
	    l.insert(6);    // this line will insert element in the list
	    l.insert(7);
	    l.insert(1);
	    l.insert(2);
	   l.insert(5);
	    l.insert(4);
	    l.printList();
	    System.out.println("The Head of the List is - "+l.head.data); // this line will show the number which is present on the head
	    l.addFirst(3);
	    l.printList();
	    System.out.println("The new Head of the List is - "+l.head.data); // this line will show new head
	    System.out.println(l.getSize()); // it will print the size of List
	    l.insertAt(2,8);   //this function will add a new element on a perticular location
	  l.insertAt(8,9);
	    l.printList();
	}
}
