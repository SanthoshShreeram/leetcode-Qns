class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix == null ){
            return false;
        }
        int start = 0, end = matrix.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int firstElement = matrix[mid][0];
            int lastElement = matrix[mid][matrix[0].length-1];
            if(target == firstElement || target == lastElement){
                return true;
            }
            if(target >= firstElement && target <= lastElement){
                return binarySearch(matrix[mid], target);
            }
            if(target < firstElement){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        
        }
        return false;
    }

    public boolean binarySearch(int[] matrix, int target){
        int low = 0, high = matrix.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int midVal = matrix[mid];
            if(target == midVal){
                return true;
            }
            if(target < midVal){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
