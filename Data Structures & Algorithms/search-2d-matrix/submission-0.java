class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0){
            return false;
        }
        int ROWS = matrix.length;
        int COLS =matrix[0].length;
        
        int l=0; int r=ROWS*COLS-1;

        while(l<=r){
            int m =l+(r-l)/2;
            int row=m/COLS;
            int col=m%COLS;

            if(target==matrix[row][col]){
                return true;
            }else if(target>matrix[row][col]){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return false;
        
    }
}
