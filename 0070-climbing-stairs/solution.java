class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int total = 0;
        int oneStepBefore = 2;
        int twoStepBefore = 1;
        for(int i=3;i<=n;i++){
            total = oneStepBefore + twoStepBefore;
            twoStepBefore = oneStepBefore;
            oneStepBefore = total;
        }
        return total;
    }
}
