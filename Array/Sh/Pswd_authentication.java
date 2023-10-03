// You are Building a website and for authentication, there are some conditions for password ‘
// 1.All letters in this word are capitals, like "USA".
// 2.All letters in this word are not capitals, like "sharpener".
// 3.Only the first letter in this word is capital, like "Google".
// Given a string password, return true if any on the above three rules in it.
// Input: word = "USA"
// Output: true

class Solution {
    public boolean isValid(String s) {
        if(s.equals(s.toUpperCase())){
            return true;
        }
        if(s.equals(s.toLowerCase())){
            return true;
        }
        if(Character.isUpperCase(s.charAt(0)) && 
        s.substring(1).equals(s.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}
