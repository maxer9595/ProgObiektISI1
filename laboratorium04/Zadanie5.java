package pl.edu.uwm.wmii.marcelmrozowski.laboratorium04;
import java.util.ArrayList;

public class Zadanie5 {
    public static void reverse(ArrayList<Integer> a){
        int temp;
        for(int i = 0; i<a.size()/2-1; i++){
            temp = a.get(i);
            a.set(i, a.get(a.size()-1-i));
            a.set(a.size()-1-i, temp);
        }
    }
}


