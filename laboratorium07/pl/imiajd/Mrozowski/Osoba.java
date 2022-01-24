package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.Mrozowski;

import java.time.LocalDate;

public class Osoba
{
    public Osoba(String[] imiona, String nazwisko, int birthYear, int birthMonth, int birthDay, boolean plec)
    {
        this.imiona = new String[imiona.length];
        for(int i = 0; i<imiona.length; i++)
            this.imiona[i] = imiona[i];
        this.nazwisko = nazwisko;
        this.dataUrodzenia = LocalDate.of(birthYear, birthMonth, birthDay);
        this.plec = plec;
    }

    @Override
    public String toString()
    {
        return "[nazwisko: " + nazwisko + ", data urodzenia: " + dataUrodzenia + "]";
    }

    public boolean equals(Osoba other)
    {
        return nazwisko.equals(other.nazwisko) && dataUrodzenia.equals(other.dataUrodzenia);
    }

    public String[] getImiona()
    {
        return imiona;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public boolean getPlec()
    {
        return plec;
    }

    private String[] imiona;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private boolean plec;
}