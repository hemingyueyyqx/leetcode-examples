package examples.zichuan;

import java.util.HashMap;

//和为 K 的子数组
public class Example03 {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
//        暴力枚举
//        for(int i=0;i<nums.length;i++) {
//            int sum = 0;
//            for(int j=i;j<nums.length;j++) {
//                sum += nums[j];
//                if(sum == k) {
//                    result++;
//                }
//            }
//        }
//        前缀和，哈希map
//        记录前缀和的次数，如果存在前缀和为 k 的情况，则计数器加一
        int pre = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums) {
//            记录前缀和
            pre += num;
            if(map.containsKey(pre-k)) {
                result += map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return result;
    }
}
