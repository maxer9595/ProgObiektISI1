package pl.edu.uwm.wmii.marcelmrozowski.laboratorium11;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestZadanie3Lab11 {
    public static void main(String[] args) {
        ArrayList<Student> studenci=new ArrayList<>();
        TreeMap<Student, String> oceny=new TreeMap<>();
        Scanner scaner=new Scanner(System.in);
        label:
        while(true)
        {
            String wybor;
            String imie;
            String nazwisko;
            int id;
            String ocena;
            System.out.println("Choose option from this: dodaj, usun, zmien, wypisz, zakoncz");
            wybor = scaner.next();
            switch (wybor) {
                case "dodaj": {
                    System.out.println("Wpisz imie:");
                    imie = scaner.next();
                    System.out.println("Wpisz nazwisko:");
                    nazwisko = scaner.next();
                    System.out.println("Wpisz ocene:");
                    ocena = scaner.next();
                    Student st = new Student(imie, nazwisko);
                    studenci.add(st);
                    oceny.put(st, ocena);
                    break;
                }
                case "usun": {
                    System.out.println("Wpisz id ucznia do usuniecia:");
                    id = scaner.nextInt();
                    Student st;
                    for (int i = 0; i < studenci.size(); i++) {
                        if (studenci.get(i).getStudent_id() == id) {
                            st = studenci.get(i);
                            studenci.remove(st);
                            oceny.remove(st);
                        }
                    }
                    break;
                }
                case "zmien": {
                    System.out.println("Wpisz id ucznia do zmiany oceny");
                    id = scaner.nextInt();
                    System.out.println("Wpisz nowa ocene:");
                    ocena = scaner.next();
                    Student st;
                    for (Student student : studenci) {
                        if (student.getStudent_id() == id) {
                            st = student;
                            oceny.replace(st, ocena);
                        }
                    }
                    break;
                }
                case "wypisz":
                    for (Map.Entry<Student, String> entry : oceny.entrySet()) {
                        System.out.println(entry.getKey().getNazwisko() + " " + entry.getKey().getImie() + " id: " + entry.getKey().getStudent_id() + " ocena: " + entry.getValue());
                    }
                    break;
                case "zakoncz":
                    break label;
                default:
                    System.out.println("Invalid Operation String, try again!");
                    break;
            }
        }
    }
}