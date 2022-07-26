import java.util.*;
public class MyClass {
    public static void main(String args[]) {
  Stack<Character> st = new Stack<Character>();
  String s = "NewtonSchool";
  for(int i = 0;i<s.length();i++){
      st.push(s.charAt(i));     
  }
  String reverse = "";
  while(!st.isEmpty()){
      char ch = st.pop();
      reverse = reverse+ch;
  }
  System.out.println(reverse);
    }
}
