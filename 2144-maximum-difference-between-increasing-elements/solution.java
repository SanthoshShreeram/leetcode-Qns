class Solution {
    public int maximumDifference(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int maxDiff=-1, min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min){
                maxDiff = Math.max(maxDiff, (nums[i]-min));
            }
            else{
                min=nums[i];
            }
        }
        return maxDiff;
    }
}
