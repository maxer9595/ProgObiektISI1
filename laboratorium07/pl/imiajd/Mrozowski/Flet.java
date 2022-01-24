package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.Mrozowski;

public class Flet extends Instrument{
    private int dzwieczek;
    private static String dzwieczki = "doremifasola";

    public Flet(String producent, int Year){
        super(producent, Year);
    }

    @Override
    public String dzwiek(){
        String wynik = dzwieczki.substring(dzwieczek*2, dzwieczek*2+2);

        dzwieczek++;
        if(dzwieczek == 8)
            dzwieczek = 0;

        return wynik;
    }
}
