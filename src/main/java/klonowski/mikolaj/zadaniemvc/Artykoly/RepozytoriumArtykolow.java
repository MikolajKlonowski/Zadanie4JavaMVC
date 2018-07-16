package klonowski.mikolaj.zadaniemvc.Artykoly;

import java.util.List;

public class RepozytoriumArtykolow {
   List<Artykoly> artykolyList;

    public RepozytoriumArtykolow(List<Artykoly> artykolyList) {
        this.artykolyList = artykolyList;
    }
    public String toString(){
        String result="";
        for (Artykoly artykoly : artykolyList) {
            result+=artykoly;

        }
        return result;
    }
}
