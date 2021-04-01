package coding_interview;

import java.util.HashSet;
import java.util.Set;

public class GoogleInterview {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[] {1, 2, 4, 9};
        Integer[] array2 = new Integer[] {2, 2, 4, 4};
        Integer[] array3 = new Integer[] {6, 4, 3, 2, 1, 7};
        Integer[] array4 = new Integer[] {};
        Integer[] array5 = new Integer[] {3,2,-3};
        System.out.println("hasPairWithSum1 array1: " + hasPairWithSum1(array1, 8));
        System.out.println("hasPairWithSum1 array2: " + hasPairWithSum1(array2, 8));
        //System.out.println("hasPairWithSum2 array1: " + hasPairWithSum2(array1, 8));
        System.out.println("hasPairWithSum2 array2: " + hasPairWithSum2(array2, 8));
        System.out.println("hasPairWithSum1 array3: " + hasPairWithSum1(array3, 9));
        System.out.println("hasPairWithSum2 array3: " + hasPairWithSum2(array3, 9));
        System.out.println("hasPairWithSum2 array4: " + hasPairWithSum2(array4, 0));
        System.out.println("hasPairWithSum2 array5: " + hasPairWithSum2(array5, 0));
    }

    public static boolean hasPairWithSum1(Integer[] arr, int sum) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;
    }

    public static boolean hasPairWithSum2(Integer[] arr, int sum) {
        Set mySet = new HashSet<Integer>();
        int len = arr.length;
        for (Integer integer: arr) {
            if (mySet.contains(integer)) {
                return true;
            }
            mySet.add(sum - integer);
        }
        return false;
    }
}
