package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.Mrozowski;

public class Skrzypce extends Instrument{
    private int dzwieczek;
    private static String[] dzwieczki = {"G3", "A2", "A7"};

    public Skrzypce(String producent, int Year){
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
