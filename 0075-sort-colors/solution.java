class Solution {
    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }
    public void mergeSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }
    public void merge(int[] nums, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++){
            L[i] = nums[start + i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = nums[mid + 1 + j];
        }
        int i = 0, j = 0, k = start;
        while(i < n1 && j < n2){
            if(L[i]<=R[j]){
                nums[k] = L[i];
                i++;
            }
            else{
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            nums[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            nums[k] = R[j];
            j++;k++;
        }
    }
}
