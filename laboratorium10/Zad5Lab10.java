package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;

import java.util.*;

public class Zad5Lab10 {
    public static void odwracaj(Stack<String> stos){
        Stack<String> odwrocony = new Stack<String>();
        int x = 0;
        for(int i=0; i<stos.size(); i++){
            if(stos.get(i).contains(".")){
                if(x==0){
                    for(int j=i; j>i-3; j--){
                        odwrocony.push(stos.get(j));
                    }
                }else{
                    for(int j=i; j>i-4; j--){
                        odwrocony.push(stos.get(j));
                    }
                }
                x=1;
            }
        }
        System.out.println(odwrocony);
    }
}
