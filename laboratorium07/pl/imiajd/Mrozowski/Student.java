package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.Mrozowski;

public class Student extends Osoba {
    private String kierunek;
    private double sredniaOcen;

    public Student(String[] imiona, String nazwisko, int birthYear, int birthMonth, int birthDay, boolean plec, String kierunek, double sredniaOcen){
        super(imiona, nazwisko, birthYear, birthMonth, birthDay, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }
    @Override
    public String toString(){
        String wynik = super.toString();
        wynik += " " + kierunek;
        return wynik;
    }

    public double getSredniaOcen()
    {
        return sredniaOcen;
    }

    public void setSredniaOcen(double srednia)
    {
        sredniaOcen = srednia;
    }

    public String getKierunek(){
        return this.kierunek;
    }
}
