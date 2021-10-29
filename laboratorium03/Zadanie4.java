package pl.edu.uwm.wmii.marcelmrozowski.laboratorium03;
import java.math.BigInteger;

public class Zadanie4 {
    public static void szachownica(int n){
        BigInteger calkowita = new BigInteger("0");
        BigInteger podstawa = new BigInteger("2");
        for(int i = 0; i<n*n; i++)
            calkowita = calkowita.add(podstawa.pow(i));

        System.out.println(calkowita);
    }
}

