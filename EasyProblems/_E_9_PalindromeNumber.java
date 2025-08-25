package EasyProblems;

import java.util.Scanner;

/**
 * @author shree
 **/
public class _E_9_PalindromeNumber {
    public static boolean isPalindrome(int x){
//        int rev = 0;
//        int original = x;
//        while(x > 0){
//            int rem = x % 10;
//            rev = rev * 10 + rem;
//            x = x / 10;
//        }
//        System.out.println("original:"+original);
//        System.out.println("rev:"+rev);
//        if(rev == original){
//            return true;
//        }
        String s = String.valueOf(x);
        int n = s.length();
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        boolean flag = isPalindrome(x);
        System.out.println(flag);
    }
}
