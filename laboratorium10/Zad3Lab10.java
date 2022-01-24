package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;

import java.util.LinkedList;

public class Zad3Lab10 {

    public static <T> void odwroc(LinkedList<T> lista){
        T temp;
        for(int i = 0; i<lista.size()/2; i++){
            temp = lista.get(i);
            lista.set(i, lista.get(lista.size()-i-1));
            lista.set(lista.size()-i-1, temp);
        }
    }
}
