package src.Different_tasks;

/**
 * Christmas tree
 * You have an outer class ChristmasTree and an inner class TreeTopper. Both classes have the field color.
 *
 * In TreeTopper class create method void sparkle.
 *
 * For silver tree topper and green Christmas tree the output of sparkle will be:
 *
 * Sparkling silver tree topper looks stunning with green Christmas tree!
 * In the outer class create a method void putTreeTopper with one string parameter color.
 * In this method, you should create an instance of an inner class with parameter color,
 * then call method sparkle of TreeTopper.
 *
 * Please, don't use private access modifier for methods.
 */
public class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

    void putTreeTopper(String color) {
        TreeTopper treeTopper = new TreeTopper(color);
        treeTopper.sparkle();
    }

    class TreeTopper {

        private String color;

        public TreeTopper(String color) {
            this.color = color;
        }

        void sparkle() {
            System.out.println("Sparkling " + color + " tree topper looks stunning with "
                    + ChristmasTree.this.color + " Christmas tree!");
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}

