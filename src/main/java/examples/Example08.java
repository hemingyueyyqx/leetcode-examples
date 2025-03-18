package examples;




//轮转数组
public class Example08 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(len == 0 || k == 0 || k % len == 0) {
            return;
        }
        k = k % len;
//        nums = [1,2,3,4,5,6,7], k = 3
        reverse(nums,0,len-1);//翻转整个数组
        reverse(nums,0,k-1);//翻转前k个
        reverse(nums,k,len-1);//翻转后k个
    }
    public void reverse(int[] nums,int start,int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
