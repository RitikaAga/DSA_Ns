import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5;
    TreeSet<String> TS = new TreeSet<>();
    for(int i=0;i<n;i++){
        String c = sc.nextLine() ;
        TS.add("'"+c+"'");
    }
    System.out.print(TS);
    }
}

Input
a
b
b
b
c
Output
['a', 'b', 'c']
