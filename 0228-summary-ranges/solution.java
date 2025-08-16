class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> s = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            if(start!=nums[i]){
                s.add(""+start+"->"+nums[i]);
            }
            else{
                s.add(""+start);
            }
        }
        return s;
    }
}
