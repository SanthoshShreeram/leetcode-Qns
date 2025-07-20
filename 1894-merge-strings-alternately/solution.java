class Solution {
    StringBuilder sb = new StringBuilder();
    public String mergeAlternately(String word1, String word2) {
        int length = Math.max(word1.length(), word2.length());
        for(int i=0;i<length;i++){
            addLetter1(i, word1);
            addLetter2(i, word2);        
        }
        return sb.toString();
    }
    public void addLetter1(int i, String word1){
        if(i>=word1.length()){
            return;
        }
        sb.append(word1.charAt(i));
    }
    public void addLetter2(int i, String word2){
        if(i>=word2.length()){
            return;
        }
        sb.append(word2.charAt(i));
    }
}
