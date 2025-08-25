package MediumProblems;

/**
 * @author shree
 **/
public class _M_74_SearchA2DMatrix {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 2));
    }
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix == null || matrix.length == 0){
                return false;
            }
            if(matrix[0].length == 0){
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
}
