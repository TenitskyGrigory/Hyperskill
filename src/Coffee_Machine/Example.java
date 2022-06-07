package src.Coffee_Machine;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
                int[][][] cube = new int[3][3][3];
                int element;

                for (int i = 0; i < cube.length; i++) {
                    element = 0;
                    for (int j = 0; j < cube[i].length; j++) {
                        for (int k = 0; k < cube[i][j].length; k++) {
                            cube[i][j][k] = element;
                            element++;
                        }
                    }
                }
                for (int i = 0; i < cube.length; i++) {
                    for (int j = 0; j < cube[i].length; j++) {
                        System.out.print(Arrays.toString(cube[i][j]) + " ");
                    }
                    System.out.println();
                }
            }
        }

