// given a string ,remove all the occerance of a's and z's from it

class Main{
static void removeChar(String s, char c,char b  )
{
    int j, count = 0, n = s.length();
    char []arr = s.toCharArray();
    for (int i = j = 0; i < n; i++) {
        if (arr[i] != c && arr[i] != b &&arr[i] != ' ')
        arr[j++] = arr[i];
        
        else
            count++;
    }
     
    while(count > 0) {
        arr[j++] = '\0';
        count--;
    }
     
    System.out.println(arr);
}

public static void main(String[] args)
{
    String s = "aazadi zihadi ";
    removeChar(s, 'a' , 'd');
}
}
