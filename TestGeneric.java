#Simple Generic Program.

package testgeneric;

import java.util.Arrays;

public class TestGeneric {
    public static void main(String[] args) {
        Integer []inar={10,5,66,25,3,4,23};
        Float []flar={1.2f,3.5f,8.01f,6.2f};
        Character []charr={'a','e','i','o','u'};
        printArry(inar); printArry(flar);printArry(charr);
        printSorted(inar);printSorted(flar);printSorted(charr);
    }

    private static<j> void printSorted(j[] ar) {
        Arrays.sort(ar);
        for(j i:ar)
            System.out.printf("%s   ",i);
        System.out.println();
    }

    private static <T>void printArry(T[] arr) {
    for(T i: arr)
        System.out.printf("%s   ",i);
    System.out.println();
    }

}
