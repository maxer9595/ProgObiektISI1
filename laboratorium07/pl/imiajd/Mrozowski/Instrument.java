package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.Mrozowski;
import java.time.LocalDate;

abstract public class Instrument {
    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent, int Year){
        this.producent = producent;
        this.rokProdukcji = LocalDate.of(Year, 1 ,1);
    }

    public String getProducent()
    {
        return producent;
    }

    public int getRokProdukcji()
    {
        return rokProdukcji.getYear();
    }

    abstract public String dzwiek();

    public boolean equals(Instrument test){
        if(rokProdukcji.equals(test.rokProdukcji) && producent.equals(test.producent))
            return true;
        return false;
    }
    @Override
    public String toString(){
        String wynik = producent;
        wynik += Integer.toString(rokProdukcji.getYear());
        return wynik;
    }
}
