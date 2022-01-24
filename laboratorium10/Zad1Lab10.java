package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;

import java.util.LinkedList;

public class Zad1Lab10 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        for (int i = 0; i < pracownicy.size(); i += (n - 1)) {
            pracownicy.remove(i);
        }
        System.out.println(pracownicy);
    }
}
