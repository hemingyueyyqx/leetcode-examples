package examples;

import java.util.HashMap;

//最小覆盖子串(好难！不会！不会！)
public class Example05 {
    public String minWindow(String s, String t) {
        if(s==null||t==null||s.length()<t.length()) {
            return "";
        }
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(Character c : t.toCharArray()) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0,right = 0;
        int valid = 0;
        int start = 0,len = s.length()+1;
        while(right<s.length()) {
            Character c = s.charAt(right);
            if(need.containsKey(c) && window.get(c)<=need.get(c)) {
                valid++;
            }
            while(valid==need.size()) {
                if(right-left+1<len) {
                    start = left;
                    len = right-left+1;
                }
                Character d = s.charAt(left);
                window.put(d, window.get(start) - 1);
                if(need.containsKey(d) && window.get(d)<=need.get(d)) {
                    valid--;
                }
                left++;
            }
            right++;

        }
        return len == s.length() + 1 ? "" : s.substring(start,start+len);
    }
}
