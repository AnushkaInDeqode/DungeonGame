package com.dungeonGame.businessLogic;
public class DungeonGame {
    public static int minInitialHealth(int dungeon[][], int rows, int cols) {

        int matrix[][] = new int[rows][cols];
        int m = rows, n = cols;

        matrix[m - 1][n - 1] = dungeon[m - 1][n - 1] > 0 ? 1 : Math.abs(dungeon[m - 1][n - 1]) + 1;

        for (int i = m - 2; i >= 0; i--)
            matrix[i][n - 1] = Math.max(matrix[i + 1][n - 1] - dungeon[i][n - 1], 1);
        for (int j = n - 2; j >= 0; j--)
            matrix[m - 1][j] = Math.max(matrix[m - 1][j + 1] - dungeon[m - 1][j], 1);

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int minPointsOnExit = Math.min(matrix[i + 1][j], matrix[i][j + 1]);
                matrix[i][j] = Math.max(minPointsOnExit - dungeon[i][j], 1);
            }
        }

        return matrix[0][0];
    }
}
