//Binary Search Problem
//Solution 1
class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if (matrix[row][col]==target)
                return true;
            else if (matrix[row][col]>target)
                col--;
            else
                row++;
        }
        return false;
    }
}

//Solution 2
class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row*col;
        while (low<high){
            int mid = (high+low)/2;
            if (matrix[mid/col][mid%col]==target)
                return true;
            else if (matrix[mid/col][mid%col]>target)
                high = mid;
            else
                low = mid+1;
        }
        return false;
    }
}
