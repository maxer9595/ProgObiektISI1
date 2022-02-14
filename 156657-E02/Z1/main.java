package Z1;

import java.lang.Character.Subset;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Integer[] sortedInts = new Integer[] { 5, 7, 94, 901, 902, 902, 5221 };
        Integer[] unsortedInts = new Integer[] { 321, 9, 2137, 214 };
        LocalDate[] sortedDates = new LocalDate[] {
                LocalDate.of(2020, 8, 2),
                LocalDate.of(2020, 10, 16),
                LocalDate.of(2020, 11, 21),
                LocalDate.of(2021, 5, 13)
        };
        LocalDate[] unsortedDates = new LocalDate[] {
                LocalDate.of(2021, 8, 29),
                LocalDate.of(2019, 11, 1),
                LocalDate.of(2020, 3, 6),
                LocalDate.of(2021, 12, 3)
        };
        String[] sortedString = new String[] {
                "Aa",
                "Bb",
                "Cc",
                "Dd",
                "Ee",
        };
        String[] unsortedString = new String[] {
                "Bb",
                "Aa",
                "Ee",
                "Dd",
                "Cc",
        };
        System.out.println(ArrayUtil.isSorted(sortedInts));
        System.out.println(ArrayUtil.isSorted(unsortedInts));
        System.out.println(ArrayUtil.isSorted(sortedDates));
        System.out.println(ArrayUtil.isSorted(unsortedDates));
        System.out.println(ArrayUtil.isSorted(sortedString));
        System.out.println(ArrayUtil.isSorted(unsortedString));
    }

    static class ArrayUtil {
        public static <T extends Comparable<T>> boolean isSorted(T[] array) {
            for (int i = 0; i < array.length - 1; i++)
                if (array[i + 1].compareTo(array[i]) < 0)
                    return false;
            return true;
        }
    }
}
