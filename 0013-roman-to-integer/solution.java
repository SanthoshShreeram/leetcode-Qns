class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = Map.of(
            'I', Integer.valueOf(1),
            'V', Integer.valueOf(5),
            'X', Integer.valueOf(10),
            'L', Integer.valueOf(50),
            'C', Integer.valueOf(100),
            'D', Integer.valueOf(500),
            'M', Integer.valueOf(1000));
        int res = 0;
        for(int i=0;i<s.length()-1;i++){
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))){
                res -= roman.get(s.charAt(i)); 
            }
            else{
                res += roman.get(s.charAt(i));
            }
        }
        return res + roman.get(s.charAt(s.length()-1));
    }
}
