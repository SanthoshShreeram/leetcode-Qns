package EasyProblems;

import java.util.Arrays;

/**
 * @author shree
 **/
public class _E_344_ReverseString {
    public static void reverseString(char[] s){
//        for(int i = 0; i<s.length / 2;i++){
//            char temp = s[i];
//            s[i] = s[s.length - 1 - i];
//            s[s.length - 1 - i] = temp;
//        }
        int start = 0, end = s.length - 1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }


}
