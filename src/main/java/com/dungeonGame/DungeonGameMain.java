package com.dungeonGame;

import com.dungeonGame.businessLogic.DungeonGame;

public class DungeonGameMain {

    public static void main(String args[]) {

        DungeonGame dungeonGame=new DungeonGame();

        int rows = 3, cols = 3;
        int dungeon[][] = {
                            { -2, -3, 3 },
                            { -5, -10, 1 },
                            { 10, 30, -5 }
                        };

        System.out.println("Minimum Initial Points Required: "
                                    + dungeonGame.minInitialHealth(dungeon, rows, cols));
    }
}
