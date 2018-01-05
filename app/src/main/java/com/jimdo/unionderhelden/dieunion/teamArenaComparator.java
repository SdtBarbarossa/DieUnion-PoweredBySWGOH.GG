package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Alle on 06.12.2017.
 */

public class teamArenaComparator implements Comparator<ArenaTeamListe> {

        public int compare(ArenaTeamListe left, ArenaTeamListe right)
        {
            if (Integer.parseInt(left.ArenaRang) < Integer.parseInt(right.ArenaRang)) return -1;
            if (Integer.parseInt(left.ArenaRang) > Integer.parseInt(right.ArenaRang)) return 1;
            return 0;
        }
}
