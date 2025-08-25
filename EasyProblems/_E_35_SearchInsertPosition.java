package EasyProblems;

/**
 * @author shree
 **/
public class _E_35_SearchInsertPosition {
    public static int searchInput(int[] nums, int target){
        for(int i = 0; i<nums.length - 1; i++){
            if(target == nums[i]){
                return i;
            }
            if(target < nums[i+1] && target > nums[i]){
                return i+1;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInput(nums,target));

    }
}
