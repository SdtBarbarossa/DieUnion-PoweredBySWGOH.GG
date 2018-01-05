package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;

/**
 * Created by Alle on 03.01.2018.
 */

public class TWPlan {

    ArrayList<TWGebiet> gebiete;

    public TWPlan(){

    }

    public void GeneriereGebiete(){

        TWGebiet o1 = new TWGebiet("O1");
        TWGebiet o2 = new TWGebiet("O2");

        TWGebiet m1 = new TWGebiet("M1");
        TWGebiet m2 = new TWGebiet("M2");

        TWGebiet u1 = new TWGebiet("U1");
        TWGebiet u2 = new TWGebiet("U2");
        TWGebiet u3 = new TWGebiet("U3");
        TWGebiet u4 = new TWGebiet("U4");

        gebiete = new ArrayList<TWGebiet>();

        gebiete.add(o1);
        gebiete.add(o2);

        gebiete.add(m1);
        gebiete.add(m2);

        gebiete.add(u1);
        gebiete.add(u2);
        gebiete.add(u3);
        gebiete.add(u4);

    }

    public boolean isCharInUse(Charakter charac){

        for(int i = 0; i < gebiete.size() ; i++){
            for(int z = 0 ; z < gebiete.get(i).teams.size() ; z++){
                for(int a = 0; a < gebiete.get(i).teams.get(z).charaktere.size(); a++){
                    Charakter characNow = gebiete.get(i).teams.get(z).charaktere.get(a);
                    if(characNow.besitzer.equals(charac.besitzer) && characNow.getName().equals(charac.getName())){
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
