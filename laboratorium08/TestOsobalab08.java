package pl.edu.uwm.wmii.marcelmrozowski.laboratorium08;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.Arrays;
import imiajd.nasiadka.*;
import java.time.LocalDate;

public class TestOsobalab08
{
    public static void main(String[] args) {
        ArrayList<Osoba3> Grupa = new ArrayList<>();
        Grupa.add(0, new Osoba3("Maciejewski", LocalDate.of(1999, 12, 25)));
        Grupa.add(1, new Osoba3("Jankowski", LocalDate.of(1987, 10, 15)));
        Grupa.add(2, new Osoba3("Grzyb", LocalDate.of(1999, 12, 25)));
        Grupa.add(3, new Osoba3("Jankowski", LocalDate.of(1999, 9, 12)));
        Grupa.add(4, new Osoba3("Kowalski", LocalDate.of(1999, 8, 12)));

        System.out.println("Przed Sortowaniem");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(Grupa.get(i).toString());
        }
        System.out.println(Grupa.get(0).compareTo(Grupa.get(2)));
        System.out.println(Grupa.get(1).compareTo(Grupa.get(3)));
        Collections.sort(Grupa);
        System.out.println("Po Sortowaniu");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(Grupa.get(i).toString());
        }
    }
}