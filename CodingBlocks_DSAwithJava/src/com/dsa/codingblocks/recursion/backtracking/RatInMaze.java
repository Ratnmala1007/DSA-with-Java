package com.dsa.codingblocks.recursion.backtracking;

public class RatInMaze {

    static void solve(int[][] maze, int i, int j, String path, int n, boolean[][] visited) {

        if (i == n - 1 && j == n - 1) {
            System.out.println(path);
            return;
        }

        visited[i][j] = true;

        // Down
        if (i + 1 < n && maze[i + 1][j] == 1 && !visited[i + 1][j])
            solve(maze, i + 1, j, path + "D", n, visited);

        // Right
        if (j + 1 < n && maze[i][j + 1] == 1 && !visited[i][j + 1])
            solve(maze, i, j + 1, path + "R", n, visited);

        // Up
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && !visited[i - 1][j])
            solve(maze, i - 1, j, path + "U", n, visited);

        // Left
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && !visited[i][j - 1])
            solve(maze, i, j - 1, path + "L", n, visited);

        visited[i][j] = false; // backtrack
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };

        int n = maze.length;

        boolean[][] visited = new boolean[n][n];

        solve(maze, 0, 0, "", n, visited);
    }
}