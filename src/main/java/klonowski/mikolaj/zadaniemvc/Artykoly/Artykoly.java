package klonowski.mikolaj.zadaniemvc.Artykoly;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;


public class Artykoly {
    private String nazwa;
    private BigDecimal cena;
    private Kategorie kategorie;

    public Artykoly(String nazwa, BigDecimal cena, Kategorie kategorie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategorie = kategorie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    @Override
    public String toString() {
        return "Artykoly " +
                "nazwa= " + nazwa  +
                ", cena=" + cena +", kategoria: "+ kategorie;
    }
}
