package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Vector;

public class mainlab10 {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();

        names.add("Nowak");
        names.add("Janowski");
        names.add("Mariacki");
        names.add("Japak");
        names.add("Mopicki");
        names.add("Danan");

        Zad1Lab12.redukuj(names, 4);
        Zad3Lab12.odwroc(names);

        System.out.print(names);

        Stack<String> stryng = new Stack<String>();
        stryng.push("Ala");
        stryng.push("ma");
        stryng.push("kota.");
        stryng.push("Jej");
        stryng.push("kot");
        stryng.push("lubi");
        stryng.push("myszy.");
        Zad5Lab12.odwracaj(stryng);

        Zad6Lab122.podziel(1999);

        LinkedList<Integer> Primes = Zad7Lab12.sito_erastotenesa(50);
        System.out.print(Primes);


        LinkedList<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        liczby.add(4);
        liczby.add(5);
        liczby.add(6);
        Zad8Lab12.print(liczby);

    }
}


