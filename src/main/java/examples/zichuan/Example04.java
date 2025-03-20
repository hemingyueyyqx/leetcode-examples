package examples.zichuan;

import java.util.Deque;
import java.util.LinkedList;

//滑动窗口最大值
public class Example04 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0 || k > nums.length) {
            return new int[0];
        }

        int[] maxArray = new int[nums.length+k-1];
        //暴力枚举，超时，时间复杂度O(nk)
//        for(int i=0;i<nums.length+k-1;i++) {
//            int currentMax = nums[i];
//            for(int j=i;j<i+k-1;j++) {
//                if(currentMax < nums[j]) {
//                    currentMax = nums[j];
//                }
//            }
//            maxArray[i] = currentMax;
//        }
        //优化，滑动窗口，时间复杂度O(n)，双向队列
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<nums.length;i++) {
            // 移除窗口最左边的元素的索引
            if(!deque.isEmpty() && nums[deque.peekFirst()] <= i-k) {
                deque.pollFirst();
            }
            //移除队列中比当前元素小的元素，保持队列单调递减
            //if 语句只会执行一次判断，若队列里有多个元素都小于当前元素 nums[i]，使用 if 只会移除队列尾部的一个小于 nums[i] 的元素，而不能保证队列中所有小于 nums[i] 的元素都被移除，也就无法保证队列始终是单调递减的。
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            //判断窗口是否已经滑出窗口
            if(i >= k-1) {
                maxArray[i-k+1] = nums[deque.peekFirst()];

            }
        }
        return maxArray;
    }
}
