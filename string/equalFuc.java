public class MyClass {
    public static void main(String args[]) {
     String s1 = "NeWtOn";
     
     String s4 = new String("Rose");
     String s5 = new String("Rose");
     System.out.println(s4 == s5);     // it will give false it compare the addresses of 2 strings 
     System.out.println(s4.equals(s5));   // it will give true it compare the value of 2 strings
     
      String s6 = "Rose";   // both s6 and s7 are pointing same string in scp so here == will also give true
     String s7 = "Rose";
      System.out.println(s6 == s7);      
    }
}
