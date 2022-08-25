class Solution {
    public boolean isValid(String s) {
    Map<Character,Character> map=new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                l.add(s.charAt(i));
            }
            else if(l.size()==0 || 
                    map.get(s.charAt(i))!=l.remove(l.size()-1)) 
              return false;
        }
        return l.size()==0;
    }}

// 2nd approach

public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);            }
            else {
                if(stack.isEmpty()==true) {
                    return false;
                }   
                else if(isMatching(stack.peek(),x)==true)
                    stack.pop();
                else
                    return false;  
            }}
        return stack.isEmpty();
    }
    public boolean isMatching(char a,char b) {
        return((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']'));
    }


// 3rd approach

class Solution {
   public boolean isValid(String s) {
        
        String[] vp = {"{}", "[]", "()"};
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
        	sb.append(s.charAt(i));    // add items to the end of a given list.
        	String c = null;
        	if(sb.length() >= 2) {
        		c = sb.substring(sb.length() - 2, sb.length());
        	
            	if( c.equals(vp[0]) || c.equals(vp[1]) || c.equals(vp[2])){
            		sb.delete(sb.length() - 2, sb.length());
            	}} }
        if(sb.length() == 0)
            return true;
        else
            return false;
    }}
