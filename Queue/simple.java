 //queueuse FIFO = first In First Out policy
 // there are front and rear view
 
 import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Queue <Integer> q = new LinkedList<Integer>();
     q.add(3);  //  will add element at the rear end
     q.add(5);
     q.add(6);
     q.add(7);
     
      System.out.println(q.peek()); // to check value at the front end will print 3 here
      System.out.println(q.isEmpty()); // check if queue is empty will return false 
      System.out.println(q.size());  // will return size of queue  willreturn 4 here
      
   q.remove();   // will remove 1st element from queue from the front end in this case will remove 3
    System.out.println(q.peek());
    
    q.poll();    // it will return and remove the head of queue
     System.out.println(q.poll());
    }
}
