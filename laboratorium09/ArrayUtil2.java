package pl.edu.uwm.wmii.marcelmrozowski.laboratorium09;

import java.util.*;

public class ArrayUtil2<T> {
    T [] tab;
    public  ArrayUtil2 (T [] tab){
        this.tab=tab;
    }
    static  <T extends Comparable> boolean isSorted(T [] a){
        if (a == null || a.length == 0) {
            return false;
        }
        for(int i=1;i<a.length;i++){
            if(a[i-1].compareTo(a[i])>0){
                return false;
            }
        }
        return true;
    }
    static  <T extends Comparable> int binSearch(T[]a, T s){
        int ind = -1;
        for (int i=0;i<a.length;i++){
            if (a[i].equals(s)){
                ind=i;
            }
        }
        return ind;

    }
    static  <T extends Comparable> void SelectionSort(T[]a) {
        T tmp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i].compareTo(a[j]) >= 0) {
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }
    public static <T extends Comparable<? super T>>  void mergeSort(ArrayList<T> tab){
        if (tab.size() > 1) {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();
            boolean logicalSwitch = true;
            while (!tab.isEmpty()) {
                if (logicalSwitch) {
                    left.add(tab.remove(0));
                } else {
                    right.add(tab.remove(tab.size()/2));
                }
                logicalSwitch = !logicalSwitch;
            }
            mergeSort(left);
            mergeSort(right);
            while (!left.isEmpty() && !right.isEmpty()) {
                if(left.get(0).compareTo(right.get(0)) <= 0){
                    tab.add(left.remove(0));
                }
                else {
                    tab.add(right.remove(0));
                }
            }
            if(!left.isEmpty()){
                tab.addAll(left);
            }
            else if (!right.isEmpty()){
                tab.addAll(right);
            }
        }
    }
}
