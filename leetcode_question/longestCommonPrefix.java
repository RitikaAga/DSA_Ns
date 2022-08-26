class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length -1];
        String res = "";
        
        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) == last.charAt(i)){
                res += first.charAt(i);
            }
            else{
                break;
            }
        }
        
        return res;
    }
}

//  2nd 

class Solution {
    public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0)
        return "";
        String min = strs[0];
        for(int i = 0; i<strs.length;i++){
            while(strs[i].indexOf(min) != 0){
                min = min.substring(0,min.length()-1);
                if(min.isEmpty())
                    return "";
            }
        }
        return min;
    }}
