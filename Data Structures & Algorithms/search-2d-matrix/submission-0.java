class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0,right=row*col-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int rows=mid/col;
            int column=mid%col;
            if(matrix[rows][column]<target)
            {
                left=mid+1;
            }
            else if(matrix[rows][column]>target)
            {
                right=mid-1;
            }
            else
            {
                return true;
            }
        }
        return false;

        
    }
}
