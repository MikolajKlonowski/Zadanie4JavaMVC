package klonowski.mikolaj.zadaniemvc.Artykoly.Inne;


import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;

public class Inne extends Artykoly {
    private String kategoria;

    public Inne(String nazwa, double cena) {
        super(nazwa, cena);
        this.kategoria = "Inne";
        System.out.println("Stworzono artykół inne");
    }

    @Override
    public String toString() {

        return toString()+"Inne" +
                "kategoria='" + kategoria ;
    }
}
