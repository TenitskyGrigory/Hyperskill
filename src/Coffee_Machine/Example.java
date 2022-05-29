package src.Coffee_Machine;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        enum Direction {
            EAST("E"),
            WEST("W"),
            NORTH("N"),
            SOUTH("S");

            private final String shortCode;

            Direction(String code) {
                this.shortCode = code;
            }

            public String getShortCode() {
                return this.shortCode;
            }
        }
        Direction.NORTH.toString();
        Direction.NORTH.getShortCode();
        Direction.NORTH.name();
        Direction.valueOf("NORTH");
    }

}