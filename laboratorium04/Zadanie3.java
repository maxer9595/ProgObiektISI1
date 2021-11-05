package pl.edu.uwm.wmii.marcelmrozowski.laboratorium04;
import java.util.ArrayList;

public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int min1 = 0;
        int pos1 = 0;
        int min2 = 0;
        int pos2 = 0;
        int iterator;
        boolean[] a_empty = new boolean[a.size()];
        boolean[] b_empty = new boolean[b.size()];
        for(int i = 0; i<a.size(); i++)
            a_empty[i] = false;
        for(int i = 0; i<b.size(); i++)
            b_empty[i] = false;

        int a_ite = a.size();
        int b_ite = b.size();
        while(a_ite > 0 && b_ite > 0){
            iterator = 0;
            while(a_empty[iterator] == true)
                iterator++;
            min1 = a.get(iterator);
            pos1 = iterator;
            for(int i = 0; i<a.size(); i++){
                if(a.get(i) < min1 && a_empty[i] == false){
                    min1 = a.get(i);
                    pos1 = i;
                }
            }
            iterator = 0;
            while(b_empty[iterator] == true)
                iterator++;
            min2 = b.get(iterator);
            pos2 = iterator;
            for(int i = 0; i<b.size(); i++){
                if(b.get(i) < min2 && b_empty[i] == false){
                    min2 = b.get(i);
                    pos2 = i;
                }
            }
            if(min2 > min1){
                a_empty[pos1] = true;
                a_ite--;
                newArray.add(min1);
            }
            else{
                b_empty[pos2] = true;
                b_ite--;
                newArray.add(min2);
            }
        }
        while(a_ite > 0){
            iterator = 0;
            while(a_empty[iterator] == true)
                iterator++;
            min1 = a.get(iterator);
            pos1 = iterator;
            for(int i = 0; i<a.size(); i++){
                if(a.get(i) < min1 && a_empty[i] == false){
                    min1 = a.get(i);
                    pos1 = i;
                }
            }
            a_empty[pos1] = true;
            a_ite--;
            newArray.add(min1);
        }
        while(b_ite > 0){
            iterator = 0;
            while(b_empty[iterator] == true)
                iterator++;
            min2 = b.get(iterator);
            pos2 = iterator;
            for(int i = 0; i<b.size(); i++){
                if(b.get(i) < min2 && b_empty[i] == false){
                    min2 = b.get(i);
                    pos2 = i;
                }
            }
            b_empty[pos2] = true;
            b_ite--;
            newArray.add(min2);
        }

        return newArray;
    }
}


