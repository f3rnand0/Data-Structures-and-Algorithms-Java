package data_structures.arrays.reverse_string;

import java.util.stream.Stream;

public class ReverseStringFGU {
    public static void main(String[] args) {
        String one = "My name is Fernando Guerra";
        String two = "";
        String three = "s";
        System.out.println("reverseString1 one: " + reverseString1(one));
        System.out.println("reverseString1 two: " + reverseString1(two));
        System.out.println("reverseString1 three: " + reverseString1(three));
        System.out.println("reverseString2 one: " + reverseString2(one));
        System.out.println("reverseString2 two: " + reverseString2(two));
        System.out.println("reverseString2 three: " + reverseString2(three));
    }

    public static String reverseString1 (String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str == null) {
            return "Not a valid String";
        } else if (str.length() < 2) {
            return str;
        }
        String reverse = "";
        int i = str.length() - 1;
        while (i >= 0) {
            char ch = str.charAt(i);
            reverse += ch;
            i--;
        }
        return reverse;
    }

    public static String reverseString2 (String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
