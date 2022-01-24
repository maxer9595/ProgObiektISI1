package pl.edu.uwm.wmii.marcelmrozowski.laboratorium09;

public class PairUtilDemo {

    public static void main(String[] args)
    {
        String[] words = { "Max", "to", "jest", "i", "ja" };
        PairUtil<String> mm = ArrayAlg1.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        PairUtil.swap(mm);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg1 {

    public static PairUtil<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new PairUtil<String> (min, max);
    }
}
