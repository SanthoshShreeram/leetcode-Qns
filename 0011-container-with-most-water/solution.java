class Solution {
    public int maxArea(int[] height) {
        int start=0, end=height.length-1, maxArea=0, width=0, currentArea=0,min_height=0;
        while(start<end){
            width=end-start;
            min_height=min_num(height[start], height[end]);
            currentArea = min_height*width;
            maxArea=max_num(maxArea, currentArea);
            if(height[start]<height[end])
            start++;
            else
            end--;
        }
        return maxArea;

    }
    public int max_num(int n, int m){
        int max=0;
        if(n>m)
        max=n;
        else
        max=m;
        return max;
    }
    public int min_num(int n, int m){
        int min=0;
        if(n<m)
        min=n;
        else
        min=m;
        return min;
    }

}
