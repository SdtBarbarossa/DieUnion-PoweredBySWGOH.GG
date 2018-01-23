package com.jimdo.unionderhelden.dieunion;

import java.util.Comparator;

/**
 * Created by Alle on 06.12.2017.
 */

public class memberComparator implements Comparator<MemberListe> {

        String sortBy = "";

        memberComparator(String sortBy){
            this.sortBy = sortBy;
        }

        public int compare(MemberListe left, MemberListe right)
        {
            switch(sortBy){
                case "OGM":
                    if (left.OverallPower > right.OverallPower) return -1;
                    if (left.OverallPower < right.OverallPower) return 1;
                    return 0;
                case "CGM":
                    if (left.CharPower > right.CharPower) return -1;
                    if (left.CharPower < right.CharPower) return 1;
                    return 0;
                case "FGM":
                    if (left.FleetPower > right.FleetPower) return -1;
                    if (left.FleetPower < right.FleetPower) return 1;
                    return 0;
                case "Name":
                    return left.getMemberName().compareTo(right.getMemberName());
                default:
                    return left.getMemberName().compareTo(right.getMemberName());
            }

        }
}
