class Solution {
    StringBuilder sb = new StringBuilder("a");
    public char kthCharacter(int k) {
    // while(sb.length() < k){
    //     int size = sb.length();
    //     for(int i=0; i<size; i++){
    //         sb.append((char)('a'+(((sb.charAt(i)-'a')+1)%26)));
    //     }
    // }
    // return sb.charAt(k-1);


    if(sb.length()>=k){
        return sb.charAt(k-1);
    }
    int size = sb.length();
    for(int i=0;i<size;i++){
        sb.append((char)('a'+(((sb.charAt(i)-'a')+1)%26))); 
        }
        return kthCharacter(k);
    }
}
