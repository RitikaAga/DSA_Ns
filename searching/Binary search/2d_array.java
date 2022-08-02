class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = m*n -1;
        while(start <=end)
        {
            int mid = start+(end-start)/2;
            if(matrix[mid/m][mid%m]== target) // / = constant(row) % = no constant(colms)
            {
                return true;
        }
        else if(matrix[mid/m][mid%m]>target)
        {
            end = mid -1;
        }
        else{
            start = mid+1;
        }
            
    }
    return false;
}
}


//2d approach 

class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = 0;
        int col = arr[row].length-1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return true;
            }
            if (arr[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
}
