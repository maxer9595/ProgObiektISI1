package pl.edu.uwm.wmii.marcelmrozowski.laboratorium08;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.Arrays;
import imiajd.nasiadka.*;
import java.time.LocalDate;

public class TestStudent
{
    public static void main(String[] args) {
        ArrayList<Student3> Grupa = new ArrayList<>();
        Grupa.add(0, new Student3("Maciejewski", LocalDate.of(1999, 12, 25), 4.0));
        Grupa.add(1, new Student3("Jankowski", LocalDate.of(1987, 10, 15), 4.5));
        Grupa.add(2, new Student3("Grzyb", LocalDate.of(1999, 12, 25), 3.5));
        Grupa.add(3, new Student3("Jankowski", LocalDate.of(1999, 9, 12), 4.0));
        Grupa.add(4, new Student3("Kowalski", LocalDate.of(1999, 8, 12), 3.5));

        System.out.println("Przed Sortowaniem");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(Grupa.get(i).toString());
        }
        System.out.println(Grupa.get(0).compareTo(Grupa.get(3)));
        System.out.println(Grupa.get(1).compareTo(Grupa.get(3)));
        Collections.sort(Grupa);
        System.out.println("Po Sortowaniu");
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println(Grupa.get(i).toString());
        }
    }
}