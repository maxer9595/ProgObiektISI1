package pl.edu.uwm.wmii.marcelmrozowski.laboratorium07;

import java.util.ArrayList;

import pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.mrozowski.Instrument;
import pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.mrozowski.Flet;
import pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.mrozowski.Fortepian;
import pl.edu.uwm.wmii.marcelmrozowski.laboratorium07.pl.imiajd.mrozowski.Skrzypce;

public class TestInstrumenty {
    public static void main(String[] args){
        ArrayList<Instrument> Orkiestra = new ArrayList<Instrument>();
        Orkiestra.add(new Flet("flutes", 2005));
        Orkiestra.add(new Flet("flutemeister", 2007));
        Orkiestra.add(new Flet("fletypolska", 1990));
        Orkiestra.add(new Fortepian("Pianos", 2000));
        Orkiestra.add(new Skrzypce("Skrzypcunie", 2020));

        for(int i = 0; i<Orkiestra.size(); i++)
            System.out.println(Orkiestra.get(i).dzwiek());

        for(int i = 0; i<Orkiestra.size(); i++)
            System.out.println(Orkiestra.get(i).toString());
    }
}
