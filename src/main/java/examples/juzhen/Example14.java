package examples.juzhen;
//搜索二维矩阵
public class Example14 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row:matrix) {
            int index = search(row,target);
            if(index >= 0) {
                return true;
            }
        }
        return false;
    }
    public int search(int[] nums,int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
