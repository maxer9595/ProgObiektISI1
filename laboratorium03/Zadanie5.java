package pl.edu.uwm.wmii.marcelmrozowski.laboratorium03;
import java.math.BigDecimal;

public class Zadanie5 {
    public static void kapital(double k, double p, int n){
        BigDecimal kapital2 = new BigDecimal(Double.toString(k)).setScale(2);
        BigDecimal procent = new BigDecimal(Double.toString(p/100.0+1)).setScale(2);
        procent = procent.pow(n);
        kapital2 = kapital2.multiply(procent);

        System.out.println(kapital2);
    }
}
