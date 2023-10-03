// You have given an array of size N , you have to find the index of the smaller element to the right which must have largest distance from that element .
// if smaller element is not present print -1 for that number . return the array which contain these indices .

// Input: N=5
// Arr[] = {3, 1, 5, 2, 4}
// Output: 3 -1 4 -1 -1

var smaller_element = function(arr) {
    const n = arr.length;
    for(let i =0;i<n;i++){
        let idx = -1;
        for(let j = n-1;j>i;j--){
            if(arr[i]>arr[j]){
                idx = j;
             break;
            }
        }
        process.stdout.write(idx+' ');
          
    }
  console.log();
};
