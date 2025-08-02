class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            return (nums[0]==target)?0:-1;
        }

        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
                int midVal = nums[mid];
            if((nums[mid]<nums[0]) == (target < nums[0])){
                midVal = nums[mid];
            }
            else{
                midVal = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            if(target == midVal){
                return mid;
            }
            else if(target < midVal){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
