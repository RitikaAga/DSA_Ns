public class Main{
class Node{ // structure for linked list
int data;
Node next;
Node(int data){ // [1,n], [2,n], [3,n]
this.data = data;
this.next = null;
}
}
Node head = null;
Node tail = null;
public void addNode(int data){
Node newNode = new Node(data);//[1]-->[2]-->[3]
if(head==null){ // linked list is empty
head = newNode;

tail = newNode;
}
else{
tail.next = newNode;
tail = newNode;
}
}
public void display(){
Node temp = head;
if(head==null){
System.out.println("list is empty");
return;
}
else{
while(temp!=null){
System.out.print(temp.data+"-->");
temp = temp.next;
}
}
System.out.print("null");
}
public void countNodes(){
int count = 0;
Node cnt = head;
while(cnt!=null){
count++;
cnt= cnt.next;
}
System.out.print("Number of nodes in the list are "+" "+count);
}
// delete from the start
public void deleteNode(){
if(head==null){
System.out.println("list is empty");
return;
}
if(head==tail){
head = tail = null;
}
if(head!=tail){
head = head.next;
}
}
public void delLastNode(){
if(head==null){
System.out.println("list is empty");
return;
}
Node temptail = head;
while(temptail.next.next!=null){
temptail = temptail.next;
}
temptail.next = null;
tail = temptail;
}
public static void main(String[] args) {
Main sll = new Main();
sll.addNode(1);
sll.addNode(2);
sll.addNode(3);
sll.addNode(4);
sll.addNode(33);
sll.addNode(43);
sll.display();
System.out.println();
sll.deleteNode();
sll.display();
System.out.println();
sll.delLastNode();
sll.display();
}
}
