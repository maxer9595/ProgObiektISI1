package pl.edu.uwm.wmii.marcelmrozowski.laboratorium02;
import  java.util.Random;
public class Zadanie2 {
    public static int ileNieparzystych(int tab[])//a
    {
        int nieparzyste=0;
        int n=tab.length;
        for(int i=0; i<n; i++)
        {
            if(tab[i]%2!=0)
               nieparzyste++;
        }
        return nieparzyste;
    }
    public static int ileParzystych(int tab[])//a
    {
        int parzyste=0;
        int n=tab.length;
        for(int i=0; i<n; i++)
        {
            if(tab[i]%2==0)
                parzyste++;
        }   
        return  parzyste;
    }
    public static int ileDodatnich(int tab[])//b
    {
        int plus=0;
        int n=tab.length;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
                plus++;

        }
        return plus;
    }
    public static int ileUjemnych(int tab[])//b
    {
        int  minus=0;
        int n=tab.length;
        for(int i=0; i<n; i++)
        {
            if(tab[i]<0)
                minus++;
        }
        return minus;
    }
    public static int ileZerowych(int tab[])//b
    {
        int zero=0, plus=0, minus=0;
        int n=tab.length;
        for(int i=0; i<n; i++)
        {
            if(tab[i]==0)
                zero++;
        }
        return zero;
    }
    public static void ileMaksymalnych(int tab[])//c
    {
 
        int n=tab.length;
        int najwiekszy=tab[0];
        for(int i=0; i<n; i++)
        {
            if(tab[i]>najwiekszy)
                najwiekszy=tab[i];
        }
        int ilosc=0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]==najwiekszy)
            {
                ilosc++;
            }
        }
        System.out.println(ilosc);
    }
    public static int  sumaDotatnich(int tab[])//d
    {
        int plus=0;
        int n=tab.length;
        for(int i=0; i<n; i++) {
            if (tab[i] > 0)
                plus += tab[i];
        }
        return plus;
    }
    public static int sumaUjemnych(int tab[])//d
    {
        int plus=0;
        int n=tab.length;
        for(int i=0; i<n; i++)
        {
            if (tab[i]<0)
                plus+=tab[i];
        }
        return plus;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[])///e
    {
        int n=tab.length;
        int nd=0;
        int d=0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]<=0)
            {
                if (d > nd)
                {
                    nd=d;
                }
                d=0;
            }
            else
                d++;
        }
        if (d>nd) {
            nd=0;
        }
        return nd;
    }
    public static void signum(int tab[])///f
    {
        int n=tab.length;
        for(int i=0; i<n;i++)
        {
            if(tab[i]>0)
            {
                tab[i]=1;
            }
            else if(tab[i]<0)
            {
                tab[i]=-1;
            }
            //System.out.println(tab[i]);
        }
        for(int i=0;i<n;i++)
            System.out.println(tab[i]);
    }
    public static void odwrocFragment(int tab[], int lewy, int prawy) {///g
        int n=tab.length;
        if (lewy > prawy){
            int h=prawy;
            prawy=lewy;
            lewy=h;
        }
        for(int i=0; i<(lewy-prawy)/2; i++)
        {
            int h=tab[prawy-i];
            tab[prawy-i]=tab[lewy+i];
            tab[lewy+i]=h;
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(tab[i]);
        }
    }
}

