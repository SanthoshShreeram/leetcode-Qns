package MediumProblems;

import java.util.Arrays;

/**
 * @author shree
 **/
public class _M_34_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
    }
    private static int[] searchRange(int[] nums, int target){
        int[] result = {-1,-1};
        if(nums == null || nums.length == 0){
            return result;
        }
        result[0] = findStartIndex(nums, target);
        result[1] = findEndIndex(nums, target);
        return result;
    }
    private static int findStartIndex(int[] nums, int target){
        int low = 0, high = nums.length - 1, start = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int midVal = nums[mid];
            if(target == midVal){
                start = mid;
                high = mid -1;
            }
            else if(target < midVal){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return start;
    }
    private static int findEndIndex(int[] nums, int target){
        int low = 0, high = nums.length - 1, end = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int midVal = nums[mid];
            if(target == midVal){
                end = mid;
                low = mid + 1;
            }
            else if(target < midVal){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return end;
    }

}
