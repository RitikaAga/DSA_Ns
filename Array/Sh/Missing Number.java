// You are given an array Containing n-1 distinct numbers from range [1, n].
// There is one element missing from the range[1,n] in the array. Find that missing Number and return it.
//   Input: nums = [3,4,1]     Output: 2
// Explanation: n = 4 since there are 3 numbers, so all numbers are in the range [1,4]. 2 is the missing number in the range since it does not appear in nums.

class Solution {
    public int missing_elements(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }
}
