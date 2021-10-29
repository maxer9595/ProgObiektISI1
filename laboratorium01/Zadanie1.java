package pl.edu.uwm.wmii.marcelmrozowski.laboratorium01;
import java.util.Scanner;

public class Zadanie1 {
    public static int a(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0; i<n; i++)
        {
            int m=sc.nextInt();
            sum+=m;
        }
        return sum;
    }
    public static int b(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=1;
        for(int i=0; i<n; i++)
        {
            int m=sc.nextInt();
            sum*=m;
        }
        return sum;
    }
    public static int c(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0; i<n; i++)
        {
            int m=sc.nextInt();
            sum+=Math.abs(m);
        }
        return sum;
    }
    public static int d(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0; i<n; i++)
        {
            int m=sc.nextInt();
            sum+=Math.sqrt(Math.abs(m));
        }
        return sum;
    }
    public static int e(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=1;
        for(int i=0; i<n; i++)
        {
            int m=sc.nextInt();
            sum*=Math.abs(m);
        }
        return sum;
    }
    public static int f(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0; i<n; i++)
        {
            int m=sc.nextInt();
            sum+=Math.pow(m,2);
        }
        return sum;
    }
    public static void g(int n)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int sum2=1;
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            sum += m;
            sum2 *= m;

        }
    }
    public static int h(int n)
    {
        Scanner sc=new Scanner(System.in);
        int a, suma=0;
        for(int i=0; i<n; i++)
        {
            a=sc.nextInt();
            suma+=Math.pow(-1,n)*a;
        }
        return suma;
    }
    public static int i(int n)
    {
        Scanner sc=new Scanner(System.in);
        int a, suma=0;
        for(int i=0; i<n; i++)
        {
            a=sc.nextInt();
            suma+=Math.pow(-1,n+1)*(a/Zadanie2.silnia(n+1));
        }
        return suma;
    }
    public static void dwa(int n)
    {
        Scanner sc=new Scanner(System.in);
        int[] tab= new int[n];
        int a;
        a=sc.nextInt();
        tab[n-1]=a;
        for(int i=0; i<n-1; i++)
        {
            tab[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(tab[i]);
        }
    }
}
