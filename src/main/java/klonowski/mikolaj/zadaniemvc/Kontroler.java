package klonowski.mikolaj.zadaniemvc;

import klonowski.mikolaj.zadaniemvc.Artykoly.ArtGospDom.RepozytoriumArtGospDOm;
import klonowski.mikolaj.zadaniemvc.Artykoly.ArtSpozy.RepozytortiumArtSpoz;
import klonowski.mikolaj.zadaniemvc.Artykoly.Artykoly;
import klonowski.mikolaj.zadaniemvc.Artykoly.Inne.Inne;
import klonowski.mikolaj.zadaniemvc.Artykoly.Inne.RepozytoriumInne;
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
    private RepozytoriumInne repozytoriumInne;
    private RepozytoriumArtGospDOm gospDOm;



    public Kontroler(RepozytortiumArtSpoz spoz, RepozytoriumInne repozytoriumInne, RepozytoriumArtGospDOm gospDOm) {
        this.spoz = spoz;
        this.repozytoriumInne = repozytoriumInne;
        this.gospDOm = gospDOm;
    }

    @RequestMapping("/")
    @ResponseBody
    public void cos(HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.print("sdad");
    }

    @RequestMapping("/lista")
    @ResponseBody
    public void lista(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String kategoria = request.getParameter("kategoria");
        PrintWriter writer = response.getWriter();
        if (kategoria.equals("spozywcze")) {

            writer.print(spoz.toString());
        } else if (kategoria.equals("inne")) {
            writer.print(repozytoriumInne.toString());
        } else if (kategoria.equals("domowe")) {
            writer.print(gospDOm.toString());
        }


    }

//

}
