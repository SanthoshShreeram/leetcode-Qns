package MediumProblems;

/**
 * @author shree
 **/

//binary search

public class _M_33_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,1,2,3};
        System.out.println(searchInRotatedSortedArray(nums, 8));
    }
    private static int searchInRotatedSortedArray(int[] nums, int target){
        if(nums.length == 1){
            return (nums[0]==target)?0:-1;
        }
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int midVal;
            //check whether the target is in left side or right side or the midth element
            if(nums[mid] < nums[0] == target < nums[0]){
                midVal = nums[mid];
            }
            else{
                midVal = (target < nums[mid])? Integer.MIN_VALUE: Integer.MAX_VALUE;
            }
            if(target == midVal){
                return mid;
            }
            else if (target < midVal){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

}
