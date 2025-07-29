class Solution {
public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length+nums2.length];
        double result;
        int index = 0;
        for(int n:nums1){
            merged[index++] = n;
        }
        for(int n:nums2){
            merged[index++] = n;
        }
        Arrays.sort(merged);
        if((merged.length & 1) == 1){
            result = merged[merged.length/2];
        }
        else{
            result = (merged[merged.length/2-1] + merged[merged.length/2])/(double)2;
        }

        return result;
    }
}
