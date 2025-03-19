package examples;
//旋转图像
public class Example13 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //反转
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            //镜像
            for(int k=0;k<n;k++) {
                int left = 0, right = n-1;
                while(left < right) {
                    int temp = matrix[k][left];
                    matrix[k][left] = matrix[k][right];
                    matrix[k][right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }
}
