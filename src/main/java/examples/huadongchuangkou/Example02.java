package examples.huadongchuangkou;

import java.util.ArrayList;
import java.util.List;
//找到字符串中所有字母异位词
public class Example02 {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        // 如果 s 的长度小于 p 的长度，直接返回空列表
        if(sLen < pLen) {
            return result;
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        //记录频率
        for(Character c : p.toCharArray())  {
            pCount[c-'a'] ++;
        }
        for(int i=0;i<sLen;i++) {
            // 加入当前字符
            sCount[s.charAt(i)-'a']++;
            // 如果窗口大小超过 p 的长度，移除窗口最左边的字符
            if(i>=pLen) {
                sCount[s.charAt(i-pLen)-'a']--;
            }
            Boolean flag = true;
            // 比较窗口内字符的频率和 p 中字符的频率
            for(int j=0;j<26;j++) {
                if(sCount[j]!=pCount[j]) {
                    flag=false;
                    break;// 发现不相等，立即跳出循环
                }
            }
            if(flag) {
                result.add(i-pLen+1);
            }
        }
        return result;
    }
}
