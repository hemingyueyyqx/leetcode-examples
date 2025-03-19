package examples;
//缺失的第一个正数
import java.util.Arrays;
import java.util.Comparator;

public class Example10 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == res) {
                res++;
            }
        }
        return res;
    }
}
