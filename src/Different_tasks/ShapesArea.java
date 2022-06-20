package src.Different_tasks;

/**
 * ou have five classes: Shape, Triangle, Circle, Square, and Rectangle. The class Shape has a method area().
 * This method does nothing. Override the method in all subclasses. Overridden methods should return an area of a particular figure.
 * Use class fields for this.
 *
 * The area of a triangle is S=bh/2 where h is the height of the triangle, b is the base of the triangle.
 *
 * The area of a circle is S=πR2 where R is the radius of the circle. For π use the Math.PI constant.
 *
 * The area of a square is S=s2 where s is the length of the side of the square.
 *
 * The area of a rectangle is S=wh where w is the width of the rectangle and h the height of the rectangle.
 */

public class ShapesArea {
    class Shape {
        public double area() {
            return 0;
        }
    }

    class Triangle extends Shape {
        double height;
        double base;

        public double area() {
            return height * (base / 2);
        }
    }

    class Circle extends Shape {
        double radius;

        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    class Square extends Shape {
        double side;

        public double area() {
            return Math.pow(side, 2);
        }
    }

    class Rectangle extends Shape {
        double width;
        double height;

        public double area() {
            return width * height;
        }
    }
}
