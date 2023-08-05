Input:-

[1,2,3,4,5]

Output:-
1
12
123
1234
12345
2
23
234
2345
3
34
345
4
45
5

  public static void print_subarray(int arr[],int length)
    {
       /*Function to print all the subarrays given in an array
        Input arr--> array, length -->length of an array */

  for (int i = 0; i < length; i++) {
            for (int j = i; j <length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        
        
        
        
       
       
        /* Do not change the code beyond this point*/
    }
