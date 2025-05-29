class Solution {
    public int searchInsert(int[] nums, int target) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i] || target<nums[i]){
                return i;
            }
            else if(target>nums[i])
            {
                j++;
            }
        }
        return j;
    }
}
