class Solution {
    public int mySqrt(int x) {
        int start = 0, end = x, mid = 0;
        while (start<=end) {
            mid = start + (end - start)/2;
            if((long)mid*mid<=x && (long)(mid + 1)*(mid + 1) > x ) {
                return mid;
            }
            else if ((long)mid*mid < x) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}