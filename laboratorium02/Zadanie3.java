package pl.edu.uwm.wmii.marcelmrozowski.laboratorium02;
import java.util.Random;


public class Zadanie3 {
    public static void test(int m, int n, int k){
        Random generator = new Random();
        int[][] a = new int[m][];
        for(int i = 0; i<m; i++)
            a[i] = new int[n];

        int[][] b = new int[n][];
        for(int i = 0; i<n; i++)
            b[i] = new int[k];

        int[][] c = new int[m][];
        for(int i = 0; i<m; i++)
            c[i] = new int[k];

        for(int i = 0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = generator.nextInt(10);
                System.out.printf("%d ", a[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        for(int i = 0; i<n; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = generator.nextInt(10);
                System.out.printf("%d ", b[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        int suma;
        for(int i = 0; i<m; i++) {
            for (int j = 0; j < k; j++) {
                suma = 0;
                for(int l = 0; l<n; l++)
                    suma = suma+a[i][l]*b[l][j];
                c[i][j] = suma;
                System.out.printf("%d ", c[i][j]);
            }
            System.out.printf("\n");
        }
    }
}