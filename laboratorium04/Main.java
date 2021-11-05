package pl.edu.uwm.wmii.marcelmrozowski.laboratorium04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // zad1
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++)
            lista1.add(i + 1);
        for (int i = 0; i < 5; i++)
            lista2.add(20 - i);
        System.out.println("lista1");
        System.out.println(lista1);
        System.out.println("lista2");
        System.out.println(lista2);
        ArrayList<Integer> test = Zadanie1.append(lista1, lista2);
        System.out.println("zad1");
        System.out.println(test);
        // zad2
        ArrayList<Integer> test2 = Zadanie2.merge(lista1, lista2);
        System.out.println("zad2");
        System.out.println(test2);
        // zad3
        ArrayList<Integer> test3 = Zadanie3.mergeSorted(lista1, lista2);
        System.out.println("zad3");
        System.out.println(test3);
        // zad4
        ArrayList<Integer> test4 = Zadanie4.reverse(lista1);
        System.out.println("zad4");
        System.out.println(test4);
        // zad5
        Zadanie5.reverse(lista1);
        System.out.println("zad5");
        System.out.println(lista1);
    }
}
