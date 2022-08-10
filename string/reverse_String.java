public class Main {
    public static void main(String[] args) {
        String name = "Ahmad";
        int size = name.length();
        String rev = "";
        for(int i=size-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        System.out.print(rev);
    }
}
