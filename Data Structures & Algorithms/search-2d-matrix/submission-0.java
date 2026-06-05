class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int ROW = matrix.length;
        int COL = matrix[0].length;
        int left = 0, right = ROW * COL - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            int row_find = mid/COL;
            int col_find = mid%COL;
            int val = matrix[row_find][col_find];
            if(val == target)
                return true;
            else if(val < target)  
                left = mid + 1;
            else
                right = mid - 1;      
        }
        return false;
    }
}
