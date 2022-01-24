package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;

import java.util.*;

public class Zad7Lab10 {
    public static LinkedList<Integer> sito_erastotenesa(int n){
        LinkedList<Integer> pierwsze = new LinkedList<Integer>();
        for(int i = 0; i<n; i++)
            pierwsze.add(i+1);
        for(int i = 2; i<=n/2; i++)
            for(int j = 2; j*i<=n; j++)
                pierwsze.remove((Integer)(i*j));
        return pierwsze;
    }
}