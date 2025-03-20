package examples.putongshuzu;
//最大子数组和
public class Example06 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(current <= 0){
                current = nums[i];
            }else{
              current += nums[i];
            }
            max = Math.max(max,current);
        }
        return max;
    }
}
