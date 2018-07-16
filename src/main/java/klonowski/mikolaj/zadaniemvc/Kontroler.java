package klonowski.mikolaj.zadaniemvc;

import klonowski.mikolaj.zadaniemvc.Artykoly.ArtGospDom.RepozytoriumArtGospDOm;
import klonowski.mikolaj.zadaniemvc.Artykoly.ArtSpozy.RepozytortiumArtSpoz;
import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;
import klonowski.mikolaj.zadaniemvc.Artykoly.Inne.Inne;
import klonowski.mikolaj.zadaniemvc.Artykoly.Inne.RepozytoriumInne;
import klonowski.mikolaj.zadaniemvc.Artykoly.RepozytoriumArtykolow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class Kontroler {
    private RepozytortiumArtSpoz spoz;
    private List<RepozytoriumInne> repozytoriumInne;
    private RepozytoriumArtGospDOm gospDOm;
    private RepozytoriumArtykolow artykolow;
    private Inne inne;


    public Kontroler(RepozytortiumArtSpoz spoz, List<RepozytoriumInne> repozytoriumInne, RepozytoriumArtGospDOm gospDOm) {
        this.spoz = spoz;
        this.repozytoriumInne = repozytoriumInne;
        this.gospDOm = gospDOm;
    }

    @RequestMapping("/")
    @ResponseBody
    public void cos(HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        writer.print("<meta charset=utf-8>" + "<a href=http://localhost:8080/lista?kategoria=wszystkie>" + "wszystkie artykoły" + "</a>" + "<br>");
        writer.print("<meta charset=utf-8>" + "<a href=http://localhost:8080/lista?kategoria=spozywcze>" + "artykóły spożywcze" + "</a>" + "<br>");
        writer.print("<meta charset=utf-8>" + "<a href=http://localhost:8080/lista?kategoria=inne>" + "artykóły inne" + "</a>" + "<br>");
        writer.print("<meta charset=utf-8>" + "<a href=http://localhost:8080/lista?kategoria=domowe>" + "artykóły gospodarstwa domowego" + "</a>" + "<br>");
    }

    @RequestMapping("/lista")
    @ResponseBody
    public void lista(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String kategoria = request.getParameter("kategoria");
        PrintWriter writer = response.getWriter();
        String result = "";
        if (kategoria.equals("spozywcze")) {

            writer.print(spoz.toString());
        } else if (kategoria.equals("inne")) {
            for (int i =0; i<repozytoriumInne.size();i++){
                result+=repozytoriumInne.get(i).getInne().get(i).getNazwa();
            }
            writer.print(result);

        } else if (kategoria.equals("domowe")) {
            writer.print(gospDOm.toString());
        } else if (kategoria.equals("wszystkie")) {
            writer.print(artykolow.toString());


        }

//

    }
}
