package examples;
//矩阵置零
public class Example11 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // 标记行和列是否需要置零
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        // 遍历矩阵，标记需要置零的行和列
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        // 遍历矩阵，根据标记置零
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
