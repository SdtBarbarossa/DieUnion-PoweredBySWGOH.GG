package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;

/**
 * Created by Alle on 06.12.2017.
 */

public class fleetTeam {

    String teamName;
    String capitalShip;
    ArrayList<String> smallShips;
    ArrayList<String> supportShips;

    public fleetTeam(String teamname, String capitalShip, ArrayList<String> smallShips, ArrayList<String> supportShips){
        this.teamName = teamname;
        this.capitalShip = capitalShip;
        this.smallShips = smallShips;
        this.supportShips = supportShips;
    }

    public fleetTeam(String teamname){
        this.teamName = teamname;
        this.capitalShip = "";
        this.smallShips = new ArrayList<String>();
        this.supportShips = new ArrayList<String>();
    }


    public fleetTeam(){

    }

    @Override
    public String toString() {
        return teamName;
    }
}
