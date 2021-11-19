package pl.edu.uwm.wmii.marcelmrozowski.laboratorium05;

public class Main {

    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000.0);
        RachunekBankowy saver2 = new RachunekBankowy(3000.0);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.println("odsetki1-4%--------");
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.println("odsetki2-5%--------");
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver2.obliczMiesieczneOdsetki());
        IntegerSet zbior = new IntegerSet();
        zbior.insertElement(1);
        zbior.insertElement(10);
        zbior.insertElement(100);
        // zbior.insertElement(101);
        System.out.println(zbior.toString());
    }
}
