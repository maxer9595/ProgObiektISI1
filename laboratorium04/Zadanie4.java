package pl.edu.uwm.wmii.marcelmrozowski.laboratorium04;
import java.util.ArrayList;

public class Zadanie4 {
    public static ArrayList<Integer> reverse(ArrayList<Integer> a){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i<a.size(); i++)
            newArray.add(a.get(a.size()-i-1));

        return newArray;
    }
}
