package org.khloptsev.island;

public class Cell {
    private final Position position;

    public Cell(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "{" +
                "y=" + position.getY() +
                ", x=" + position.getX() +
                '}';
    }
}
