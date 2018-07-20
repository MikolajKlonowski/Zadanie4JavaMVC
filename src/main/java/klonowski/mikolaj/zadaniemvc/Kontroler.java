package klonowski.mikolaj.zadaniemvc;

import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;
import klonowski.mikolaj.zadaniemvc.Artykoly.Kategorie;
import klonowski.mikolaj.zadaniemvc.Artykoly.RepozytoriumArtykolow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;


@Controller
public class Kontroler {
    private RepozytoriumArtykolow repozytoriumArtykolow;

    public Kontroler(RepozytoriumArtykolow repozytoriumArtykolow) {
        this.repozytoriumArtykolow = repozytoriumArtykolow;

    }

    @ResponseBody
    @RequestMapping("/lista")
    public String tworzenieListy(HttpServletRequest request) {
        String wynik = "";
        BigDecimal suma = BigDecimal.valueOf(0);

        List<Artykoly> artykoly = repozytoriumArtykolow.getArtykolyList();
        String kategoriaString = request.getParameter("kategoria");
        Kategorie kategorie = null;
        if (kategoriaString != null) {
            kategorie = Kategorie.valueOf(kategoriaString);
        }

        for (Artykoly artykol : artykoly) {
            if (artykol.getKategorie() == kategorie) {
                wynik += artykol.toString() + "<br/>";
                suma = suma.add(artykol.getCena());

            } else if (kategoriaString == null) {
                wynik += artykol.toString() + "<br/>";
                suma = suma.add(artykol.getCena());

            }
        }
        return wynik + "<br/><br/><br/>" + "Suma artykułów: " + suma;
    }

    @RequestMapping("/nowyArtykol")
    public String nowyArtykul() {
        return "FormularzDlaNowegoArtykolu.html";
    }


    @RequestMapping("/dodawanie")
    public String dodawanie(HttpServletRequest request) {
        String nazwa = request.getParameter("nazwa");
        String cena = request.getParameter("cena");
        String kategorie = request.getParameter("kategorie");
        BigDecimal cenna = BigDecimal.valueOf(Long.parseLong(cena));
        Kategorie kategoria = Kategorie.valueOf(kategorie);
        repozytoriumArtykolow.addArtykol(new Artykoly(nazwa, cenna, kategoria));

        return "redirect:/success";
    }

    @RequestMapping("/success")
    public String success() {
        return "/lista";

    }
}
