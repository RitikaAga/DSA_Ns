public class Main
{
int top=-1; // arrays to implement Stack
int[] Stackarr = new int[100];
boolean push(int val){ // implementing push operation on stack
if(top==101){
System.out.println("stack overflow");
return false;
}
else{
top++;
Stackarr[top] = val;
System.out.println("value inserted is "+ val);
return true;
}
}
int pop(){
if(top<0){
System.out.println("stack underflow");
return 0;
}
else{
int temp = Stackarr[top];
top--;
return temp;
}
}
int peek(){
if(top<0){
System.out.println("stack underflow");
return 0;
}
else{
return Stackarr[top];
}
}
boolean isEmpty(){
if(top<0){
return true;
}
else return false;
}
public static void main(String[] args) {
Main st = new Main();
System.out.println(st.peek());
System.out.println(st.pop());
System.out.println(st.peek());
System.out.println(st.isEmpty());
}
}
