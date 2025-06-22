class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int size = s.length();
        int currentIndex = 0;
        while(currentIndex < size){
            list.add(s.substring(currentIndex, Math.min(currentIndex+k, size)));
            currentIndex+=k;
        }
        String lastSubString = list.get(list.size()-1);
        if(lastSubString.length() < k){
            lastSubString+=String.valueOf(fill).repeat(k-lastSubString.length());
            list.set(list.size() - 1, lastSubString);
        }
        return list.toArray(new String[0]);
    }
}
