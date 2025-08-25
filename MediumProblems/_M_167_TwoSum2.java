package MediumProblems;

import java.util.Arrays;

/**
 * @author shree
 **/
public class _M_167_TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start + 1, end + 1};
            }
            else if(sum < target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 7, 11};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
