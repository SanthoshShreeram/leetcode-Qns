class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack  = new Stack<>();
       Map<Character, Character> pairMap = Map.of(
        ')','(',
        '}','{',
        ']','['
       );
       for(char c:s.toCharArray()){
        if(pairMap.containsValue(c)){
            stack.push(c);
        }
        else{
            if(stack.isEmpty() || stack.peek() != pairMap.get(c)){
                return false;
            }
            stack.pop();
        }
       }
        return stack.isEmpty();
    }
}
