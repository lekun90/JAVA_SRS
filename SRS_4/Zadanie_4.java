import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class Zadanie_4 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] res = updateMatrix(mat);
        System.out.println(Arrays.deepToString(res));
    }
    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[] {i, j});
                }
                else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[] dirs = {-1, 0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            for (int i = 0; i < 4; i++) {
                int r = cell[0] + dirs[i];
                int c = cell[1] + dirs[i + 1];
                if (r < 0 || r >= m || c < 0 || c >= n ||
                        mat[r][c] <= mat[cell[0]][cell[1]] + 1) continue;
                queue.add(new int[] {r, c});
                mat[r][c] = mat[cell[0]][cell[1]] + 1;
            }
        }

        return mat;
    }
}
