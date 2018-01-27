
package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "Level",
    "Gear",
    "Perfekt",
    "Sterne",
    "CharUrl",
    "Besitzer",
    "Power"
})
public class Charakter {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Level")
    private Integer level;
    @JsonProperty("Gear")
    private Integer gear;
    @JsonProperty("Perfekt")
    private Integer perfekt;
    @JsonProperty("Sterne")
    private Integer sterne;
    @JsonProperty("CharUrl")
    public String charUrl;
    @JsonProperty("Besitzer")
    public String besitzer;
    @JsonProperty("Power")
    public Integer power;
    @JsonProperty("FarmLocations")
    public String[] FarmLocations;
    @JsonProperty("GearLevel")
    public ArrayList<Gearlevel> gearlevels;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String Besitzer;

    @JsonProperty("Name")
    public String getName() {
        return name.replace("&quot;", "\"");
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("Gear")
    public Integer getGear() {
        return gear;
    }

    @JsonProperty("Gear")
    public void setGear(Integer gear) {
        this.gear = gear;
    }

    @JsonProperty("Perfekt")
    public Integer getPerfekt() {
        return perfekt;
    }

    @JsonProperty("Perfekt")
    public void setPerfekt(Integer perfekt) {
        this.perfekt = perfekt;
    }

    @JsonProperty("Sterne")
    public Integer getSterne() {
        return sterne;
    }

    @JsonProperty("Sterne")
    public void setSterne(Integer sterne) {
        this.sterne = sterne;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public int gearImageID(){
        switch(getGear()){
            case 0:
                break;
            case 1:
                return R.drawable.gearicong1;
            case 2:
                return R.drawable.gearicong2;
            case 3:
                return R.drawable.gearicong3;
            case 4:
                return R.drawable.gearicong4;
            case 5:
                return R.drawable.gearicong5;
            case 6:
                return R.drawable.gearicong6;
            case 7:
                return R.drawable.gearicong7;
            case 8:
                return R.drawable.gearicong8;
            case 9:
                return R.drawable.gearicong9;
            case 10:
                return R.drawable.gearicong10;
            case 11:
                return R.drawable.gearicong11;
            case 12:
                return R.drawable.gearicong12;
            default:
                return 0;
        }
        return 0;
    }

    public int charImageID(){

        switch (getName().replace("&quot;","\"")) {
            case "Ahsoka Tano":
                return R.drawable.charui_ahsoka;
            case "Aayla Secura":
                return R.drawable.charui_aaylasecura;
            case "Admiral Ackbar":
                return R.drawable.charui_ackbaradmiral;
            case "Ahsoka Tano (Fulcrum)":
                return R.drawable.charui_ahsokaadult;
            case "Asajj Ventress":
                return R.drawable.charui_ventress;
            case "B2 Super Battle Droid":
                return R.drawable.charui_b2;
            case "Barriss Offee":
                return R.drawable.charui_barriss_light;
            case "Baze Malbus":
                return R.drawable.charui_bazemalbus;
            case "BB-8":
                return R.drawable.charui_bb8;
            case "Biggs Darklighter":
                return R.drawable.charui_rebelpilot_biggs;
            case "Bistan":
                return R.drawable.charui_bistan;
            case "Boba Fett":
                return R.drawable.charui_bobafett;
            case "Bodhi Rook":
                return R.drawable.charui_bodhi;
            case "Cad Bane":
                return R.drawable.charui_cadbane;
            case "Captain Han Solo":
                return R.drawable.charui_hoth_han;
            case "Captain Phasma":
                return R.drawable.charui_phasma;
            case "Cassian Andor":
                return R.drawable.charui_cassian;
            case "CC-2224 \"Cody\"":
                return R.drawable.charui_trooperclone_cody;
            case "Chief Chirpa":
                return R.drawable.charui_ewok_chirpa;
            case "Chief Nebit":
                return R.drawable.charui_jawa_nebit;
            case "Chirrut Îmwe":
                return R.drawable.charui_chirrut;
            case "Chopper":
                return R.drawable.charui_chopper;
            case "Clone Sergeant - Phase I":
                return R.drawable.charui_trooperclonegreen;
            case "Clone Wars Chewbacca":
                return R.drawable.charui_chewbacca;
            case "Colonel Starck":
                return R.drawable.charui_colonel_stark;
            case "Commander Luke Skywalker":
                return R.drawable.charui_lukebespin;
            case "Coruscant Underworld Police":
                return R.drawable.charui_coruscantpolice;
            case "Count Dooku":
                return R.drawable.charui_dooku;
            case "CT-21-0408 \"Echo\"":
                return R.drawable.charui_trooperclone_echo;
            case "CT-5555 \"Fives\"":
                return R.drawable.charui_trooperclone_fives;
            case "CT-7567 \"Rex\"":
                return R.drawable.charui_trooperclone_rex;
            case "Darth Maul":
                return R.drawable.charui_maul;
            case "Darth Nihilus":
                return R.drawable.charui_nihilus;
            case "Darth Sidious":
                return R.drawable.charui_sidious;
            case "Darth Vader":
                return R.drawable.charui_vader;
            case "Dathcha":
                return R.drawable.charui_jawa_dathcha;
            case "Death Trooper":
                return R.drawable.charui_trooperdeath;
            case "Dengar":
                return R.drawable.charui_dengar;
            case "Director Krennic":
                return R.drawable.charui_krennic;
            case "Eeth Koth":
                return R.drawable.charui_eethkoth;
            case "Emperor Palpatine":
                return R.drawable.charui_palpatineemperor;
            case  "Ewok Elder":
                return R.drawable.charui_ewok_logray;
            case  "Ewok Scout":
                return R.drawable.charui_ewok_scout;
            case "Ezra Bridger":
                return R.drawable.charui_ezra_s3;
            case "Finn":
                return R.drawable.charui_finnjakku;
            case "First Order Officer":
                return R.drawable.charui_firstorderofficer;
            case "First Order SF TIE Pilot":
                return R.drawable.charui_firstorder_pilot;
            case "First Order Stormtrooper":
                return R.drawable.charui_firstordertrooper;
            case "First Order TIE Pilot":
                return R.drawable.charui_firstordertiepilot;
            case "Gamorrean Guard":
                return R.drawable.charui_gamorreanguard;
            case "Gar Saxon":
                return R.drawable.charui_gar_saxon;
            case "Garazeb \"Zeb\" Orrelios":
                return R.drawable.charui_zeb_s3;
            case "General Grievous":
                return R.drawable.charui_grievous;
            case "General Kenobi":
                return R.drawable.charui_obiwangeneral;
            case  "General Veers":
                return R.drawable.charui_veers;
            case  "Geonosian Soldier":
                return R.drawable.charui_geonosian_soldier;
            case  "Geonosian Spy":
                return R.drawable.charui_geonosian_spy;
            case "Grand Admiral Thrawn":
                return R.drawable.charui_thrawn;
            case  "Grand Master Yoda":
                return R.drawable.charui_yodagrandmaster;
            case "Grand Moff Tarkin":
                return R.drawable.charui_tarkinadmiral;
            case "Greedo":
                return R.drawable.charui_greedo;
            case "Han Solo":
                return R.drawable.charui_han;
            case "Hera Syndulla":
                return R.drawable.charui_hera_s3;
            case  "Hermit Yoda":
                return R.drawable.charui_yodahermit;
            case "HK-47":
                return R.drawable.charui_hk47;
            case "Hoth Rebel Scout":
                return R.drawable.charui_rebelhothscout;
            case  "Hoth Rebel Soldier":
                return R.drawable.charui_rebelhoth;
            case "IG-100 MagnaGuard":
                return R.drawable.charui_magnaguard;
            case "IG-86 Sentinel Droid":
                return R.drawable.charui_ig86;
            case "IG-88":
                return R.drawable.charui_ig88;
            case "Ima-Gun Di":
                return R.drawable.charui_imagundi;
            case "Imperial Probe Droid":
                return R.drawable.charui_probedroid;
            case  "Imperial Super Commando":
                return R.drawable.charui_imperial_super_commando;
            case  "Jawa":
                return R.drawable.charui_jawa_jawa;
            case "Jawa Engineer":
                return R.drawable.charui_jawa_engineer;
            case "Jawa Scavenger":
                return R.drawable.charui_jawa_scavenger;
            case "Jedi Consular":
                return R.drawable.charui_jedi_consular_03;
            case  "Jedi Knight Anakin":
                return R.drawable.charui_anakinknight;
            case  "Jedi Knight Guardian":
                return R.drawable.charui_jedi_guardian_01;
            case  "Jyn Erso":
                return R.drawable.charui_jyn;
            case  "K-2SO":
                return R.drawable.charui_k2so;
            case  "Kanan Jarrus":
                return R.drawable.charui_kanan_s3;
            case "Kit Fisto":
                return R.drawable.charui_kitfisto;
            case "Kylo Ren":
                return R.drawable.charui_kyloren;
            case "Kylo Ren (Unmasked)":
                return R.drawable.charui_kylo_unmasked;
            case "Lando Calrissian":
                return R.drawable.charui_landobespin;
            case "Lobot":
                return R.drawable.charui_lobot;
            case "Logray":
                return R.drawable.charui_ewok_logray;
            case  "Luke Skywalker (Farmboy)":
                return R.drawable.charui_luke_ep4;
            case  "Luminara Unduli":
                return R.drawable.charui_luminara;
            case "Mace Windu":
                return R.drawable.charui_macewindu;
            case "Magmatrooper":
                return R.drawable.charui_trooperstorm_magma;
            case "Mob Enforcer":
                return R.drawable.charui_thug_female_01;
            case  "Mother Talzin":
                return R.drawable.charui_nightsisters_talzin;
            case  "Nightsister Acolyte":
                return R.drawable.charui_nightsister_acolyte;
            case  "Nightsister Initiate":
                return R.drawable.charui_nightsister_initiate;
            case "Nightsister Spirit":
                return R.drawable.charui_nightsisters_wraith;
            case  "Nightsister Zombie":
                return R.drawable.charui_nightsisters_zombie;
            case "Nute Gunray":
                return R.drawable.charui_nutegunray;
            case "Obi-Wan Kenobi (Old Ben)":
                return R.drawable.charui_obiwanep4;
            case  "Old Daka":
                return R.drawable.charui_daka;
            case "Pao":
                return R.drawable.charui_pao;
            case  "Paploo":
                return R.drawable.charui_ewok_paploo;
            case "Plo Koon":
                return R.drawable.charui_plokoon;
            case "Poe Dameron":
                return R.drawable.charui_poe;
            case  "Poggle the Lesser":
                return R.drawable.charui_geonosian_poggle;
            case "Princess Leia":
                return R.drawable.charui_leia_princess;
            case "Qui-Gon Jinn":
                return R.drawable.charui_quigon;
            case "R2-D2":
                return R.drawable.charui_astromech_r2d2;
            case "Rebel Officer Leia Organa":
                return R.drawable.charui_leiahoth;
            case "Resistance Pilot":
                return R.drawable.charui_resistancepilot;
            case  "Resistance Trooper":
                return R.drawable.charui_resistancetrooper;
            case  "Rey (Scavenger)":
                return R.drawable.charui_reyjakku;
            case "Rey (Jedi Training)":
                return R.drawable.charui_rey_tlj;
            case "Royal Guard":
                return R.drawable.charui_royalguard;
            case "Sabine Wren":
                return R.drawable.charui_sabine_s3;
            case "Savage Opress":
                return R.drawable.charui_savageopress;
            case "Scarif Rebel Pathfinder":
                return R.drawable.charui_rebel_scarif;
            case "Shoretrooper":
                return R.drawable.charui_troopershore;
            case "Sith Assassin":
                return R.drawable.charui_sithassassin;
            case "Sith Trooper":
                return R.drawable.charui_sithtrooper;
            case "Snowtrooper":
                return R.drawable.charui_troopersnow;
            case "Stormtrooper":
                return R.drawable.charui_trooperstorm;
            case "Stormtrooper Han":
                return R.drawable.charui_trooperstorm_han;
            case "Sun Fac":
                return R.drawable.charui_geonosian_sunfac;
            case "Talia":
                return R.drawable.charui_nightsister_talia;
            case "Teebo":
                return R.drawable.charui_ewok_teebo;
            case "TIE Fighter Pilot":
                return R.drawable.charui_tiepilot;
            case "Tusken Raider":
                return R.drawable.charui_tuskenraider;
            case "Tusken Shaman":
                return R.drawable.charui_tuskenshaman;
            case "Ugnaught":
                return R.drawable.charui_ugnaught;
            case  "URoRRuR'R'R":
                return R.drawable.charui_urorrurrr;
            case  "Veteran Smuggler Chewbacca":
                return R.drawable.charui_tfa_chewbacca;
            case "Veteran Smuggler Han Solo":
                return R.drawable.charui_tfa_han;
            case "Wampa":
                return R.drawable.charui_wampa;
            case "Wedge Antilles":
                return R.drawable.charui_rebelpilot_wedge;
            case "Wicket":
                return R.drawable.charui_ewok_wicket;
            case "Zam Wesell":
                return R.drawable.charui_zamwesell;
            case "First Order Executioner":
                return R.drawable.charui_firstorder_executioner;
            default:
                break;
        }

        return 0;
    }

}
