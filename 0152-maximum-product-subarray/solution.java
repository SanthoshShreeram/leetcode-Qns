class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int globalMax = nums[0], currentMax = nums[0], currentMin = nums[0];
        for(int i=1;i<nums.length;i++){
            int num = nums[i];
            int temp = currentMax;
            currentMax = Math.max(num, Math.max(num*temp, num*currentMin));
            currentMin = Math.min(num, Math.min(num*temp, num*currentMin));
            globalMax = Math.max(globalMax, currentMax);
        }
        return globalMax;
    }
}
