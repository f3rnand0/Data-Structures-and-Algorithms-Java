package data_structures.hashtables.first_recurring_character;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurringFGU {
    public static int firstRecurringCharacter(int[] array) {
        Set<Integer> comparedInts = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                if (!comparedInts.contains(array[i]))
                    comparedInts.add(array[i]);
                else
                    return array[i];
            }
            else
                return array[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("recurring integer1: " + firstRecurringCharacter(new int[]{2,5,1,2,3,5,1,2,4}));
        System.out.println("recurring integer2: " + firstRecurringCharacter(new int[]{2,1,1,2,3,5,1,2,4}));
        System.out.println("recurring integer3: " + firstRecurringCharacter(new int[]{2,5,5,2,3,5,1,2,4}));
    }
}
