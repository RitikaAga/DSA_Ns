import java.util.*;
public class Main
{
public static void main(String[] args) {
String s = "google";
frequency(s);
}
static void frequency(String s){

int n = s.length(); // length of string

int[] freq = new int[26]; // to store the fequency of char

for(int i=0; i<n;i++){ //O(1) space cpomplexity
freq[s.charAt(i)-'a']++;

}
for(int i=0; i<26;i++){
System.out.print("array value is"+freq[i]);
}
for(int i=0;i<n;i++){ // O(n) time complexity

if(freq[s.charAt(i)-'a']!=0){

System.out.print(s.charAt(i));

System.out.print(freq[s.charAt(i)-'a']+" ");
freq[s.charAt(i)-'a'] = 0;
}}}}
