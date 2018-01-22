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

public class SquadPickerFragment extends Fragment implements View.OnClickListener {

    public ArrayList<haatTeam> squads = null;
    public GildenInfos gildenInfos;
    public MainPage mainpage;

    public void SetArguments(GildenInfos gildenInfos,MainPage mainpage){
        this.gildenInfos = gildenInfos;
        this.mainpage = mainpage;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.squad_picker_page,
                container, false);

        loadSquads();

        Button AbbruchButton = view.findViewById(R.id.SquadPickerButtonAbort);
        AbbruchButton.setOnClickListener(this);

        Button hinzuButton = view.findViewById(R.id.SquadPickerButtonAdd);
        hinzuButton.setOnClickListener(this);

        String[] allChars =  {"Ahsoka Tano"
                ,"Aayla Secura"
                ,"Admiral Ackbar"
                ,"Ahsoka Tano (Fulcrum)"
                ,"Asajj Ventress"
                ,"B2 Super Battle Droid"
                ,"Barriss Offee"
                ,"Baze Malbus"
                ,"BB-8"
                ,"Biggs Darklighter"
                ,"Bistan"
                ,"Boba Fett"
                ,"Bodhi Rook"
                ,"Cad Bane"
                ,"Captain Han Solo"
                ,"Captain Phasma"
                ,"Cassian Andor"
                ,"CC-2224 \"Cody\""
                ,"Chief Chirpa"
                ,"Chief Nebit"
                ,"Chirrut Îmwe"
                ,"Chopper"
                ,"Clone Sergeant - Phase I"
                ,"Clone Wars Chewbacca"
                ,"Colonel Starck"
                ,"Commander Luke Skywalker"
                ,"Coruscant Underworld Police"
                ,"Count Dooku"
                ,"CT-21-0408 \"Echo\""
                ,"CT-5555 \"Fives\""
                ,"CT-7567 \"Rex\""
                ,"Darth Maul"
                ,"Darth Nihilus"
                ,"Darth Sidious"
                ,"Darth Vader"
                ,"Dathcha"
                ,"Death Trooper"
                ,"Dengar"
                ,"Director Krennic"
                ,"Eeth Koth"
                ,"Emperor Palpatine"
                ,"Ewok Elder"
                ,"Ewok Scout"
                ,"Ezra Bridger"
                ,"Finn"
                ,"First Order Officer"
                ,"First Order SF TIE Pilot"
                ,"First Order Stormtrooper"
                ,"First Order TIE Pilot"
                ,"Gamorrean Guard"
                ,"Gar Saxon"
                ,"Garazeb \"Zeb\" Orrelios"
                ,"General Grievous"
                ,"General Kenobi"
                ,"General Veers"
                ,"Geonosian Soldier"
                ,"Geonosian Spy"
                ,"Grand Admiral Thrawn"
                ,"Grand Master Yoda"
                ,"Grand Moff Tarkin"
                ,"Greedo"
                ,"Han Solo"
                ,"Hera Syndulla"
                ,"Hermit Yoda"
                ,"HK-47"
                ,"Hoth Rebel Scout"
                ,"Hoth Rebel Soldier"
                ,"IG-100 MagnaGuard"
                ,"IG-86 Sentinel Droid"
                ,"IG-88"
                ,"Ima-Gun Di"
                ,"Imperial Probe Droid"
                ,"Imperial Super Commando"
                ,"Jawa"
                ,"Jawa Engineer"
                ,"Jawa Scavenger"
                ,"Jedi Consular"
                ,"Jedi Knight Anakin"
                ,"Jedi Knight Guardian"
                ,"Jyn Erso"
                ,"K-2SO"
                ,"Kanan Jarrus"
                ,"Kit Fisto"
                ,"Kylo Ren"
                ,"Kylo Ren (Unmasked)"
                ,"Lando Calrissian"
                ,"Lobot"
                ,"Logray"
                ,"Luke Skywalker (Farmboy)"
                ,"Luminara Unduli"
                ,"Mace Windu"
                ,"Magmatrooper"
                ,"Mob Enforcer"
                ,"Mother Talzin"
                ,"Nightsister Acolyte"
                ,"Nightsister Initiate"
                ,"Nightsister Spirit"
                ,"Nightsister Zombie"
                ,"Nute Gunray"
                ,"Obi-Wan Kenobi (Old Ben)"
                ,"Old Daka"
                ,"Pao"
                ,"Paploo"
                ,"Plo Koon"
                ,"Poe Dameron"
                ,"Poggle the Lesser"
                ,"Princess Leia"
                ,"Qui-Gon Jinn"
                ,"R2-D2"
                ,"Rebel Officer Leia Organa"
                ,"Resistance Pilot"
                ,"Resistance Trooper"
                ,"Rey (Scavenger)"
                ,"Rey (Jedi Training)"
                ,"Royal Guard"
                ,"Sabine Wren"
                ,"Savage Opress"
                ,"Scarif Rebel Pathfinder"
                ,"Shoretrooper"
                ,"Sith Assassin"
                ,"Sith Trooper"
                ,"Snowtrooper"
                ,"Stormtrooper"
                ,"Stormtrooper Han"
                ,"Sun Fac"
                ,"Talia"
                ,"Teebo"
                ,"TIE Fighter Pilot"
                ,"Tusken Raider"
                ,"Tusken Shaman"
                ,"Ugnaught"
                ,"URoRRuR'R'R"
                ,"Veteran Smuggler Chewbacca"
                ,"Veteran Smuggler Han Solo"
                ,"Wampa"
                ,"Wedge Antilles"
                ,"Wicket"
                ,"Zam Wesell"};

