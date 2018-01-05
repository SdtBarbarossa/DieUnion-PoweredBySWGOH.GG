package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;

/**
 * Created by Alle on 10.12.2017.
 */

public class ArenaTeamListe {

    public String Besitzer;
    public String ArenaRang;
    public ArrayList<Charakter> charakterListe;

    public ArenaTeamListe(String Besitzer, String ArenaRang, ArrayList<Charakter> charakterListe){
        this.Besitzer = Besitzer;
        this.ArenaRang = ArenaRang;
        this.charakterListe = charakterListe;
    }
}
