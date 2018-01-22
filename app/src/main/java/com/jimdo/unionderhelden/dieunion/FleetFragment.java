package com.jimdo.unionderhelden.dieunion;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Alle on 16.11.2017.
 */

public class FleetFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    public ArrayList<fleetTeam> fleets = null;
    public GildenInfos gildenInfos;
    public MainPage mainpage;

    public void SetArguments(GildenInfos gildenInfos,MainPage mainpage){
        this.gildenInfos = gildenInfos;
        this.mainpage = mainpage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.squad_page,
                container, false);

        Spinner spinTeam1 = view.findViewById(R.id.spinnerTeam1);

        loadFleets();

        ArrayAdapter adapterHaat = new ArrayAdapter(getActivity().getBaseContext(),android.R.layout.simple_spinner_item, fleets);
        spinTeam1.setAdapter(adapterHaat);
        spinTeam1.setOnItemSelectedListener(this);

        Button entfernenButton = view.findViewById(R.id.EntfernenButton);
        entfernenButton.setOnClickListener(this);

        Button hinzuButton = view.findViewById(R.id.HinzuButton);
        hinzuButton.setOnClickListener(this);

        return view;
    }

    public void saveFleets(){

        try {
            //Object to JSON in String
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(fleets);
            ArrayList<fleetTeam> mySquads = mapper.readValue(jsonString, new TypeReference<ArrayList<fleetTeam>>(){});
            fleets = mySquads;

            // We need an Editor object to make preference changes.
            // All objects are from android.context.Context
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("fleetJson", mapper.writeValueAsString(fleets));
            editor.commit();
        } catch (Exception exep) {
            if(mainpage.myEinstellungen.geterrorSettings()) {
                Toast.makeText(mainpage, "Fehler: " + exep.getMessage(), Toast.LENGTH_SHORT).show();
            }
            exep.printStackTrace();
        }

    }

    public void loadFleets(){

        try {
            // Restore preferences
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
            String persistJson = settings.getString("fleetJson", "");
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<fleetTeam> mySquads = mapper.readValue(persistJson, new TypeReference<ArrayList<fleetTeam>>() {});
            fleets = mySquads;
            if(fleets == null)
                throw new Exception("fleets nicht gefunden");
        }catch(Exception ex) {
            if(mainpage.myEinstellungen.geterrorSettings()) {
                Toast.makeText(mainpage, "Fehler: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
            if(fleets == null) {
                ArrayList<fleetTeam> fleetTeams = new ArrayList<fleetTeam>();

                //Galactical Republic
                fleetTeam fleet = new fleetTeam("Galactical Republic");

                //Großkampfschiff
                fleet.capitalShip = "Endurance";

                //Hauptflotte
                fleet.smallShips.add("Ahsoka Tano's Jedi Starfighter");
                fleet.smallShips.add("Plo Koon's Jedi Starfighter");
                fleet.smallShips.add("Jedi Consular's Starfighter");
                fleet.smallShips.add("Rex's ARC-170");
                fleet.smallShips.add("Clone Sergeant's ARC-170");

                //Verstärkung
                fleet.supportShips.add("Umbaran Starfighter");
                fleet.supportShips.add("Biggs Darklighter's X-wing");
                fleet.supportShips.add("Wedge Antilles's X-wing");
                fleet.supportShips.add("Cassian's U-wing");

                fleetTeams.add(fleet);

                fleets = fleetTeams;

            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spinnerTeam1)
        {
            ArrayList<ArrayList<Ship>> findAllTeams = new ArrayList<ArrayList<Ship>>();

            for(int i = 0; i < gildenInfos.getMemberListe().size(); i ++){

                ArrayList<Ship> thisShips = new ArrayList<Ship>();
                fleetTeam nowTeam = (fleetTeam)spinner.getSelectedItem();

                Ship capitalShip = gildenInfos.getMemberListe().get(i).findShipByName(nowTeam.capitalShip);
                if(capitalShip != null){
                    thisShips.add(capitalShip);

                    for(int a = 0; a < nowTeam.smallShips.size(); a++){
                        Ship smallship = gildenInfos.getMemberListe().get(i).findShipByName(nowTeam.smallShips.get(a));
                        if(smallship != null) {
                            thisShips.add(smallship);
                        }
                    }

                        for(int b = 0; b < nowTeam.supportShips.size(); b++){
                            Ship supportship = gildenInfos.getMemberListe().get(i).findShipByName(nowTeam.supportShips.get(b));
                            if(supportship != null) {
                                thisShips.add(supportship);
                            }
                        }
                    findAllTeams.add(thisShips);
                }else{
                    continue;
                }

            }

            //ALLE Charaktere in der Liste
            ListView listTeamview = getActivity().findViewById(R.id.teamListView);
            listTeamview.setAdapter(new ShipTeamListAdapter(mainpage, findAllTeams));
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        // sometimes you need nothing here
    }

    @Override
    public void onClick(View v) {

        if(v == getActivity().findViewById(R.id.EntfernenButton)){


            Spinner spinTeam1 = getActivity().findViewById(R.id.spinnerTeam1);

            fleetTeam selectedFleet = (fleetTeam) spinTeam1.getSelectedItem();

            if(fleets.size() > 1) {
                fleets.remove(selectedFleet);
            }
            else{
                Toast.makeText(getActivity().getBaseContext(), "Eine Flotte muss bleiben!", Toast.LENGTH_LONG).show();
            }

            ArrayAdapter adapterHaat = new ArrayAdapter(getActivity().getBaseContext(),android.R.layout.simple_spinner_item, fleets);
            spinTeam1.setAdapter(adapterHaat);

            saveFleets();

        } else if( v == getActivity().findViewById(R.id.HinzuButton)){
            mainpage.showFleetAdderUi();
        }
        //ENDE
    }

}
