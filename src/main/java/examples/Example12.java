package examples;

import java.util.ArrayList;
import java.util.List;

//螺旋矩阵
public class Example12 {
    public List<Integer> spiralOrder(int[][] matrix) {
     int m = matrix.length;
     int n = matrix[0].length;
     List<Integer> res = new ArrayList<>();
     // 边界
     int top = 0, bottom = m-1, left = 0, right = n-1;
     while(top <= bottom && left <= right) {
        // 从左到右
         for(int i=left;i<=right;i++) {
             res.add(matrix[top][i]);
         }
         top++;
         // 从上到下
         for(int i=top;i<=bottom;i++) {
             res.add(matrix[i][right]);
         }
         right--;
         // 从右到左
         if(top <= bottom) {
             for(int i=right;i>=left;i--) {
                 res.add(matrix[bottom][i]);
             }
         }
         bottom--;
         // 从下到上
         if(left <= right) {
             for(int i=bottom;i>=top;i--) {
                 res.add(matrix[i][left]);
             }
         }
         left++;
     }
     return res;
    }
}
