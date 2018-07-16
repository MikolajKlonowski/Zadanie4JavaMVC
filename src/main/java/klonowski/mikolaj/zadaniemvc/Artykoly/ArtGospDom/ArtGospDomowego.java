package klonowski.mikolaj.zadaniemvc.Artykoly.ArtGospDom;


import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;

public class ArtGospDomowego extends Artykoly {
    private String kategoria;

    public ArtGospDomowego(String nazwa, double cena) {
        super(nazwa, cena);
        this.kategoria = "Artykóły gospodarstwa domowego";
        System.out.println("Stworzono artykół gospodarstwa domowego");

    }

    @Override
    public String toString() {
        return toString() + "ArtGospDomowego" +
                "kategoria='" + kategoria;
    }
}
