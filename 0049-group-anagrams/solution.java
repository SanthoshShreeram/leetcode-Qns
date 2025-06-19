class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strsMap = new HashMap<>();
        for(String str:strs){
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            if(!strsMap.containsKey(sortedWord)){
                strsMap.put(sortedWord, new ArrayList<>());
            }
            strsMap.get(sortedWord).add(str);
        }
        return new ArrayList<>(strsMap.values());
    }
}
