package src.Different_tasks;

class Counter {

    protected int i = 1221;

    void printCount(){
        System.out.println(i);
    }

    void incCount(){
        i = i + 1;
    }

}

public class ExampleClass {

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.i);
    }

}