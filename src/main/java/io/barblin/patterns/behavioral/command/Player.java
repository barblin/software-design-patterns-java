package io.barblin.patterns.behavioral.command;

public class Player {

    enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }

    private final Direction[] directions;
    private int rotation = 0;

    public Player() {
        this.directions = new Direction[]{Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
    }

    public Direction getDirection() {
        return this.directions[rotation];
    }

    // floorMod is necessary, because the mod (%) operator in Java returns the remainder.
    // With a negative number that would result in a negative remainder
    public void rotateLeft() {
        this.rotation = Math.floorMod((this.rotation - 1), directions.length);
    }

    public void rotateRight() {
        this.rotation = (this.rotation + 1) % directions.length;
    }
}
