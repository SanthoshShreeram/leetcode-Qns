package MediumProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shree
 **/
public class _M_451_SortCharactersByFrequency {
    public static String frequencySort(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character> charList = new ArrayList<>(map.keySet());
        charList.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c: charList){
            int freq = map.get(c);
            sb.append(String.valueOf(c).repeat(Math.max(0, freq)));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
