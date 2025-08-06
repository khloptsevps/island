package org.khloptsev.island;

public class Island {
    private final int HEIGHT;
    private final int WIDTH;
    private final Cell[][] GRID;

    public Island(int height, int width) {
        HEIGHT = height;
        WIDTH = width;
        GRID = new Cell[height][width];

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                GRID[y][x] = new Cell(new Position(x, y));
            }
        }
    }

    public void printIsland() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print("[" + GRID[y][x] + "] ");  // пока пустая клетка
            }
            System.out.println();
        }
    }
}
