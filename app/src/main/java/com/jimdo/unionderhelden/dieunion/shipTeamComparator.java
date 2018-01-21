package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Alle on 06.12.2017.
 */

public class shipTeamComparator implements Comparator<ArrayList<Ship>> {

        public int compare(ArrayList<Ship> left, ArrayList<Ship> right)
        {
            int leftScore = 0;
            int rightScore = 0;

            for(int i = 0; i < left.size() ; i++){
            leftScore += left.get(i).power;
            }
            for(int i = 0; i < right.size() ; i++){
                rightScore += right.get(i).power;
            }

            if (leftScore > rightScore) return -1;
            if (leftScore < rightScore) return 1;
            return 0;
        }
}
