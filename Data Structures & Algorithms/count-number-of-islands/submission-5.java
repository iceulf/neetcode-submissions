class Solution {
    public int numIslands(char[][] grid) {
        var visited = new HashSet<String>();
        var result = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, new int[]{i, j}, visited)) {
                    result += 1;
                }
            }
        }

        return result;
    }

    private boolean dfs(char[][] grid, int[] start, Set<String> visited) {
        var row = start[0]; 
        var col = start[1];
        var pos = row + ":" + col;

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0') {
            return false;
        } 

        if (visited.contains(pos)) {
            return false;
        }

        visited.add(pos);

        dfs(grid, new int[]{row, col - 1}, visited);
        dfs(grid, new int[]{row, col + 1}, visited);
        dfs(grid, new int[]{row + 1, col}, visited);
        dfs(grid, new int[]{row - 1, col}, visited);

        return true;
    }
}
