package src.Different_tasks;

/**
 * Pumpkin and candle
 * The logic is easy: if pumpkin is for Halloween, then you need to add a candle.
 *
 * Inside an outer class Pumpkin create a method void addCandle without parameters, which will do the following:
 *
 * if the field forHalloween is true, then create a new instance of Candle and call the method burning;
 * if not, print 'We don't need a candle.'
 * Please, don't use the private access modifier.
 */

public class Pumpkin {

    private boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        this.forHalloween = forHalloween;
    }

    void addCandle() {
        if (forHalloween) {
            Candle candle = new Candle();
            candle.burning();
        } else {
            System.out.println("We don't need a candle.");
        }

    }

    class Candle {

        void burning() {
            System.out.println("The candle is burning! Boooooo!");
        }
    }
}

