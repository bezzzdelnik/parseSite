import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private final static int matchID = 877285;


    public static void main(String[] args) throws IOException {

        ArrayList<Player> playersTeamA = new ArrayList<>();
        ArrayList<Player> playersTeamB = new ArrayList<>();

        WebClient webClient = new WebClient();
        HtmlPage myPage = webClient.getPage("https://text.khl.ru/en/" + matchID +".html");

        // convert to jsoup document
        Document doc = Jsoup.parse(myPage.asXml());

        // clean up resources
        webClient.close();

        Elements teamA = doc.select("#DataTables_Table_0 > tbody > tr");
        Elements teamB = doc.select("#DataTables_Table_4 > tbody > tr");

        for (int i = 1; i < teamA.size() + 1; i++) {
            Player player = new Player();
            player.setPlayerName( doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(2) > div").get(0).text());
            player.setPlayerG(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(3)").get(0).text());
            player.setPlayerA(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(4)").get(0).text());
            player.setPlayerPTS(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(5)").get(0).text());
            player.setPlayerSOG(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(6)").get(0).text());
            player.setPlayerPIM(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(7)").get(0).text());
            player.setPlayerFO(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(8)").get(0).text());
            player.setPlayerFOW(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(9)").get(0).text());
            player.setPlayerFOWPCT(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(10)").get(0).text());
            player.setPlayerBLS(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(11)").get(0).text());
            player.setPlayerHITS(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(12)").get(0).text());
            player.setPlayerFOA(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(13)").get(0).text());
            player.setPlayerTOI(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(14)").get(0).text());
            player.setPlayerTOA(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(15)").get(0).text());
            player.setPlayerMS(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(16)").get(0).text());
            player.setPlayerDT(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(17)").get(0).text());
            player.setPlayerCpC(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(18)").get(0).text());
            player.setPlayerPCD(doc.select("#DataTables_Table_0 > tbody > tr:nth-child("+i+") > td:nth-child(19)").get(0).text());
            playersTeamA.add(player);
        }

        for (int i = 1; i < teamB.size() + 1; i++) {
            Player player = new Player();
            player.setPlayerName( doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(2) > div").get(0).text());
            player.setPlayerG(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(3)").get(0).text());
            player.setPlayerA(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(4)").get(0).text());
            player.setPlayerPTS(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(5)").get(0).text());
            player.setPlayerSOG(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(6)").get(0).text());
            player.setPlayerPIM(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(7)").get(0).text());
            player.setPlayerFO(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(8)").get(0).text());
            player.setPlayerFOW(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(9)").get(0).text());
            player.setPlayerFOWPCT(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(10)").get(0).text());
            player.setPlayerBLS(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(11)").get(0).text());
            player.setPlayerHITS(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(12)").get(0).text());
            player.setPlayerFOA(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(13)").get(0).text());
            player.setPlayerTOI(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(14)").get(0).text());
            player.setPlayerTOA(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(15)").get(0).text());
            player.setPlayerMS(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(16)").get(0).text());
            player.setPlayerDT(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(17)").get(0).text());
            player.setPlayerCpC(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(18)").get(0).text());
            player.setPlayerPCD(doc.select("#DataTables_Table_4 > tbody > tr:nth-child("+i+") > td:nth-child(19)").get(0).text());
            playersTeamB.add(player);
        }

    }
}
