package klonowski.mikolaj.zadaniemvc.Artykoly.ArtGospDom;

import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepozytoriumArtGospDOm {

    private List<Artykoly> artGospDomList;

    public RepozytoriumArtGospDOm() {
        artGospDomList = new ArrayList<>();
        artGospDomList.add(new ArtGospDomowego("miotła", 6.32));
        artGospDomList.add(new ArtGospDomowego("żelazko", 123.23));


    }

    public void addArtSpoz(ArtGospDomowego artGospDomowego) {
        artGospDomList.add(artGospDomowego);
    }

    public List<Artykoly> getArtGospDom() {
        return artGospDomList;
    }
}
