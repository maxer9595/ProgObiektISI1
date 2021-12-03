package pl.edu.uwm.wmii.marcelmrozowski.laboratorium06.pl.imiajd.mrozowski;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania = 0;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ul, int nm_domu, int nm_mieszk, String miast, String kod_poczt){
        ulica = ul;
        numer_domu = nm_domu;
        numer_mieszkania = nm_mieszk;
        miasto = miast;
        kod_pocztowy = kod_poczt;
    }

    public Adres(String ul, int nm_domu, String miast, String kod_poczt){
        ulica = ul;
        numer_domu = nm_domu;
        miasto = miast;
        kod_pocztowy = kod_poczt;
    }

    public void pokaz(){
        System.out.printf("%s %s\n%s %d", kod_pocztowy, miasto, ulica, numer_domu);
        if(numer_mieszkania > 0)
            System.out.printf("/%d", numer_mieszkania);
    }

    public boolean przed(Adres test){
        if(kod_pocztowy.equals(test.kod_pocztowy))
            return true;
        return false;
    }
}
