// Given an array find the maximum in it and return it 

  public static int find_maximum(int arr[],int length)
    {
     
  int max = arr[0];
      for(int i =0;i<length;i++){
          if(arr[i]>max){
              max = arr[i];
              }
          
        return max;
    }
