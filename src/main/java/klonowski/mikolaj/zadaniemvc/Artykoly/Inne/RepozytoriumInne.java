package klonowski.mikolaj.zadaniemvc.Artykoly.Inne;

import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RepozytoriumInne {
    private List<Artykoly> inneLista;

    public RepozytoriumInne() {
        inneLista = new ArrayList<>();
        inneLista.add(new Inne("mydło", 5.0));
        inneLista.add(new Inne("chusteczki", 0.25));


    }

    public void addInne(Inne inne) {
        inneLista.add(inne);
    }

    public List<Artykoly> getInne() {
        return inneLista;
    }


}
