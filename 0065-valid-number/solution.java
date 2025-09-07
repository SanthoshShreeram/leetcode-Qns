public class Solution {
    public boolean isNumber(String s) {
        if (s == null) return false;
        s = s.trim();
        int n = s.length();
        if (n == 0) return false;
        int signCount = 0;
        boolean hasE = false;
        boolean hasNum = false;
        boolean hasPoint = false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!isValid(c)) return false;
            if (c >= '0' && c <= '9') hasNum = true;
            if (c == 'e' || c == 'E') {
                if (hasE || !hasNum) return false;
                if (i == n - 1) return false;
                hasE = true;
            }
            if (c == '.') {
                if (hasPoint || hasE) return false;
                if (i == n - 1 && !hasNum) return false;
                hasPoint = true;
            }
            if (c == '+' || c == '-') {
                if (signCount == 2) return false;
                if (i == n - 1) return false;
                if (i > 0 && !(s.charAt(i-1)=='e'||s.charAt(i-1)=='E')) return false;
                signCount++;
            }
        }
        return true;
    }
    boolean isValid(char c) {
        return c == '.' || c == '+' || c == '-' || c == 'e' || c == 'E' || c >= '0' && c <= '9';
    }
}
