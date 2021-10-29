package pl.edu.uwm.wmii.marcelmrozowski.laboratorium02;
import  java.util.Random;
import java.util.Scanner;


public class Zadanie1 {
    public static void run(int tab[])
    {
        int minw=-999, maxw=999;
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int n=tab.length;
        int parzyste=0,nieparzyste=0;
        int dodatnie=0,ujemne=0, zerowe=0;
        int najwiekszy=tab[0]-1,ilosc=0;
        int sumadodatnich=0, sumaujemnych=0;
        int nadjdluzszyciagdodatnich=0;
        int ciag=0;
        int lewy;
        int prawy;
        prawy=sc.nextInt();
        lewy=sc.nextInt();
        for(int i=0; i<n;i++)
        {
            if(tab[i]%2==0)
            {
                parzyste++;
            }
            else
            {
                nieparzyste++;
            }
            if(tab[i]>0)
            {
                dodatnie++;
                sumadodatnich+=tab[i];
                ciag++;
            }
            else if(tab[i]==0)
            {
                zerowe++;
            }
            else
            {
                ujemne++;
                sumaujemnych+=tab[i];
            }
            if(tab[i]<1)
            {
                if(ciag>nadjdluzszyciagdodatnich)
                {
                    nadjdluzszyciagdodatnich=ciag;
                    ciag=0;
                }
                else
                    ciag=0;
            }
            if(tab[i]>najwiekszy)
            {
                najwiekszy=tab[i];
                ilosc=1;
            }
            else if(tab[i]==najwiekszy)
            {
                ilosc++;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
            {
                tab[i]=1;
            }
            else if(tab[i]<0)
            {
                tab[i]=-1;
            }
        }
        for(int i=0; i<(prawy-lewy)/2; i++)
        {
            int help=tab[prawy-i];
            tab[prawy-i]=tab[lewy+i];
            tab[lewy+i]=help;
        }
        System.out.println("rozwiazania zadan: ");
        System.out.print("liczba parzystych ");
        System.out.print(parzyste);
        System.out.print("\nliczba nieparzystych ");
        System.out.print(nieparzyste);
        System.out.print("\n ilosc dodatnich");
        System.out.print(dodatnie);
        System.out.print("\n ilosc ujemnych");
        System.out.print(ujemne);
        System.out.print("\n ilosc zer");
        System.out.print(zerowe);
        System.out.print("\nsuma dodatnich ");
        System.out.print(sumadodatnich);
        System.out.print("\nsuma suma ujemnych ");
        System.out.print(sumaujemnych);
        System.out.print("\nnajwieksza liczba w tablicy to i wystepuje tyle razy0");
        System.out.print(najwiekszy);
        System.out.print(" ");
        System.out.print(ilosc);
        System.out.print("\nnajdluzszy ciag dodatnich ma dlugosc ");
        System.out.print(nadjdluzszyciagdodatnich);
        System.out.println("tablica po przemianie w 0 i 1 i odwroceniu");
        for(int i=0; i<n; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
