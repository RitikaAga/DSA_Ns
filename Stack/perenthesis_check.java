
import java.util.*;
public class Main{
    public static void main(String[] args){
        
            String input = "(((())))";
            Stack<Character> st = new Stack<Character>();
            boolean valid = true;
            for(int i = 0;i<input.length();i++)
            {
                char ch = input.charAt(i);
                if(ch =='(')
                st.push(ch);
                else{
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    else{
                        valid = false;
                        break;
                    }
                }
            }
            if(st.isEmpty() && valid == true){
                System.out.println("valid");
            }
            else
            System.out.println("invalid");
    }
}
