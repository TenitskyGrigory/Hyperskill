package src.Different_tasks;

/**
 * New Inner class
 * Inside your Vehicle create a new inner class Body.
 *
 * Body should have field String color, its constructor and method void printColor for printing the color.
 *
 * The output of the method printColor for a vehicle called Dixi with a red body will look like:
 *
 * Vehicle Dixi has red body.
 * Remember about constructor in the outer class.
 *
 * Please, don't use the access modifier private for a class or a method.
 */
public class NewInnerClass {
    static class Vehicle {

        private String name;

        public Vehicle(String name) {
            this.name = name;
        }


        class Engine {

            void start() {
                System.out.println("RRRrrrrrrr....");
            }

        }

        class Body {
            String color;

            public Body(String color) {
                this.color = color;
            }

            void printColor() {
                this.color = color;
                System.out.println("Vehicle " + name + " has " + color + " body.");

            }
        }
    }

    // this code should work
    class EnjoyVehicle {

        public static void main(String[] args) {

            Vehicle vehicle = new Vehicle("Dixi");
            Vehicle.Body body = vehicle.new Body("red");
            body.printColor();
        }
    }
}
