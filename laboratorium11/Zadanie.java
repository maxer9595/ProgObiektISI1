package pl.edu.uwm.wmii.marcelmrozowski.laboratorium11;

public class Zadanie implements Comparable<Zadanie> {
    private int priorytet;
    private String opis;

    public Zadanie(int priorytet, String opis)
    {
        this.priorytet = priorytet;
        this.opis = opis;
    }

    @Override
    public int compareTo(Zadanie z)
    {
        if(priorytet < z.priorytet)
        {
            return -1;
        }
        else if(priorytet > z.priorytet)
        {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString()
    {
        return "opis = " + opis + ", priorytet = " + priorytet;
    }
}