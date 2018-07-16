package klonowski.mikolaj.zadaniemvc.Artykoly;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


public class Artykoly {
    private String nazwa;
    private double cena;

    public Artykoly(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Artykoly" +
                "nazwa=" + nazwa  +
                ", cena=" + cena ;
    }
}
