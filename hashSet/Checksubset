import java.util.*;
public class Main
{
public static void main(String[] args) {
int[] arr1 = {1,2,5,7,8,9};
int[] arr2 = {1,5,7,10};
int m = arr1.length;
int n = arr2.length;
boolean ans = Subset(arr1, arr2, m, n);
if(ans){
System.out.println("yes it is a subset");
}
else{
System.out.println("no it is not a subset");
}
}
static boolean Subset(int[] arr1, int[] arr2, int m, int n){
HashSet<Integer> hs = new HashSet<>();
for(int i=0;i<m;i++){
//if(!hs.contains(arr1[i]))
hs.add(arr1[i]); // created hashed set of all the values of arr1
}
for(int i=0;i<n;i++){
if(!hs.contains(arr2[i])) return false;
}
return true;
}
}
