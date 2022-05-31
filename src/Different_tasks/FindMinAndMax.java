package src.Different_tasks;

import java.util.Scanner;


class ArrayCalc {
        // static nested class
        public static class MinMaxPair {
            private int min;
            private int max;

            public MinMaxPair(int first, int second) {
                this.min = first;
                this.max = second;
            }

            public int getMin() {
                return min;
            }

            public int getMax() {
                return max;
            }
        }

        // find min and max elements
        public static MinMaxPair findMinMax(int[] array) {

            int max = getMax(array);
            int min = getMin(array);

            return new MinMaxPair(min, max);
        }

    public static int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue)
                maxValue = array[i];
        }
        return maxValue;
    }

    public static int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue)
                minValue = array[i];
        }
        return minValue;
    }
}


class FindMinAndMax {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // input array
            int[] array = new int[10];
            for (int i = 0; i < 10; i++) {
                array[i] = scanner.nextInt();
            }

            ArrayCalc.MinMaxPair p = ArrayCalc.findMinMax(array);

            System.out.println("min = " + p.getMin());
            System.out.println("max = " + p.getMax());
        }
    }

