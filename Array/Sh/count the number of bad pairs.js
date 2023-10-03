// Given an array of integers nums, write a function to count the number of bad pairs. A pair (i, j) is called bad if nums[i] > nums[j] and i > j.
// Input: [1, 2, 3, 1, 2, 3]
// Output: 9

function count_bad_pairs(nums) {
    let number = 0;
    for(let i =nums.length;i>=0;i--){
        for(let j =i-1;j>=0;j--){
            if(nums[i]>nums[j] && i>j){
            number++;
        }
    }
}
return number;
}
