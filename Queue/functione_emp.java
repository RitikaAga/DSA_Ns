 import java.util.*;
 class Node{
     
     int data;
     Node next;
     Node prev;
     Node(int data){
         this.data = data;
     }
 }
 
 class Queue{
     
     Node front;
     Node rear;
     int size;
     
     void enqueue(int data){    // this function will add element in queue
         Node newNode =new Node(data);
         if(front  == null)
         {
             front = newNode;
             rear = newNode;
         }
         else{
             rear.next = newNode;
             newNode.prev = rear;
             rear = newNode;
         }
         size++;
     }
     void dequeue(){
         if(front != null){
         front = front.next;
         if(front != null)
         front.prev = null;
         size--;
     }
     else{
         System.out.println("Queue is empty");
         }
 }
 
 int peek(){
     if(front != null)
     return front.data;
     else{
        System.out.println("Queue is empty");
        return -1;
     }
 }
 int size(){
       return this.size;

 }
 
 boolean isEmpty(){
     return size == 0;
 }
 }
public class MyClass {
    public static void main(String args[]) {
     Queue q = new Queue();
     q.enqueue(3);  // add element
     q.enqueue(5);
     q.enqueue(6);
     q.enqueue(7);
     
      System.out.println(q.peek()); // show peek value
      System.out.println(q.isEmpty()); // check if queue is empty
      System.out.println(q.size());  // will return size of queue
      
     q.dequeue();   // will remove 1st element from queue in this case will remove 3
     System.out.println(q.peek());
    }
}
