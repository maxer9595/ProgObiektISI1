package pl.edu.uwm.wmii.marcelmrozowski.laboratorium02;
import java.util.Scanner;
import  java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,k;
        n=sc.nextInt();
        int[] tab=new int[n];
        generuj(tab, n , -999, 999);
        ///wywolanie zadania 1
        Zadanie1.run(tab);
        ///wywolanie zadania 2
        n=sc.nextInt();
        int lewy=sc.nextInt(), prawy=sc.nextInt();
        generuj(tab, n,-1000,999);
        System.out.println("rozwiazania zadan: ");
        System.out.print("liczba parzystych ");
        System.out.print(Zadanie2.ileParzystych(tab));
        System.out.print("\nliczba nieparzystych ");
        System.out.print(Zadanie2.ileNieparzystych(tab));
        System.out.print("\n ilosc dodatnich");
        System.out.print(Zadanie2.ileDodatnich(tab));
        System.out.print("\n ilosc ujemnych");
        System.out.print(Zadanie2.ileUjemnych(tab));
        System.out.print("\n ilosc zer");
        System.out.print(Zadanie2.ileZerowych(tab));
        System.out.print("\nsuma dodatnich ");
        System.out.print(Zadanie2.sumaDotatnich(tab));
        System.out.print("\nsuma suma ujemnych ");
        System.out.print(Zadanie2.sumaUjemnych(tab));
        System.out.print("\nnajwieksza liczba w tablicy to i wystepuje tyle razy0");
        Zadanie2.ileMaksymalnych(tab);
        System.out.print("\nnajdluzszy ciag dodatnich ma dlugosc ");
        System.out.print(Zadanie2.dlugoscMaksymalnegoCiaguDodatnich(tab));
        System.out.print("\ntablica po zamianie w 0 i 1");
        Zadanie2.signum(tab);
        System.out.print("\ntablica po odwroceniu fragmentu");
        Zadanie2.odwrocFragment(tab,lewy,prawy);
        ///wywolanie zadania 3
        m=sc.nextInt();
        n=sc.nextInt();
        k=sc.nextInt();
        Zadanie3.test(m,n,k);

    }
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc)
    {
        Random random=new Random();
        for(int i=0;i<n; i++)
        {
            tab[i]=random.nextInt(maxWartosc-minWartosc)+minWartosc;
        }
    }
}
