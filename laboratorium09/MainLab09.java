package pl.edu.uwm.wmii.marcelmrozowski.laboratorium09;

import java.time.LocalDate;

public class MainLab09 {

    public static void main(String[] args) {
        Integer [] intniesort = new Integer[]{1,3,6,2,7};
        Integer [] intsort = new Integer[]{1,2,4,5,7,8};
        System.out.println(ArrayUtil2.isSorted(intniesort));
        System.out.println(ArrayUtil2.isSorted(intsort));
        LocalDate [] datesort = new LocalDate[]{LocalDate.parse("2011-12-31"),LocalDate.parse("2018-11-19"),LocalDate.parse("2015-11-22")};
        LocalDate [] dateniesort = new LocalDate[]{LocalDate.parse("2013-03-30"),LocalDate.parse("2017-02-22"),LocalDate.parse("2014-05-01")};
        System.out.println(ArrayUtil2.isSorted(datesort));
        System.out.println(ArrayUtil2.isSorted(dateniesort));

        Integer [] tab = new Integer[]{2,4,8,2,1};
        System.out.println(ArrayUtil2.binSearch(tab,7));
        LocalDate [] tab2 = new LocalDate[]{LocalDate.parse("2013-03-30"),LocalDate.parse("2018-11-19"),LocalDate.parse("2014-05-01")};
        System.out.println(ArrayUtil2.binSearch(tab2, LocalDate.parse("2011-12-31")));
        System.out.println("\n");

        Integer [] tabs = new Integer[]{1,6,7,3,5,6,2};
        ArrayUtil2.SelectionSort(tabs);
        for (int i : tabs){
            System.out.println(i);
        }
        LocalDate [] tab5 = new LocalDate[]{LocalDate.parse("2013-03-30"),LocalDate.parse("2018-11-19"),LocalDate.parse("2014-05-01")};
        ArrayUtil2.SelectionSort(tab5);
        for (LocalDate j : tab5){
            System.out.println(j);

        }
    }
}