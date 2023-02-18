static boolean check_Palindrome(String str,int s, int e) 
    { 
if(s==e)
    return true;

if((str.charAt(s))!= (str.charAt(e)))
return false;

if (s<e)
    return check_Palindrome(str, s+1, e-1);
return true;
    }

// 2nd approach

public class StringPalindrome {
   public static void main(String args[]) {
      String myString = "anna";
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         System.out.println("Given String is palindrome");
      } else {
         System.out.println("Given String is not palindrome");
      }
   }
}



//2 Pointer

function pal(str){
let s = 0;
let e = str.length-1;
while(s<e){
if(str[s]==str[e]){
s++;
e--;
}else{
console.log("Not Pal")
break;
}}
if(s>=e){
console.log("Pal")
}}
pal("11221")
