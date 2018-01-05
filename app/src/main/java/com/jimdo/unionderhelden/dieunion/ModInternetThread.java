package com.jimdo.unionderhelden.dieunion;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alle on 31.12.2017.
 */

public class ModInternetThread implements Runnable {

    public MainPage mainpage;
    public Charakter charac;

    public ModInternetThread(MainPage mainpage, Charakter charac){
        this.mainpage = mainpage;
        this.charac = charac;
    }

    @Override
    public void run() {
        try {
            Document doc = Jsoup.connect(charac.charUrl).get();
            Elements myin = doc.getElementsByClass("statmod-full");
            String Titel = "";

            ArrayList<Mod> modListe = new ArrayList<Mod>();

            for(int i = 0; i < myin.size(); i++) {
                Mod m1 = new Mod();
                m1.Name = myin.get(i).select(".statmod-title").text();
                Elements modstats = myin.get(i).select(".statmod-stat");
                m1.Attributes = new ArrayList<String>();
                if(modstats.size() > 0){
                    m1.PrimaryAttribut = modstats.get(0).select(".statmod-stat-value").get(0).text() + " " + modstats.get(0).select(".statmod-stat-label").get(0).text();
                }
                for(int z = 1; z < modstats.size() ; z++) {
                    m1.Attributes.add( modstats.get(z).select(".statmod-stat-value").get(0).text() + " " + modstats.get(z).select(".statmod-stat-label").get(0).text() );
                }

                modListe.add(m1);
            }

            mainpage.runOnUiThread(new ModThread(mainpage,charac,modListe));

        }catch(Exception ex){

        }
    }

    public static String getHTML(String urlToRead) throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL(urlToRead);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }
}
