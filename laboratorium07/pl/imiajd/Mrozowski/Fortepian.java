package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.Mrozowski;

public class Fortepian extends Instrument{
    private int dzwieczek;
    private static String[] dzwieczki = {"Dbl Contra", "Sub Contra", "Contra"};

    public Fortepian(String producent, int Year){
        super(producent, Year);
    }

    @Override
    public String dzwiek(){
        String wynik = dzwieczki[dzwieczek];

        dzwieczek++;
        if(dzwieczek == 3)
            dzwieczek = 0;

        return wynik;
    }
}
