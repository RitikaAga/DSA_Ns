// write the code to print all the subarrays possible. Note - print in the similar way as given here.
// Input:-
// [1,2,3,4,5]

// Output:-

// 1
// 12
// 123
// 1234
// 12345
// 2
// 23
// 234
// 2345
// 3
// 34
// 345
// 4
// 45
// 5



  public static void print_subarray(int arr[],int length)
    {
  for (int i = 0; i < length; i++) {
            for (int j = i; j <length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
