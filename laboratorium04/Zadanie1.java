package pl.edu.uwm.wmii.marcelmrozowski.laboratorium04;
import java.util.ArrayList;

public class Zadanie1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i<a.size(); i++)
            newArray.add(a.get(i));

        for(int j = 0; j<b.size(); j++)
            newArray.add(b.get(j));

        return newArray;
    }
}


