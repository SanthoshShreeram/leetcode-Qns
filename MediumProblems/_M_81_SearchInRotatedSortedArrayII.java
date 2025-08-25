package MediumProblems;

/**
 * @author shree
 **/
public class _M_81_SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 0));
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3));
    }
    public static boolean search(int[] nums, int target){
        if(nums.length == 1){
            return nums[0] == target;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int midVal = nums[mid];
            if(target == midVal){
                return true;
            }
            if(nums[0] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
            }
            else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[high] >= target && target > nums[mid]){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
