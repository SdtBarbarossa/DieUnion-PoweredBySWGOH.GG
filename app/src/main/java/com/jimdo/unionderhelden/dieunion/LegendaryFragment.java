package com.jimdo.unionderhelden.dieunion;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Alle on 16.11.2017.
 */

public class LegendaryFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    public GildenInfos gildenInfos;
    public MainPage mainpage;

    public void SetArguments(GildenInfos gildenInfos,MainPage mainpage){
        this.gildenInfos = gildenInfos;
        this.mainpage = mainpage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.legendary_page,
                container, false);

        Collections.sort(gildenInfos.getMemberListe(), new memberComparator(mainpage.myEinstellungen.getplayerSortSettings()));

        Spinner spinMember = view.findViewById(R.id.spinnerMember);
        ArrayAdapter adapter = new ArrayAdapter(getActivity().getBaseContext(),android.R.layout.simple_spinner_item, gildenInfos.getMemberListe());
        spinMember.setAdapter(adapter);

        Spinner spinLegendary = view.findViewById(R.id.spinnerTeam);

        ArrayList<String> Legendarys = new ArrayList<String>();
        Legendarys.add("Commander Luke Skywalker");
        Legendarys.add("Rey (Jedi Schülerin)");
        Legendarys.add("Thrawn");
        Legendarys.add("R2-D2");
        Legendarys.add("BB8");

        ArrayAdapter adapterLegendary = new ArrayAdapter(getActivity().getBaseContext(),android.R.layout.simple_spinner_item, Legendarys);
        spinLegendary.setAdapter(adapterLegendary);
        spinLegendary.setOnItemSelectedListener(this);
        spinMember.setOnItemSelectedListener(this);

        return view;
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spinnerTeam1)
        {
            ArrayList<ArrayList<Charakter>> findAllTeams = new ArrayList<ArrayList<Charakter>>();

            for(int i = 0; i < gildenInfos.getMemberListe().size(); i ++){

                ArrayList<Charakter> thisChars = new ArrayList<Charakter>();
                haatTeam nowTeam = (haatTeam)spinner.getSelectedItem();
                for(int a = 0 ; a < nowTeam.teamChars.size() ; a++){
                    Charakter nowChar = gildenInfos.getMemberListe().get(i).findCharByName(nowTeam.teamChars.get(a).charName);
                    if(nowChar != null){
                        nowChar.Besitzer = gildenInfos.getMemberListe().get(i).getMemberName();
                        thisChars.add(nowChar);
                    }
                }

                if(thisChars.size() > 0){
                    findAllTeams.add(thisChars);
                }

            }

            //ALLE Charaktere in der Liste
            ListView listTeamview = getActivity().findViewById(R.id.teamListView);
            listTeamview.setAdapter(new TeamListAdapter(mainpage, findAllTeams));
        }
        else if(spinner.getId() == R.id.spinnerMember || spinner.getId() == R.id.spinnerTeam)
        {
            Spinner spinTeam = (Spinner)getActivity().findViewById(R.id.spinnerTeam);
            String selectedTeam = (String) spinTeam.getSelectedItem();

            Spinner spinMember = (Spinner)getActivity().findViewById(R.id.spinnerMember);
            MemberListe selectedMember = (MemberListe) spinMember.getSelectedItem();

            View charListView = (View) getActivity().findViewById(R.id.charList);

            View char1View = (View) charListView.findViewById(R.id.char1);
            View char2View = (View) charListView.findViewById(R.id.char2);
            View char3View = (View) charListView.findViewById(R.id.char3);
            View char4View = (View) charListView.findViewById(R.id.char4);
            View char5View = (View) charListView.findViewById(R.id.char5);

            ImageView char1Image = char1View.findViewById(R.id.charImage1);
            char1Image.setImageResource(R.drawable.wallpaper);
            ImageView char2Image = char2View.findViewById(R.id.charImage1);
            char2Image.setImageResource(R.drawable.wallpaper);
            ImageView char3Image = char3View.findViewById(R.id.charImage1);
            char3Image.setImageResource(R.drawable.wallpaper);
            ImageView char4Image = char4View.findViewById(R.id.charImage1);
            char4Image.setImageResource(R.drawable.wallpaper);
            ImageView char5Image = char5View.findViewById(R.id.charImage1);
            char5Image.setImageResource(R.drawable.wallpaper);

            switch (selectedTeam) {
                case "Commander Luke Skywalker":

                    ArrayList<Charakter> CLSList = new ArrayList<Charakter>();
                    Charakter Han = selectedMember.findCharByName("Stormtrooper Han");
                    if(Han != null) {
                        CLSList.add(Han);
                    }
                    Charakter Chewie = selectedMember.findCharByName("Obi-Wan Kenobi (Old Ben)");
                    if(Chewie != null) {
                        CLSList.add(Chewie);
                    }
                    Charakter Leia = selectedMember.findCharByName("Princess Leia");
                    if(Leia != null) {
                        CLSList.add(Leia);
                    }
                    Charakter Luke = selectedMember.findCharByName("Luke Skywalker (Farmboy)");
                    if(Luke != null) {
                        CLSList.add(Luke);
                    }
                    Charakter Rtwo = selectedMember.findCharByName("R2-D2");
                    if(Rtwo != null) {
                        CLSList.add(Rtwo);
                    }

                    for(int i = 0; i < CLSList.size() ; i++){

                        Charakter charac = CLSList.get(i);

                        View nowView = char1View;

                        switch(i){
                            case 0:
                                nowView = char1View;
                                break;
                            case 1:
                                nowView = char2View;
                                break;
                            case 2:
                                nowView = char3View;
                                break;
                            case 3:
                                nowView = char4View;
                                break;
                            case 4:
                                nowView = char5View;
                                break;
                            default:
                                continue;
                        }

                        ImageView imgChar = (ImageView)nowView.findViewById(R.id.charImage1);

                        switch(charac.getName()){
                            case "Obi-Wan Kenobi (Old Ben)":
                                imgChar.setImageResource(R.drawable.charui_obiwanep4);
                                break;
                            case "Stormtrooper Han":
                                imgChar.setImageResource(R.drawable.charui_trooperstorm_han);
                                break;
                            case "Princess Leia":
                                imgChar.setImageResource(R.drawable.charui_leia_princess);
                                break;
                            case "Luke Skywalker (Farmboy)":
                                imgChar.setImageResource(R.drawable.charui_luke_ep4);
                                break;
                            case "R2-D2":
                                imgChar.setImageResource(R.drawable.charui_astromech_r2d2);
                                break;
                            default:
                                break;
                        }

                        ImageView gearImage = (ImageView)nowView.findViewById(R.id.gearImage1);

                        if(CLSList.get(i).gearImageID() != 0)
                            gearImage.setImageResource(CLSList.get(i).gearImageID());

                        ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar11));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar21));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar31));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar41));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar51));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar61));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar71));

                        int stars = CLSList.get(i).getSterne();

                        for(int z = 0; z < imageStarList.size() ; z++) {
                            if(z < stars) {
                                imageStarList.get(z).setImageResource(R.drawable.star);
                            }else{
                                imageStarList.get(z).setImageResource(R.drawable.nostar);
                            }
                        }

                        TextView txtGear = (TextView) nowView.findViewById(R.id.gear);
                        txtGear.setText(CLSList.get(i).getGear().toString());

                        TextView txtperfektheit = (TextView) nowView.findViewById(R.id.perfektheit1);
                        txtperfektheit.setText(CLSList.get(i).getPerfekt().toString());

                    }

                    break;
                case "Rey (Jedi Schülerin)":
                    String[] ReyNames = { "Rey (Scavenger)","Finn","BB-8","Veteran Smuggler Han Solo","Veteran Smuggler Chewbacca" };

                    ArrayList<Charakter> ReyList = new ArrayList<Charakter>();

                    for(int i = 0 ; i < ReyNames.length; i++){
                        Charakter charac = selectedMember.findCharByName(ReyNames[i]);
                        if(charac != null){
                            ReyList.add(charac);
                        }
                    }

                    Collections.sort(ReyList, new Comparator<Charakter>() {
                        @Override public int compare(Charakter p1, Charakter p2) {
                            return p2.getPerfekt() - p1.getPerfekt();
                        }
                    });

                    if(ReyList.size() > 4){
                        ArrayList<Charakter> ReyFive = new ArrayList<Charakter>();
                        ReyFive.add(ReyList.get(0));
                        ReyFive.add(ReyList.get(1));
                        ReyFive.add(ReyList.get(2));
                        ReyFive.add(ReyList.get(3));
                        ReyFive.add(ReyList.get(4));
                        ReyList = ReyFive;
                    }

                    for(int i = 0; i < ReyList.size() ; i++){

                        Charakter charac = ReyList.get(i);

                        View nowView = char1View;

                        switch(i){
                            case 0:
                                nowView = char1View;
                                break;
                            case 1:
                                nowView = char2View;
                                break;
                            case 2:
                                nowView = char3View;
                                break;
                            case 3:
                                nowView = char4View;
                                break;
                            case 4:
                                nowView = char5View;
                                break;
                            default:
                                continue;
                        }

                        ImageView imgChar = (ImageView)nowView.findViewById(R.id.charImage1);

                        switch(charac.getName()){
                            case "Rey (Scavenger)":
                                imgChar.setImageResource(R.drawable.charui_reyjakku);
                                break;
                            case "Finn":
                                imgChar.setImageResource(R.drawable.charui_finnjakku);
                                break;
                            case "BB-8":
                                imgChar.setImageResource(R.drawable.charui_bb8);
                                break;
                            case "Veteran Smuggler Han Solo":
                                imgChar.setImageResource(R.drawable.charui_tfa_han);
                                break;
                            case "Veteran Smuggler Chewbacca":
                                imgChar.setImageResource(R.drawable.charui_tfa_chewbacca);
                                break;
                            default:
                                break;
                        }

                        ImageView gearImage = (ImageView)nowView.findViewById(R.id.gearImage1);

                        if(ReyList.get(i).gearImageID() != 0)
                            gearImage.setImageResource(ReyList.get(i).gearImageID());

                        ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar11));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar21));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar31));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar41));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar51));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar61));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar71));

                        int stars = ReyList.get(i).getSterne();

                        for(int z = 0; z < imageStarList.size() ; z++) {
                            if(z < stars) {
                                imageStarList.get(z).setImageResource(R.drawable.star);
                            }else{
                                imageStarList.get(z).setImageResource(R.drawable.nostar);
                            }
                        }

                        TextView txtGear = (TextView) nowView.findViewById(R.id.gear);
                        txtGear.setText(ReyList.get(i).getGear().toString());

                        TextView txtperfektheit = (TextView) nowView.findViewById(R.id.perfektheit1);
                        txtperfektheit.setText(ReyList.get(i).getPerfekt().toString());
                    }

                    break;
                case "BB8":
                    String[] resistanceNames = { "Captain Phasma","First Order Officer","First Order SF TIE Pilot","First Order Stormtrooper","First Order TIE Pilot","Kylo Ren","Kylo Ren (Unmasked)" };

                    ArrayList<Charakter> bb8List = new ArrayList<Charakter>();

                    for(int i = 0 ; i < resistanceNames.length; i++){
                        Charakter charac = selectedMember.findCharByName(resistanceNames[i]);
                        if(charac != null){
                            bb8List.add(charac);
                        }
                    }

                    Collections.sort(bb8List, new Comparator<Charakter>() {
                        @Override public int compare(Charakter p1, Charakter p2) {
                            return p2.getPerfekt() - p1.getPerfekt();
                        }
                    });

                    if(bb8List.size() > 4){
                        ArrayList<Charakter> bb8Five = new ArrayList<Charakter>();
                        bb8Five.add(bb8List.get(0));
                        bb8Five.add(bb8List.get(1));
                        bb8Five.add(bb8List.get(2));
                        bb8Five.add(bb8List.get(3));
                        bb8Five.add(bb8List.get(4));
                        bb8Five = bb8Five;
                    }

                    for(int i = 0; i < bb8List.size() ; i++){

                        Charakter charac = bb8List.get(i);

                        View nowView = char1View;

                        switch(i){
                            case 0:
                                nowView = char1View;
                                break;
                            case 1:
                                nowView = char2View;
                                break;
                            case 2:
                                nowView = char3View;
                                break;
                            case 3:
                                nowView = char4View;
                                break;
                            case 4:
                                nowView = char5View;
                                break;
                            default:
                                continue;
                        }

                        ImageView imgChar = (ImageView)nowView.findViewById(R.id.charImage1);

                        switch(charac.getName()){
                            case "Captain Phasma":
                                imgChar.setImageResource(R.drawable.charui_phasma);
                                break;
                            case "First Order Officer":
                                imgChar.setImageResource(R.drawable.charui_firstorderofficer);
                                break;
                            case "First Order SF TIE Pilot":
                                imgChar.setImageResource(R.drawable.charui_firstorder_pilot);
                                break;
                            case "First Order Stormtrooper":
                                imgChar.setImageResource(R.drawable.charui_firstordertrooper);
                                break;
                            case "First Order TIE Pilot":
                                imgChar.setImageResource(R.drawable.charui_firstordertiepilot);
                                break;
                            case "Kylo Ren":
                                imgChar.setImageResource(R.drawable.charui_kyloren);
                                break;
                            case "Kylo Ren (Unmasked)":
                                imgChar.setImageResource(R.drawable.charui_kylo_unmasked);
                                break;
                            default:
                                break;
                        }

                        ImageView gearImage = (ImageView)nowView.findViewById(R.id.gearImage1);

                        if(bb8List.get(i).gearImageID() != 0)
                            gearImage.setImageResource(bb8List.get(i).gearImageID());

                        ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar11));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar21));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar31));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar41));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar51));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar61));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar71));

                        int stars = bb8List.get(i).getSterne();

                        for(int z = 0; z < imageStarList.size() ; z++) {
                            if(z < stars) {
                                imageStarList.get(z).setImageResource(R.drawable.star);
                            }else{
                                imageStarList.get(z).setImageResource(R.drawable.nostar);
                            }
                        }

                        TextView txtGear = (TextView) nowView.findViewById(R.id.gear);
                        txtGear.setText(bb8List.get(i).getGear().toString());

                        TextView txtperfektheit = (TextView) nowView.findViewById(R.id.perfektheit1);
                        txtperfektheit.setText(bb8List.get(i).getPerfekt().toString());
                    }

                    break;
                case "R2-D2":
                    String[] empireNames = {"Colonel Starck", "Darth Vader", "Death Trooper", "Director Krennic", "Emperor Palpatine", "Gar Saxon","General Veers","Grand Admiral Thrawn","Grand Moff Tarkin","Imperial Probe Droid","Imperial Super Commando","Magmatrooper","Royal Guard","Shoretrooper","Snowtrooper","Stormtrooper","TIE Fighter Pilot"};

                    ArrayList<Charakter> r2List = new ArrayList<Charakter>();

                    for(int i = 0 ; i < empireNames.length; i++){
                        Charakter charac = selectedMember.findCharByName(empireNames[i]);
                        if(charac != null){
                            r2List.add(charac);
                        }
                    }

                    Collections.sort(r2List, new Comparator<Charakter>() {
                        @Override public int compare(Charakter p1, Charakter p2) {
                            return p2.getPerfekt() - p1.getPerfekt();
                        }
                    });

                    if(r2List.size() > 4){
                        ArrayList<Charakter> r2Five = new ArrayList<Charakter>();
                        r2Five.add(r2List.get(0));
                        r2Five.add(r2List.get(1));
                        r2Five.add(r2List.get(2));
                        r2Five.add(r2List.get(3));
                        r2Five.add(r2List.get(4));
                        r2Five = r2Five;
                    }

                    for(int i = 0; i < r2List.size() ; i++){

                        Charakter charac = r2List.get(i);

                        View nowView = char1View;

                        switch(i){
                            case 0:
                                nowView = char1View;
                                break;
                            case 1:
                                nowView = char2View;
                                break;
                            case 2:
                                nowView = char3View;
                                break;
                            case 3:
                                nowView = char4View;
                                break;
                            case 4:
                                nowView = char5View;
                                break;
                            default:
                                continue;
                        }

                        ImageView imgChar = (ImageView)nowView.findViewById(R.id.charImage1);

                        switch(charac.getName()){
                            case "Colonel Starck":
                                imgChar.setImageResource(R.drawable.charui_colonel_stark);
                                break;
                            case "Darth Vader":
                                imgChar.setImageResource(R.drawable.charui_vader);
                                break;
                            case "Death Trooper":
                                imgChar.setImageResource(R.drawable.charui_trooperdeath);
                                break;
                            case "Director Krennic":
                                imgChar.setImageResource(R.drawable.charui_krennic);
                                break;
                            case "Emperor Palpatine":
                                imgChar.setImageResource(R.drawable.charui_palpatineemperor);
                                break;
                            case "Gar Saxon":
                                imgChar.setImageResource(R.drawable.charui_gar_saxon);
                                break;
                            case "General Veers":
                                imgChar.setImageResource(R.drawable.charui_veers);
                                break;
                            case "Grand Admiral Thrawn":
                                imgChar.setImageResource(R.drawable.charui_thrawn);
                                break;
                            case "Grand Moff Tarkin":
                                imgChar.setImageResource(R.drawable.charui_tarkinadmiral);
                                break;
                            case "Imperial Probe Droid":
                                imgChar.setImageResource(R.drawable.charui_probedroid);
                                break;
                            case "Imperial Super Commando":
                                imgChar.setImageResource(R.drawable.charui_imperial_super_commando);
                                break;
                            case "Magmatrooper":
                                imgChar.setImageResource(R.drawable.charui_trooperstorm_magma);
                                break;
                            case "Royal Guard":
                                imgChar.setImageResource(R.drawable.charui_royalguard);
                                break;
                            case "Shoretrooper":
                                imgChar.setImageResource(R.drawable.charui_troopershore);
                                break;
                            case "Snowtrooper":
                                imgChar.setImageResource(R.drawable.charui_troopersnow);
                                break;
                            case "Stormtrooper":
                                imgChar.setImageResource(R.drawable.charui_trooperstorm);
                                break;
                            case "TIE Fighter Pilot":
                                imgChar.setImageResource(R.drawable.charui_tiepilot);
                                break;
                            default:
                                break;
                        }

                        ImageView gearImage = (ImageView)nowView.findViewById(R.id.gearImage1);

                        if(r2List.get(i).gearImageID() != 0)
                            gearImage.setImageResource(r2List.get(i).gearImageID());

                        ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar11));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar21));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar31));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar41));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar51));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar61));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar71));

                        int stars = r2List.get(i).getSterne();

                        for(int z = 0; z < imageStarList.size() ; z++) {
                            if(z < stars) {
                                imageStarList.get(z).setImageResource(R.drawable.star);
                            }else{
                                imageStarList.get(z).setImageResource(R.drawable.nostar);
                            }
                        }

                        TextView txtGear = (TextView) nowView.findViewById(R.id.gear);
                        txtGear.setText(r2List.get(i).getGear().toString());

                        TextView txtperfektheit = (TextView) nowView.findViewById(R.id.perfektheit1);
                        txtperfektheit.setText(r2List.get(i).getPerfekt().toString());
                    }

                    break;
                case "Thrawn":

                    ArrayList<Charakter> phoenixList = new ArrayList<Charakter>();
                    Charakter Hera = selectedMember.findCharByName("Hera Syndulla");
                    if(Hera != null) {
                        phoenixList.add(Hera);
                    }
                    Charakter Ezra = selectedMember.findCharByName("Ezra Bridger");
                    if(Ezra != null) {
                        phoenixList.add(Ezra);
                    }
                    Charakter Kanan = selectedMember.findCharByName("Kanan Jarrus");
                    if(Kanan != null) {
                        phoenixList.add(Kanan);
                    }
                    Charakter Garab = selectedMember.findCharByName("Garazeb \"Zeb\" Orrelios");
                    if(Garab != null) {
                        phoenixList.add(Garab);
                    }
                    Charakter Sabine = selectedMember.findCharByName("Sabine Wren");
                    if(Sabine != null) {
                        phoenixList.add(Sabine);
                    }
                    Charakter Chopper = selectedMember.findCharByName("Chopper");
                    if(Chopper != null) {
                        phoenixList.add(Chopper);
                    }

                    if(phoenixList.size() > 4){

                        int indexOfLowest = 0;
                        int lowest = 100;

                        for(int i = 0; i < phoenixList.size() ; i++){
                            if(phoenixList.get(i).getPerfekt()<lowest){
                                indexOfLowest = i;
                                lowest = phoenixList.get(i).getPerfekt();
                            }
                        }

                        phoenixList.remove(indexOfLowest);
                    }

                    for(int i = 0; i < phoenixList.size() ; i++){

                        Charakter charac = phoenixList.get(i);

                        View nowView = char1View;

                        switch(i){
                            case 0:
                                nowView = char1View;
                                break;
                            case 1:
                                nowView = char2View;
                                break;
                            case 2:
                                nowView = char3View;
                                break;
                            case 3:
                                nowView = char4View;
                                break;
                            case 4:
                                nowView = char5View;
                                break;
                            default:
                                continue;
                        }

                        ImageView imgChar = (ImageView)nowView.findViewById(R.id.charImage1);

                        switch(charac.getName()){
                            case "Hera Syndulla":
                                imgChar.setImageResource(R.drawable.charui_hera_s3);
                                break;
                            case "Ezra Bridger":
                                imgChar.setImageResource(R.drawable.charui_ezra_s3);
                                break;
                            case "Kanan Jarrus":
                                imgChar.setImageResource(R.drawable.charui_kanan_s3);
                                break;
                            case "Garazeb \"Zeb\" Orrelios":
                                imgChar.setImageResource(R.drawable.charui_zeb_s3);
                                break;
                            case "Sabine Wren":
                                imgChar.setImageResource(R.drawable.charui_sabine_s3);
                                break;
                            case "Chopper":
                                imgChar.setImageResource(R.drawable.charui_chopper);
                                break;
                            default:
                                break;
                        }

                        ImageView gearImage = (ImageView)nowView.findViewById(R.id.gearImage1);

                        if(phoenixList.get(i).gearImageID() != 0)
                            gearImage.setImageResource(phoenixList.get(i).gearImageID());


                        ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar11));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar21));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar31));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar41));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar51));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar61));
                        imageStarList.add((ImageView) nowView.findViewById(R.id.nostar71));

                        int stars = phoenixList.get(i).getSterne();

                        for(int z = 0; z < imageStarList.size() ; z++) {
                            if(z < stars) {
                                imageStarList.get(z).setImageResource(R.drawable.star);
                            }else{
                                imageStarList.get(z).setImageResource(R.drawable.nostar);
                            }
                        }

                        TextView txtGear = (TextView) nowView.findViewById(R.id.gear);
                        txtGear.setText(phoenixList.get(i).getGear().toString());

                        TextView txtperfektheit = (TextView) nowView.findViewById(R.id.perfektheit1);
                        txtperfektheit.setText(phoenixList.get(i).getPerfekt().toString());

                    }

                    break;
                default:
                    break;
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        // sometimes you need nothing here
    }

}
