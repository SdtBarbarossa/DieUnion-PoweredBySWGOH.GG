package com.jimdo.unionderhelden.dieunion;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

/**
 * Created by Alle on 16.11.2017.
 */

public class FleetPickerFragment extends Fragment implements View.OnClickListener {

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
        View view = inflater.inflate(R.layout.fleet_picker_page,
                container, false);

        loadFleets();

        Button AbbruchButton = view.findViewById(R.id.SquadPickerButtonAbort);
        AbbruchButton.setOnClickListener(this);

        Button hinzuButton = view.findViewById(R.id.SquadPickerButtonAdd);
        hinzuButton.setOnClickListener(this);

        String[] allSmallShips =  {"Ahsoka Tano's Jedi Starfighter",
                "Biggs Darklighter's X-wing",
                "Bistan's U-wing",
                "Cassian's U-wing",
                "Clone Sergeant's ARC-170",
                "First Order SF TIE Fighter",
                "First Order TIE Fighter",
                "Gauntlet Starfighter",
                "Geonosian Soldier's Starfighter",
                "Geonosian Spy's Starfighter",
                "Ghost",
                "Imperial TIE Fighter",
                "Jedi Consular's Starfighter",
                "Kylo Ren's Command Shuttle",
                "Millennium Falcon (Ep VII)",
                "Phantom II",
                "Plo Koon's Jedi Starfighter",
                "Poe Dameron's X-wing",
                "Resistance X-wing",
                "Rex's ARC-170",
                "Scimitar",
                "Slave I",
                "Sun Fac's Geonosian Starfighter",
                "TIE Advanced x1",
                "TIE Reaper",
                "TIE Silencer",
                "Umbaran Starfighter",
                "Wedge Antilles's X-wing"};

        String[] allCapitalShips = {"Home One", "Endurance", "Executrix", "Chimaera" };

        Spinner spinnerShip1 = view.findViewById(R.id.spinnerShipMain1);
        Spinner spinnerShip2 = view.findViewById(R.id.spinnerShipMain2);
        Spinner spinnerShip3 = view.findViewById(R.id.spinnerShipMain3);
        Spinner spinnerShip4 = view.findViewById(R.id.spinnerShipMain4);
        Spinner spinnerShip5 = view.findViewById(R.id.spinnerShipMain5);

        Spinner spinnerShipSupport1 = view.findViewById(R.id.spinnerShipSupport1);
        Spinner spinnerShipSupport2 = view.findViewById(R.id.spinnerShipSupport2);
        Spinner spinnerShipSupport3 = view.findViewById(R.id.spinnerShipSupport3);
        Spinner spinnerShipSupport4 = view.findViewById(R.id.spinnerShipSupport4);

        Spinner spinnerCapitalShip = view.findViewById(R.id.spinnerCapital);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(getContext(),   android.R.layout.simple_spinner_item, allSmallShips);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinnerShip1.setAdapter(spinnerArrayAdapter);
        spinnerShip2.setAdapter(spinnerArrayAdapter);
        spinnerShip3.setAdapter(spinnerArrayAdapter);
        spinnerShip4.setAdapter(spinnerArrayAdapter);
        spinnerShip5.setAdapter(spinnerArrayAdapter);
        spinnerShipSupport1.setAdapter(spinnerArrayAdapter);
        spinnerShipSupport2.setAdapter(spinnerArrayAdapter);
        spinnerShipSupport3.setAdapter(spinnerArrayAdapter);
        spinnerShipSupport4.setAdapter(spinnerArrayAdapter);

        ArrayAdapter<String> capitalSpinnerArrayAdapter = new ArrayAdapter<String>(getContext(),   android.R.layout.simple_spinner_item, allCapitalShips);
        capitalSpinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinnerCapitalShip.setAdapter(capitalSpinnerArrayAdapter);

        return view;
    }

    @Override
    public void onClick(View v) {

    if (v == mainpage.findViewById(R.id.SquadPickerButtonAbort)) {
            mainpage.showSquadUi();
        } else if (v == mainpage.findViewById(R.id.SquadPickerButtonAdd)) {

            Spinner spinnerCapitalShip = mainpage.findViewById(R.id.spinnerCapital);

            Spinner spinnerShip1 = mainpage.findViewById(R.id.spinnerShipMain1);
            Spinner spinnerShip2 = mainpage.findViewById(R.id.spinnerShipMain2);
            Spinner spinnerShip3 = mainpage.findViewById(R.id.spinnerShipMain3);
            Spinner spinnerShip4 = mainpage.findViewById(R.id.spinnerShipMain4);
            Spinner spinnerShip5 = mainpage.findViewById(R.id.spinnerShipMain5);

            Spinner spinnerSupportShip1 = mainpage.findViewById(R.id.spinnerShipSupport1);
            Spinner spinnerSupportShip2 = mainpage.findViewById(R.id.spinnerShipSupport2);
            Spinner spinnerSupportShip3 = mainpage.findViewById(R.id.spinnerShipSupport3);
            Spinner spinnerSupportShip4 = mainpage.findViewById(R.id.spinnerShipSupport4);

            EditText teamName = mainpage.findViewById(R.id.teamNameEditText);

            //GenereateTeam
            fleetTeam fleet = new fleetTeam(teamName.getText().toString());
            //Großkampfschiff
            fleet.capitalShip = spinnerCapitalShip.getSelectedItem().toString();
            //MainFlotte
            fleet.smallShips.add(spinnerShip1.getSelectedItem().toString());
            fleet.smallShips.add(spinnerShip2.getSelectedItem().toString());
            fleet.smallShips.add(spinnerShip3.getSelectedItem().toString());
            fleet.smallShips.add(spinnerShip4.getSelectedItem().toString());
            fleet.smallShips.add(spinnerShip5.getSelectedItem().toString());
            //SupportFlotte
            fleet.supportShips.add(spinnerSupportShip1.getSelectedItem().toString());
            fleet.supportShips.add(spinnerSupportShip2.getSelectedItem().toString());
            fleet.supportShips.add(spinnerSupportShip3.getSelectedItem().toString());
            fleet.supportShips.add(spinnerSupportShip4.getSelectedItem().toString());

            fleets.add(fleet);

            saveFleets();
            Toast.makeText(mainpage, "Flotte " + teamName.getText().toString() + " hinzugefügt", Toast.LENGTH_LONG).show();

            mainpage.showFleetUi();
        }
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

}
