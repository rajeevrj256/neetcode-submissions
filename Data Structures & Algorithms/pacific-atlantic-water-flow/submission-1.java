class Solution {

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public void dfs(int[][] heights, int i, int j, boolean[][] vis) {

        int n = heights.length;
        int m = heights[0].length;

        vis[i][j] = true;

        for (int k = 0; k < 4; k++) {

            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 0 && ny >= 0 &&
                nx < n && ny < m &&
                !vis[nx][ny] &&
                heights[nx][ny] >= heights[i][j]) {

                dfs(heights, nx, ny, vis);
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        // Pacific: top row + left column
        for (int i = 0; i < n; i++) {
            dfs(heights, i, 0, pacific);
        }

        for (int j = 0; j < m; j++) {
            dfs(heights, 0, j, pacific);
        }

        // Atlantic: bottom row + right column
        for (int i = 0; i < n; i++) {
            dfs(heights, i, m - 1, atlantic);
        }

        for (int j = 0; j < m; j++) {
            dfs(heights, n - 1, j, atlantic);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }
}