https://algorithms.tutorialhorizon.com/remove-duplicates-from-the-string/

/* Sorting:
Convert the string to character array. S
Sort the array, this will bring all the identical characters together.
Iterate through character array and remove the duplicate characters.
This approach will change the order of characters.   */
  
  
import java.util.Arrays;

public class removeDuplicatesUsingSorting {
 public static String removeDuplicates(String s) {
 char[] chars = s.toCharArray();
 Arrays.sort(chars); // O(nlogn)
 String sbString = new String();
 for (int i = 1; i < chars.length; i++) {
 if(chars[i]!=chars[i–1])
 sbString +=chars[i];
 }
 //handle the first character
 if(chars[0]!=chars[1])
 sbString = chars[0] + sbString;
 return sbString;
 }

 public static void main(String[] args) {
 String s = "tutorialhorizon";
 System.out.println(removeDuplicates(s));
 }
}


/*  2nd approach with Hash Set:

Convert the string to character array.
Store all the characters in the Set.
Set will store only one instance of each character
Iterate through Set and print the characters.
This approach will change the order of characters. */

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesUsingSet {

 public static String removeDuplicates(String s){
 HashSet<Character> set = new HashSet<Character>();
 char [] chars = s.toCharArray();
 for (int i = 0; i < chars.length; i++) {
 set.add(chars[i]);
 }
 Iterator<Character> iterator = set.iterator();
 String sbString = new String();
 while (iterator.hasNext())
 sbString += iterator.next()+"";

 return sbString;
 }
 public static void main(String[] args) {
 String s = "tutorialhorizon";
 System.out.println(removeDuplicates(s));
 }
}


/* 3rd Convert the string to character array.
Store all the characters in the Linked Hash Set.
Set will store only one instance of each character
Iterate through Set and print the characters.
This approach will retain the order of characters.  */

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingLHM {
 public static String removeDuplicates(String s) {
 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
 char[] chars = s.toCharArray();
 for (int i = 0; i < chars.length; i++) {
 set.add(chars[i]);
 }
 Iterator<Character> iterator = set.iterator();
 String sbString = new String();
 while (iterator.hasNext())
 sbString += iterator.next() + "";

 return sbString;
 }

 public static void main(String[] args) {
 String s = "tutorialhorizon";
 System.out.println(removeDuplicates(s));
 }
}

/*
Buffer Array:

Convert the string to character array.
Create the boolean array of 256,( for all 0 – 255 ASCII characters)
Iterate through character array from step one and set the Boolean array index ( index = ascii value of the character). Ignore if that index is already true.
Create a separate array based on the index set as true in Boolean array.
This approach will retain the order of characters.    */

public class RemoveDuplicates {

 public static String removeDuplicates(String s){
 char[] chrArr = s.toCharArray();
 boolean[] asciiChrSet = new boolean[256];
 StringBuilder stb = new StringBuilder();
 for(int i=0;i<chrArr.length;i++){
 if(asciiChrSet[chrArr[i]]){
 continue;
 }
 asciiChrSet[chrArr[i]] = true;
 stb.append(chrArr[i]);
 }
 return stb.toString();
 }

 public static void main(String[] args) {
 String s = "tutorialhorizon";
 System.out.println(removeDuplicates(s));
 }
}
