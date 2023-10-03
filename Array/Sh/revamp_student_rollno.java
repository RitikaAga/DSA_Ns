// A Teacher wants to revamp the roll numbers of students of his class . The previous roll numbers has a problem that some duplicate roll numbers are present .
//You have given an array of integers which represent roll numbers of students . You have to revamp such that no duplicate roll numbers should be there .
// You can increase the roll number by one at a time . you have to find minimum operation for revamping the array.
// HINT :- Sort the Array and find a pattern.

// Input:
// N = 3
// arr[] = {1, 2, 2}
// Output: 1
// Explanation: If we increase arr[2] by 1 then the resulting array becomes {1, 2, 3} and has all unique values. Hence, the answer is 1 in this case.

var revamp = function(arr) {
    arr.sort((a,b)=>a-b);
    let number = 0;
    for(let i =1;i<arr.length;i++){
        if(arr[i]<=arr[i-1]){
            number += arr[i-1] - arr[i]+1;
            arr[i] = arr[i-1]+1;
        }
    }
    return number;
};
