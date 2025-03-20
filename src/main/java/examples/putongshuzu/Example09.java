package examples.putongshuzu;
//除自身以外数组的乘积
public class Example09 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        // 前缀乘积
        for(int i=1;i<nums.length;i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        // 后缀乘积
        int right = 1;
        for(int i=nums.length-1;i>=0;i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
