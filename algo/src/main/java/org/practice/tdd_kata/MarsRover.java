package org.practice.tdd_kata;

public class MarsRover {
    int y;
    int x;
    Direction direction;
    int height;
    int width;

    public MarsRover(int x, int y, char direction, int height, int width) {
        this.x = x;
        this.y = y;
        this.direction = Direction.valueOf(String.valueOf(direction));
        this.height = height;
        this.width = width;
    }


    public String execute(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command)  {
                case 'M' -> move();
                case 'L' -> direction = direction.turnLeft();
                case 'R' -> direction = direction.turnRight();
            }
        }
        return x + ":" + y + ":" + direction;
    }


    private void move() {
        x = (x + direction.dx() + width) % width;
        y = (y + direction.dy() + height) % height;
    }

}

enum Direction {
    N(0, 1),
    E(1,0),
    S(0, -1),
    W(-1, 0);


    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        return values()[(ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return values()[(ordinal() + 1) % 4];
    }

    public int dx() {return dx;};
    public int dy() {return dy;};
}