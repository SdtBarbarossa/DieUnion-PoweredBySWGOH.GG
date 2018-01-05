package com.jimdo.unionderhelden.dieunion;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by Alle on 03.01.2018.
 */

public class TWTeam {

    public ArrayList<Charakter> charaktere;

    public TWTeam(){
        charaktere = new ArrayList<Charakter>();
    }

    public boolean isSeperator = false;

    public String SeperatorTitel = "";

    public int SeperatorVerteidiger = 0;

    public int PowerOfTeam(){
        int power = 0;
        for(int i = 0; i < charaktere.size() ; i++){
            power += charaktere.get(i).power;
        }
        return power;
    }

}