        Spinner spinnerChar1 = view.findViewById(R.id.spinnerChar1);
        Spinner spinnerChar2 = view.findViewById(R.id.spinnerChar2);
        Spinner spinnerChar3 = view.findViewById(R.id.spinnerChar3);
        Spinner spinnerChar4 = view.findViewById(R.id.spinnerChar4);
        Spinner spinnerChar5 = view.findViewById(R.id.spinnerChar5);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(getContext(),   android.R.layout.simple_spinner_item, allChars);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinnerChar1.setAdapter(spinnerArrayAdapter);
        spinnerChar2.setAdapter(spinnerArrayAdapter);
        spinnerChar3.setAdapter(spinnerArrayAdapter);
        spinnerChar4.setAdapter(spinnerArrayAdapter);
        spinnerChar5.setAdapter(spinnerArrayAdapter);

        return view;
    }

    @Override
    public void onClick(View v) {

    if (v == mainpage.findViewById(R.id.SquadPickerButtonAbort)) {
            mainpage.showSquadUi();
        } else if (v == mainpage.findViewById(R.id.SquadPickerButtonAdd)) {

            Spinner spinnerChar1 = mainpage.findViewById(R.id.spinnerChar1);
            Spinner spinnerChar2 = mainpage.findViewById(R.id.spinnerChar2);
            Spinner spinnerChar3 = mainpage.findViewById(R.id.spinnerChar3);
            Spinner spinnerChar4 = mainpage.findViewById(R.id.spinnerChar4);
            Spinner spinnerChar5 = mainpage.findViewById(R.id.spinnerChar5);

            EditText teamName = mainpage.findViewById(R.id.teamNameEditText);

            //GenereateTeam
            ArrayList<TeamChar> OwnTeam = new ArrayList<TeamChar>();
            OwnTeam.add(new TeamChar(spinnerChar1.getSelectedItem().toString()));
            OwnTeam.add(new TeamChar(spinnerChar2.getSelectedItem().toString()));
            OwnTeam.add(new TeamChar(spinnerChar3.getSelectedItem().toString()));
            OwnTeam.add(new TeamChar(spinnerChar4.getSelectedItem().toString()));
            OwnTeam.add(new TeamChar(spinnerChar5.getSelectedItem().toString()));
            squads.add(new haatTeam(teamName.getText().toString(), OwnTeam));

            saveSquads();
            Toast.makeText(mainpage, "Team " + teamName.getText().toString() + " hinzugefügt", Toast.LENGTH_LONG).show();

            mainpage.showSquadUi();
        }
    }

    public void loadSquads(){

        try {
            // Restore preferences
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
            String persistJson = settings.getString("squadsJson", "");
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<haatTeam> mySquads = mapper.readValue(persistJson, new TypeReference<ArrayList<haatTeam>>() {});
            squads = mySquads;
            if(squads == null)
                throw new Exception("squads nicht gefunden");
        }catch(Exception ex) {
            if(mainpage.myEinstellungen.geterrorSettings()) {
                Toast.makeText(mainpage, "Fehler: " + ex.getMessage(), Toast.LENGTH_SHORT).show();
            }
            if(squads == null) {
                ArrayList<haatTeam> haatTeams = new ArrayList<haatTeam>();
                //Rancor

                //Phoenix
                ArrayList<TeamChar> PhoenixTeam = new ArrayList<TeamChar>();
                PhoenixTeam.add(new TeamChar("Hera Syndulla"));
                PhoenixTeam.add(new TeamChar("Ezra Bridger"));
                PhoenixTeam.add(new TeamChar("Kanan Jarrus"));
                PhoenixTeam.add(new TeamChar("Garazeb \"Zeb\" Orrelios"));
                PhoenixTeam.add(new TeamChar("Chopper"));
                haatTeams.add(new haatTeam("Phönix", PhoenixTeam));

                squads = haatTeams;

            }
        }
    }

    public void saveSquads(){

        try {
            //Object to JSON in String
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(squads);
            ArrayList<haatTeam> mySquads = mapper.readValue(jsonString, new TypeReference<ArrayList<haatTeam>>(){});
            squads = mySquads;

            // We need an Editor object to make preference changes.
            // All objects are from android.context.Context
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity().getBaseContext());
            SharedPreferences.Editor editor = settings.edit();
            editor.putString("squadsJson", mapper.writeValueAsString(squads));
            editor.commit();
        } catch (Exception exep) {
            if(mainpage.myEinstellungen.geterrorSettings()) {
                Toast.makeText(mainpage, "Fehler: " + exep.getMessage(), Toast.LENGTH_SHORT).show();
            }
            exep.printStackTrace();
        }

    }

}
