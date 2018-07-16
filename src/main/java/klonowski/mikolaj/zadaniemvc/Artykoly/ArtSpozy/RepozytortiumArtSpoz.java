package klonowski.mikolaj.zadaniemvc.Artykoly.ArtSpozy;

import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RepozytortiumArtSpoz {
    private List<Artykoly> artSpozywczeList;

    public RepozytortiumArtSpoz() {
        artSpozywczeList = new ArrayList<>();
        artSpozywczeList.add(new ArtSpozywcze("makaron", 4.3));
        artSpozywczeList.add(new ArtSpozywcze("mleko", 4.3));


    }

    public void addArtSpoz(ArtSpozywcze artSpozywcze) {
        artSpozywczeList.add(artSpozywcze);
    }

    public List<Artykoly> getArtSpoz() {
        return artSpozywczeList;
    }

}
