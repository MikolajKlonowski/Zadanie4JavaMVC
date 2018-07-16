package klonowski.mikolaj.zadaniemvc.Artykoly.ArtSpozy;


import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;

public class ArtSpozywcze extends Artykoly {
    private String kategoria;

    public ArtSpozywcze(String nazwa, double cena) {
        super(nazwa, cena);
        this.kategoria = "Artykóły spożywcze";
        System.out.println("Stworzono artykół spożywczy");
    }

    public String getKategoria() {
        return kategoria;
    }

    @Override
    public String toString() {
        return toString() + "ArtSpozywcze" +
                "kategoria='" + kategoria;
    }
}
