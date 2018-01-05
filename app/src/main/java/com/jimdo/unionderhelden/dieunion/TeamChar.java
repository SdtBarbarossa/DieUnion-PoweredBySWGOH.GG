package com.jimdo.unionderhelden.dieunion;

import android.graphics.drawable.Drawable;

/**
 * Created by Alle on 06.12.2017.
 */

public class TeamChar {

    public String charName;
    public int charBild;

    public TeamChar(String charname){
        charName = charname;
    }

    public TeamChar(){}

    public TeamChar(String charname, int charbild){
        charName = charname;
        charBild = charbild;
    }

}
