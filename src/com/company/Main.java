package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Document dc = Jsoup.connect("https://valuta.kg/").timeout(6000).get();
        Elements body=dc.select("div.kurs-bar__rates");
//        System.out.println(body.text());
        for(Element step : body){

            String method=step.select("div.kurs-bar__item table.kurs-table").text();
            System.out.println(method);
        }
    }
}
