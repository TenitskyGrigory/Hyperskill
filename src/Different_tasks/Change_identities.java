package src.Different_tasks;

/**
 * Change identities
 * There is a class Person that has two fields: name and age.
 * Your task is to implement the method changeIdentities.
 * It should swap all information (age and name) between two persons p1 and p2.
 *
 * It is known that objects p1 and p2 can't be null.
 */

public class Change_identities {
    class Person {
        String name;
        int age;
    }

    class MakingChanges {
        public static void changeIdentities(Person p1, Person p2) {

            String str = null;
            int value = 0;

            str = p1.name;
            p1.name = p2.name;
            p2.name = str;

            value = p1.age;
            p1.age = p2.age;
            p2.age = value;
        }
    }
}
