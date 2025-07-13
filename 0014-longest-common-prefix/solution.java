class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        int minLength = strs[0].length();
        for(int i=1;i<strs.length;i++){
            minLength = Math.min(minLength, strs[i].length());
        }
        System.out.print(minLength);
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<minLength){
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)  != strs[j+1].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
            i++;
        }
        return sb.toString();
    }
}
