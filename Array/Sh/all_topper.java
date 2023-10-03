// You have given array of marks of students .
// A topper is a student whose marks are greater than marks of all the students present at its right .
// The Student at last of array will always a topper , You have to return Marks of all the toppers in array .
//   Input:n = 6
// A[] = {16,17,4,3,5,2}
// Output: 17 5 2 

var topper = function(arr) {
    const n = arr.length;
    const topper = [];
    let max = -1;
    
    for(let i = n-1;i>=0;i--){
        if(arr[i]>max){
            topper.push(arr[i]);
            max = arr[i];
        }
    }
    return topper.reverse();
};
