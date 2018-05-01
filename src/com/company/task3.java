package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;


public class task3 {
   static  String  path;

    public static void main(String[] args) throws IOException {
        PrintWriter writer = null;
        String method = null;
        String hh=null;
        String em=null;
        String test = "";
        for (int i = 21; i <=30; i++) {
            path = "https://www.super.kg/media/audio/" + i;
            Document dc = Jsoup.connect(path).timeout(10000).get();
            Elements body = dc.select("div.media_mt");


            for (Element item : body) {
                hh = dc.select("h1.video_h1 a").html();
                 em= dc.select("h1.video_h1 em").html();
//
                method = item.select("div.media_mt span.video_desc_text").html();
                if(method=="") {
                    System.out.println(hh);
                    continue;
                }

                method = method.replaceAll("<br>", "\n");
                System.out.println(hh);
                System.out.println(em);
                System.out.println(method);
                writer = new PrintWriter (new OutputStreamWriter (new FileOutputStream ("C:\\Users\\cholp\\Desktop\\ex.doc",true /*trueappend*/), "UTF-8"));

               // writer.println(hh);
               // writer.println(em);
                writer.println(method);
                writer.close();
            }

            method=null;
            hh=null;
            em=null;
        }

    }
}

