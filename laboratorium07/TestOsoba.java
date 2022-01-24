package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07;

import pl.edu.uwm.wmii.marcelmrozowski.laboratorium08.pl.imiajd.mrozowski.Osoba;
import pl.edu.uwm.wmii.marcelmrozowski.laboratorium08.pl.imiajd.mrozowski.Pracownik;
import pl.edu.uwm.wmii.marcelmrozowski.laboratorium08.pl.imiajd.mrozowski.Student;

public class TestOsoba {
    public static void main(String[] args){
        String[] imionka = {"new String", "New String"};
        Osoba test1 = new Osoba(imionka, "Maksiomow", 1950, 5, 20, true);

        System.out.println(test1.getImiona());
        System.out.println(test1.getDataUrodzenia());
        System.out.println(test1.getPlec());

        Pracownik test2 = new Pracownik(imionka, "Maksiomow", 1950, 5, 20, true, 2000.0, 1972, 5, 20);

        System.out.println(test2.getDataZatrudnienia());

        Student test3 = new Student(imionka, "Maksiomow", 1950, 5, 20, true, "Informatyka", 4.5);

        System.out.print(test3.getSredniaOcen());
    }
}
