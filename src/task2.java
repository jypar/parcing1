package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;




public class task2 {

    public static void main(String[] args) throws IOException {
        Document dc = Jsoup.connect("https://valuta.kg/").timeout(6000).get();
        Element table = dc.select("table").get(1); //select the second table.
        Elements rows = table.select("tr");
        Element row = rows.get(1);
        Element dollar = row.select("td").get(0);
        String m=dollar.text();

            System.out.println(m);


    }
}
