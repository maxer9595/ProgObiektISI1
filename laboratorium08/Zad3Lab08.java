package pl.edu.uwm.wmii.marcelmrozowski.laboratorium08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad3Lab08 {
    public static void main(String args[]) {
        if (args.length != 0) {
            ArrayList<String> zad3 = new ArrayList<>();
            try {
                File mojPlik = new File(args[0]);
                Scanner sc = new Scanner(mojPlik);
                while (sc.hasNextLine()) {
                    zad3.add(sc.nextLine());
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("Brak pliku");
                e.printStackTrace();
            }

            System.out.println(zad3);
            Collections.sort(zad3);
            System.out.println(zad3);
        }
    }
}