import java.util.*;
public class Main{
      public static boolean isBinary(String s)
      {
          for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);
              if(!(ch == '0' || ch == '1'))
              return false;
          }
          return true;
      }
    public static void main(String[] args){
            System.out.println(isBinary("00001110"));
             System.out.println(isBinary("00001110234"));
    }
}
