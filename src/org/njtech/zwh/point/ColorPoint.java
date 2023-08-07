package org.njtech.zwh.point;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String toString() {
        return String.format("(%d %d %s)", super.getX(), super.getY(), this.color);
    }
}
