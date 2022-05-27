package src.Different_tasks;

/**
 * Days of week
 * Declare an enum named DayOfWeek. It should include all days of the week in uppercase:
 * SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY.
 * The constants can be declared in any order.
 *
 * Do not make the enum public.
 */

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class DeclareAnEnumNamedDayOfWeek {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}

