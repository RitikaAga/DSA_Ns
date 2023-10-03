// What is the maximum contiguous frequency of * in a given string?
// Input: "a*b***c***d****e"
// Output: Maximum contiguous frequency of '*' in the string is 4

public static int maxContiguousStarFrequency(String s) {
      int max =0;
      int current = 0;
      for(int i =0; i<s.length(); i++){
          if(s.charAt(i) == '*'){
              current++;
              max = Math.max(max,current);
          }else{
              current = 0;
          }
      }
      return max;
    }
