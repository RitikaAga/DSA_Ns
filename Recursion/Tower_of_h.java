public class Main
{
public static void main(String[] args) {
int n=2;
TOH(n,'A','B','C'); // from A To B using AUX C
}
static void TOH(int n, char from, char to, char aux){
if(n==0){
return;
}
TOH(n-1,from, aux, to);
System.out.println(" moved disk "+n+" from rod "+from+" to rod "+to);
TOH(n-1,aux,to,from);
}
}
