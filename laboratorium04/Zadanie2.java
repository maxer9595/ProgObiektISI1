package pl.edu.uwm.wmii.marcelmrozowski.laboratorium04;
import java.util.ArrayList;

public class Zadanie2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        if(a.size() < b.size()) {
            for(int i = 0; i<a.size(); i++){
                newArray.add(a.get(i));
                newArray.add(b.get(i));
            }
            for(int i = a.size(); i<b.size(); i++)
                newArray.add(b.get(i));
        }
        else{
            for(int i = 0; i<b.size(); i++){
                newArray.add(a.get(i));
                newArray.add(b.get(i));
            }
            for(int i = b.size(); i<a.size(); i++)
                newArray.add(a.get(i));
        }

        return newArray;
    }
}


