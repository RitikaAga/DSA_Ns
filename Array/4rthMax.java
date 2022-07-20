int max1=0;
            int max2=0;
            int max3=0;
            int max4=0;
            int arr[] = { 1,5,8,9,4,6,2,4,5,6,58,5,2,3,4};
            int n = arr.length;
            for(int i=0;i<n;i++){

                if(max1<arr[i]){
                    max4=max3;
                    max3=max2;
                    max2=max1;
                    max1=arr[i];
                }else if(max2<arr[i]){
                    max3=max2;
                    max2=max1;
                    max2=arr[i];
                }
                else if(max3<arr[i]){
                    max3=max2;
                    max3=arr[i];
                }else if(max4<arr[i]){
                    max4=arr[i];
                }
            }
            System.out.print(max1 + " " + max2 +" "  +max3 +" " + max4);
        }

    }
