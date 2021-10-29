package pl.edu.uwm.wmii.marcelmrozowski.laboratorium01;
import java.util.Scanner;

public class Zadanie2 {
    public static int silnia(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return silnia(n-1)*n;
        }
    }
    public static void a(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if (tab[i] % 2 != 0) {
                System.out.println(tab[i]);
            }
        }
    }
    public static void b(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if (tab[i] % 3 == 0 && tab[i]%5!=0) {
                System.out.println(tab[i]);
            }
        }
    }
    public static void c(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<tab[i]/2;j++) {
                if (tab[i] ==j*j ) {
                    System.out.println(tab[i]);
                }
            }
        }
    }
    public static void d(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=1; i<n-1; i++) {
            if (tab[i-1]<tab[i] && tab[i]<tab[i+1]) {
                System.out.println(tab[i]);
            }
        }
    }
    public static void e(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=1; i<n; i++) {
            if (Math.pow(2,i)<tab[i] && tab[i]<silnia(i)) {
                System.out.println(tab[i]);
            }
        }
    }
    public static void f(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if ((i+1)%2!=0 && tab[i] % 2 != 0) {
                System.out.println(tab[i]);
            }
        }
    }
    public static void g(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if (tab[i] % 2 != 0 && tab[i]>-1){
                System.out.println(tab[i]);
            }
        }
    }
    public static void h(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        for(int i=0; i<n; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if (Math.abs(tab[i])<i*i) {
                System.out.println(tab[i]);
            }
        }
    }
    public static int dwa(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int a;
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a>-1) {
                sum += a;
            }
        }
        return 2*sum;
    }
    public static void trzy(int n)
    {
        Scanner sc=new Scanner(System.in);
        int l0=0, lp=0,lm=0;
        int a;
        for(int i=0; i<n; i++)
        {
            a=sc.nextInt();
            if(a==0)
            {
                l0++;
            }
            else if(a>0)
            {
                lp++;
            }
            else
            {
                lm++;
            }
        }
        System.out.print("\ndodatnie ");
        System.out.print(lp);
        System.out.print("\nujemne ");
        System.out.print(lm);
        System.out.print("\nzera ");
        System.out.print(l0);
    }
    public static void cztery(int n)
    {
        Scanner sc=new Scanner(System.in);
        int min,max;
        int a;
        a=sc.nextInt();
        min=a;
        max=a;
        for(int i=1; i<n; i++)
        {
            a=sc.nextInt();
            if(a>max)
            {
                max=a;
            }
            if(a<min)
            {
                min=a;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static int piec(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab=new int[n];
        int pary=0;
        for(int i=0; i<n;i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n-1;i++)
        {
            if(tab[i]>0 && tab[i+1]>0)
            {
                pary++;
            }
        }
        return pary;
    }
}
