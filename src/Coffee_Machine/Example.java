package src.Coffee_Machine;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        class A {

            private A() { }

            void invokeB() {
//                B objB = new B(); // (1)
//                int b = objB.b;   // (2)
//                int c = objB.c;   // (3)
            }
        }

        class B {

            protected int b;
            private int c;

            public void invokeA() {
                A objA = new A(); // (4)
            }
        }
    }

}