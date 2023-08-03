Print the following pattern using for loop

*****
****
***
**
*
*
**
***
****
*****


for(int i =5;i>=1;i--){
    for(int j = 1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i =1;i<=5;i++){
    for(int j=1;j<=i;j++){
       System.out.print("*");  
    }
    System.out.println();
}
