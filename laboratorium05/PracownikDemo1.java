package pl.edu.uwm.wmii.marcelmrozowski.laboratorium05;

import java.util.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class PracownikDemo1 {
    public static void main(String[] args) {
        Pracownik[] personel = new Pracownik[3];

        // wypełnij tablicę danymi pracowników
        personel[0] = new Pracownik("Jan Kowalski", 50000, 2001, 1, 3);
        personel[1] = new Pracownik("Marcin Wysocki", 20000, 2002, 2, 2);
        personel[2] = new Pracownik("Rafał Ptaszek", 10000, 2003, 3, 1);

        // zwieksz pobory każdego pracownika o 20%
        for (Pracownik e : personel) {
            e.zwiekszPobory(20);
        }

        // wypisz informacje o każdym pracowniku
        for (Pracownik e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tid = " + e.id());
            System.out.print("\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

        int n = Pracownik.getNextId(); // wywołanie metody statycznej
        System.out.println("Następny dostępny id = " + n);

    }
}

class Pracownik {

    public Pracownik(String nazwisko, double pobory, int year, int month, int day) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;

        // GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        dataZatrudnienia = LocalDate.of(year, month, day);

        id = nextId;
        ++nextId;
    }

    public String nazwisko() {
        return nazwisko;
    }

    public double pobory() {
        return pobory;
    }

    public LocalDate dataZatrudnienia() {
        return LocalDate.of(dataZatrudnienia.getYear(), dataZatrudnienia.getMonth(), dataZatrudnienia.getDayOfMonth());
    }

    public void zwiekszPobory(double procent) {
        double podwyżka = pobory * procent / 100;
        pobory += podwyżka;
    }

    public int id() {
        return id;
    }

    public void setId() {
        id = nextId;
        ++nextId;
    }

    public static int getNextId() {
        return nextId;
    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;

    private int id;
    private static int nextId = 1;
}
