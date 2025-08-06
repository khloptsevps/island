package org.khloptsev.island;

import java.util.Objects;

public class Position {
    private final int X;
    private final int Y;

    public Position(int x, int y) {
        X = x;
        Y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Position position)) return false;
        return X == position.X && Y == position.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }


}
