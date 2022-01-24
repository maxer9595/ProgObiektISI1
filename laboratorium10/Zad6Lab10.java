package pl.edu.uwm.wmii.marcelmrozowski.laboratorium10;

import java.util.Stack;

public class Zad6Lab10 {
    public static void podziel(int value)
    {
        Stack<Integer> pomocnik = new Stack<Integer>();
        while(value > 0){
            pomocnik.add(value%10);
            value = value/10;
        }
        while(pomocnik.empty() == false){
            System.out.print(pomocnik.peek());
            pomocnik.pop();
        }
        System.out.println();
    }
}
