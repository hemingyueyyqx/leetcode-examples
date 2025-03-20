package examples.huadongchuangkou;

import java.util.HashSet;
//无重复字符的最长子串
public class Example01 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

    }
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        int maxLength=0;
        for( right=0;right<s.length();right++) {
//
                //集合已经存在该元素,移动左指针
                while(set.contains(s.charAt(right))) {
//                  移除左指针指向的字符是为了动态调整滑动窗口的大小，确保窗口内的字符始终不重复。通过不断移动左指针和右指针，我们可以在遍历字符串的过程中找到不含有重复字符的最长子串。
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);


        }
        return maxLength;
    }
}
