package klonowski.mikolaj.zadaniemvc.Artykoly;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Repository
public class RepozytoriumArtykolow {
   List<Artykoly> artykolyList;

    public RepozytoriumArtykolow() {
        artykolyList = new ArrayList<>();
        artykolyList.add(new Artykoly("Mleko",BigDecimal.valueOf(0.34),Kategorie.SPOZYWCZE));
        artykolyList.add(new Artykoly("Mop",BigDecimal.valueOf(1),Kategorie.INNE));
        artykolyList.add(new Artykoly("Kasza",BigDecimal.valueOf(0.23),Kategorie.SPOZYWCZE));
        artykolyList.add(new Artykoly("Książka",BigDecimal.valueOf(2),Kategorie.GOSPODARSTWADOMOWEGO));


    }

    public List<Artykoly> getArtykolyList() {
        return artykolyList;
    }
    public void addArtykol(Artykoly artykoly){
        artykolyList.add(artykoly);
    }
}
