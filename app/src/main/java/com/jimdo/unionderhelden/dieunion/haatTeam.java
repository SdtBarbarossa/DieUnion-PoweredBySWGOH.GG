package com.jimdo.unionderhelden.dieunion;

import java.time.temporal.TemporalAmount;
import java.util.ArrayList;

/**
 * Created by Alle on 06.12.2017.
 */

public class haatTeam {

    String teamName;
    ArrayList<TeamChar> teamChars;

    public haatTeam(String teamname, ArrayList<TeamChar> teamchars){
        teamName = teamname;
        teamChars = teamchars;
    }

    public haatTeam(){

    }

    @Override
    public String toString() {
        return teamName;
    }
}
