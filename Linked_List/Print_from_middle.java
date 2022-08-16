public class MyClass {
    static Node head;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    void insert(int data)
    {
        Node N1 = new Node(data);
       if(head==null){
       
       head = N1;
       }
       else{
           Node temp = head;
           while(temp.next != null)
           {
               temp = temp.next;
               
           }
           temp.next = N1;
       }
       
      }
    static Node middle()
    {
        Node p1 =head;
        Node p2 = head;
        while(p2!=null && p2.next !=null)
        {
           p1 = p1.next;
           p2 = p2.next.next;
        }
        
       return p1; 
    }
    void printFromMiddle()
    {
       Node ans = middle();
        
       while( ans !=null)
       {
           System.out.print(ans.data + " ");
          ans = ans.next;
       }
       
    }
    
    void print()
    {
        Node curr = head;
        while(curr !=null)
        {
            System.out.print(curr.data + "--->" + " ");
            curr = curr.next;
        }
        System.out.print(null + " ");
    } 
    public static void main(String args[]) {
     MyClass ll = new MyClass();
     ll.insert(1);
     ll.insert(2);
     ll.insert(3);
     ll.insert(4);
     ll.insert(5);
      ll.insert(6);
     ll.print();
    
     System.out.println(" ");
     System.out.print("Middle element is :" + ll.middle().data + " " );
      System.out.println(" ");
     ll.printFromMiddle();
  
     
    }
}
