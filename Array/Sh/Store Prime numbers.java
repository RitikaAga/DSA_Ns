// Write a program to store first n prime numbers in an array . After storing return the array.﻿


 public static int[] prime_numbers(int n)
    {
            int a[] = new int[n];
            int temp =0;
            int num =2;
            while(temp<n){
                boolean flag = true;
                  for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
            flag =  false;
            break;
            }
                  }
                  if(flag==true){
                      a[temp]= num;
                      temp = temp+1;
                  }
                 num = num+1;
            }
return a;
}
