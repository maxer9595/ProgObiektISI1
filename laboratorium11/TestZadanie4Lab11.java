package pl.edu.uwm.wmii.marcelmrozowski.laboratorium11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;

public class TestZadanie4Lab11 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Integer, HashSet<String>> mapa=new TreeMap<>();
        Integer kod;
        HashSet<String> zbior;
        File plik=new File("src/com/company/labolatorium13/file.txt");
        String odczyt;
        Scanner scnr=new Scanner(plik);
        while(scnr.hasNext())
        {
            odczyt=scnr.next();
            kod=odczyt.hashCode();
            if(mapa.containsKey(kod))
            {
                mapa.get(kod).add(odczyt);
            }
            zbior=new HashSet<>();
            zbior.add(odczyt);
            mapa.put(kod, zbior);
        }

        for(Map.Entry<Integer, HashSet<String>> entry : mapa.entrySet())
        {
            if(entry.getValue().size() > 1)
            {
                System.out.printf("Kod mieszający powtarza się dla : %d", entry.getKey());
            }
        }
    }
}