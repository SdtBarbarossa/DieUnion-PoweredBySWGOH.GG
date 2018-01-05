package com.jimdo.unionderhelden.dieunion;

import android.app.AlertDialog;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * Created by Alle on 31.12.2017.
 */

public class ModThread implements Runnable {

        public MainPage mainpage;
        public Charakter charac;
        public ArrayList<Mod> ModListe;

        public ModThread(MainPage mainpage, Charakter charac, ArrayList<Mod> ModListe){
            this.mainpage = mainpage;
            this.charac = charac;
            this.ModListe = ModListe;
        }

                @Override
                public void run() {
                    // create an AlertDialog.Builder
                    AlertDialog.Builder builder = new AlertDialog.Builder(mainpage);
                    LayoutInflater inflater = mainpage.getLayoutInflater();
                    View dialogView = inflater.inflate(R.layout.modview, null);
                    // set the WebView as the AlertDialog.Builder’s view
                    builder.setTitle("Mods");
                    builder.setView(dialogView);
                    builder.show();
                    ListView ModListView = dialogView.findViewById(R.id.ListViewMods);
                    ModListView.setAdapter(new ModListAdapter(mainpage, ModListe));
                }

}
