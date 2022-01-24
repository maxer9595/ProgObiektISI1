package pl.edu.uwm.wmii.marcelmrozowski.laboratorium11;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TestZadanie1Lab11 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scaner=new Scanner(System.in);
        Scanner scanerr=new Scanner(System.in);
        Scanner scanerrr=new Scanner(System.in);
        PriorityQueue<Zadanie> queue=new PriorityQueue<>();
        boolean zmiennik = true;
        while(zmiennik)
        {
            String opis;
            String wybor="";
            System.out.println("Choose option from this: dodaj priorytet opis, nastepne, zakoncz");
            wybor=scaner.nextLine();
            if(wybor.equals("dodaj priorytet opis"))
            {
                System.out.println("Wpisz Priorytet:");
                int pio=scanerr.nextInt();
                System.out.println("Wpisz Opis:");
                opis=scanerrr.nextLine();
                queue.add(new Zadanie(pio, opis));
            }
            else if(wybor.equals("nastepne") && queue.size()!=0)
            {
                System.out.println(queue.poll().toString());
            }
            else if(wybor.equals("zakoncz"))
            {
                zmiennik = false;
            }
            else
            {
                System.out.println("Invalid Operation String, try again!");
            }
        }
    }
}