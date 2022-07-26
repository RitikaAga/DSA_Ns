// while fuction implimentation we are doing +32 and -32 ikn fuction we are doing so bcoz the difference between A and a is 32.


public class MyClass {
    public static void main(String args[]) {
     String s1 = "NeWtOn";
     String s2 = s1.toLowerCase();   // will convert string into lower case 
      System.out.println(s2);
      
      String s3 = s1.toUpperCase();     // will convert string into upper case
     System.out.println(s3); 
    }
}

// Function implimentation is here of all 3 fuctions


public class MyClass {
    
    // This function is written to convert string into upper case 
    
    public static String toUpperCase(String s1){
    String res = "";
    for(int i = 0;i<s1.length();i++){
        char c = s1.charAt(i);
        if(c >= 'a' && c <= 'z'){
            char ch = (char)((int)(s1.charAt(i))-32);
            res +=ch;
        }
        else
        res += c;
    }
    return res;
    }
    
     // This function is written to convert string into Lower case 
    
     public static String toLowerCase(String s1){
    String res = "";
    for(int i = 0;i<s1.length();i++){
        char c = s1.charAt(i);
        if(c>= 'A' && c<='Z'){
            char ch = (char)((int)(s1.charAt(i))+32);
            res +=ch;
        }
        else
        res += c;
    }
    return res;
    }
    
     // This function is written to convert string's 1st letter into Upper case 
    
    
    public static String toCapitalCase(String s1){
    String res = "";
    char ch2 = s1.charAt(0);
    if(ch2 >= 'a' && ch2 <= 'z')
    res += (char)((int)(s1.charAt(0))-32);
    for(int i = 1;i<s1.length();i++){
        char c = s1.charAt(i);
        if(c>= 'A' && c<='Z'){
            char ch = (char)((int)(s1.charAt(i))+32);
            res += ch;
        }
        else
        res += c;
    }
    return res;
    }
    

    public static void main(String args[]) {
     String s1 = "Newton";
     int n = s1.length();          
     for( int i = 0;i<n;i++)
     { 
         char ch = s1.charAt(i); 
     }
         System.out.println(toUpperCase("newton"));
         System.out.println(toLowerCase("NEWTON"));
         System.out.println(toCapitalCase("nEWton"));
}}
