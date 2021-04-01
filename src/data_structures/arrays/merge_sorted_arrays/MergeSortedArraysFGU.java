package data_structures.arrays.merge_sorted_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArraysFGU {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[] {0,3,4,31};
        Integer[] array2 = new Integer[] {4,6,30};
        System.out.println("mergeSortedArrays1 one: " + Arrays.toString(mergeSortedArrays1(array1, array2)));
        System.out.println("mergeSortedArrays1 two: " + Arrays.toString(mergeSortedArrays1(new Integer[0], new Integer[0])));
        System.out.println("mergeSortedArrays2 one: " + Arrays.toString(mergeSortedArrays2(array1, array2)));
        System.out.println("mergeSortedArrays2 two: " + Arrays.toString(mergeSortedArrays2(new Integer[0], new Integer[0])));
    }

    public static Integer[] mergeSortedArrays1 (Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0, j = array1.length; j < (array1.length + array2.length); i++, j++) {
            mergedArray[j] = array2[i];
        }
        return mergedArray;
    }

    public static Integer[] mergeSortedArrays2 (Integer[] array1, Integer[] array2) {
        Integer[] mergedArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        return mergedArray;
    }
}
