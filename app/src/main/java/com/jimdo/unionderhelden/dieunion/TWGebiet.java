package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;

/**
 * Created by Alle on 03.01.2018.
 */

public class TWGebiet {

    ArrayList<TWTeam> teams;
    String GebietsName;

    public TWGebiet(){

    }

    public TWGebiet(String GebietsName){
        this.GebietsName = GebietsName;
        teams = new ArrayList<TWTeam>();
    }

}
