package pl.edu.uwm.wmii.marcelmrozowski.laboratorium11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TestZadanie2Lab11 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        Scanner scanerr=new Scanner(System.in);
        Scanner scanerrr=new Scanner(System.in);
        HashMap<String, String> oceny=new HashMap<>();
        TreeMap<String, String> ocenysort=new TreeMap<>();
        label:
        while(true)
        {
            String wybor;
            String imie;
            String ocena;
            System.out.println("Choose option from this: dodaj, usun, zmien, wypisz, zakoncz");
            wybor=scaner.nextLine();
            switch (wybor) {
                case "dodaj": {
                    System.out.println("Wpisz Imie:");
                    imie = scanerr.nextLine();
                    System.out.println("Wpisz Ocena:");
                    ocena = scanerrr.nextLine();
                    oceny.put(imie, ocena);
                    break;
                }
                case "usun": {
                    System.out.println("Napisz imie ucznia ktorego mam usunac:");
                    imie = scanerr.nextLine();
                    oceny.remove(imie);
                    break;
                }
                case "zmien": {
                    System.out.println("Napisz imie ucznia ktoremu mam zmienic ocene");
                    imie = scanerr.nextLine();
                    System.out.println("Wpisz nowa ocena:");
                    ocena = scanerrr.nextLine();
                    oceny.replace(imie, ocena);
                    break;
                }
                case "wypisz": {
                    ocenysort.putAll(oceny);
                    for (Map.Entry<String, String> entry : ocenysort.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                }
                case "zakoncz": {
                    break label;
                }
                default:
                    System.out.println("Invalid Operation String, try again!");
                    break;
            }
        }
    }
}