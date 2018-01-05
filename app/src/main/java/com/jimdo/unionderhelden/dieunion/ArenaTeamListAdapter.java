package com.jimdo.unionderhelden.dieunion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Alle on 15.11.2017.
 */

public class ArenaTeamListAdapter extends BaseAdapter {

    Context context;
    ArrayList<ArenaTeamListe> data;
    private static LayoutInflater inflater = null;

    public ArenaTeamListAdapter(Context context, ArrayList<ArenaTeamListe> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        Collections.sort(data, new teamArenaComparator());
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.char_team_list_view, null);

        ArenaTeamListe nowTeam = data.get(position);

        //Besitzer
        TextView txtBesitzer = (TextView) vi.findViewById(R.id.teamBesitzer);
        txtBesitzer.setText(nowTeam.Besitzer);

        //ArenaRang
        TextView txtArenaRang = (TextView) vi.findViewById(R.id.teamArenaRang);
        txtArenaRang.setText("Arenarang: " + nowTeam.ArenaRang);

        View nowChar = null;

        View char1View = (View) vi.findViewById(R.id.char1);
        View char2View = (View) vi.findViewById(R.id.char2);
        View char3View = (View) vi.findViewById(R.id.char3);
        View char4View = (View) vi.findViewById(R.id.char4);
        View char5View = (View) vi.findViewById(R.id.char5);

        for(int a = 0; a < 5 ; a++){

            switch(a) {
                case 0:
                    nowChar = char1View;
                    break;
                case 1:
                    nowChar = char2View;
                    break;
                case 2:
                    nowChar = char3View;
                    break;
                case 3:
                    nowChar = char4View;
                    break;
                case 4:
                    nowChar = char5View;
                    break;
                default:
                    break;
            }

            TextView txtGear = (TextView) nowChar.findViewById(R.id.gear);
            TextView txtperfektheit = (TextView) nowChar.findViewById(R.id.perfektheit1);
            ImageView charImage = (ImageView) nowChar.findViewById(R.id.charImage1);
            ImageView gearImage = (ImageView) nowChar.findViewById(R.id.gearImage1);

            ArrayList<ImageView> imageStarList = new ArrayList<ImageView>();
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar11));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar21));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar31));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar41));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar51));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar61));
            imageStarList.add((ImageView) nowChar.findViewById(R.id.nostar71));

            if(a >= nowTeam.charakterListe.size()){
                txtGear.setText("0");
                txtperfektheit.setText("0");
                for(int i = 0; i < imageStarList.size() ; i++) {
                  imageStarList.get(i).setImageResource(R.drawable.nostar);
                }
                charImage.setImageResource(R.drawable.wallpaper);
            }else {

                txtGear.setText(data.get(position).charakterListe.get(a).getGear().toString());
                txtperfektheit.setText(data.get(position).charakterListe.get(a).getPerfekt().toString());

                switch (data.get(position).charakterListe.get(a).getGear()) {
                    case 0:
                        break;
                    case 1:
                        gearImage.setImageResource(R.drawable.gearicong1);
                        break;
                    case 2:
                        gearImage.setImageResource(R.drawable.gearicong2);
                        break;
                    case 3:
                        gearImage.setImageResource(R.drawable.gearicong3);
                        break;
                    case 4:
                        gearImage.setImageResource(R.drawable.gearicong4);
                        break;
                    case 5:
                        gearImage.setImageResource(R.drawable.gearicong5);
                        break;
                    case 6:
                        gearImage.setImageResource(R.drawable.gearicong6);
                        break;
                    case 7:
                        gearImage.setImageResource(R.drawable.gearicong7);
                        break;
                    case 8:
                        gearImage.setImageResource(R.drawable.gearicong8);
                        break;
                    case 9:
                        gearImage.setImageResource(R.drawable.gearicong9);
                        break;
                    case 10:
                        gearImage.setImageResource(R.drawable.gearicong10);
                        break;
                    case 11:
                        gearImage.setImageResource(R.drawable.gearicong11);
                        break;
                    case 12:
                        gearImage.setImageResource(R.drawable.gearicong12);
                        break;
                    default:
                        break;
                }

                switch (data.get(position).charakterListe.get(a).getName().replace("&quot;", "\"")) {
                    case "Ahsoka Tano":
                        charImage.setImageResource(R.drawable.charui_ahsoka);
                        break;
                    case "Aayla Secura":
                        charImage.setImageResource(R.drawable.charui_aaylasecura);
                        break;
                    case "Admiral Ackbar":
                        charImage.setImageResource(R.drawable.charui_ackbaradmiral);
                        break;
                    case "Ahsoka Tano (Fulcrum)":
                        charImage.setImageResource(R.drawable.charui_ahsokaadult);
                        break;
                    case "Asajj Ventress":
                        charImage.setImageResource(R.drawable.charui_ventress);
                        break;
                    case "B2 Super Battle Droid":
                        charImage.setImageResource(R.drawable.charui_b2);
                        break;
                    case "Barriss Offee":
                        charImage.setImageResource(R.drawable.charui_barriss_light);
                        break;
                    case "Baze Malbus":
                        charImage.setImageResource(R.drawable.charui_bazemalbus);
                        break;
                    case "BB-8":
                        charImage.setImageResource(R.drawable.charui_bb8);
                        break;
                    case "Biggs Darklighter":
                        charImage.setImageResource(R.drawable.charui_rebelpilot_biggs);
                        break;
                    case "Bistan":
                        charImage.setImageResource(R.drawable.charui_bistan);
                        break;
                    case "Boba Fett":
                        charImage.setImageResource(R.drawable.charui_bobafett);
                        break;
                    case "Bodhi Rook":
                        charImage.setImageResource(R.drawable.charui_bodhi);
                        break;
                    case "Cad Bane":
                        charImage.setImageResource(R.drawable.charui_cadbane);
                        break;
                    case "Captain Han Solo":
                        charImage.setImageResource(R.drawable.charui_hoth_han);
                        break;
                    case "Captain Phasma":
                        charImage.setImageResource(R.drawable.charui_phasma);
                        break;
                    case "Cassian Andor":
                        charImage.setImageResource(R.drawable.charui_cassian);
                        break;
                    case "CC-2224 \"Cody\"":
                        charImage.setImageResource(R.drawable.charui_trooperclone_cody);
                        break;
                    case "Chief Chirpa":
                        charImage.setImageResource(R.drawable.charui_ewok_chirpa);
                        break;
                    case "Chief Nebit":
                        charImage.setImageResource(R.drawable.charui_ewok_chief);
                        break;
                    case "Chirrut Îmwe":
                        charImage.setImageResource(R.drawable.charui_chirrut);
                        break;
                    case "Chopper":
                        charImage.setImageResource(R.drawable.charui_chopper);
                        break;
                    case "Clone Sergeant - Phase I":
                        charImage.setImageResource(R.drawable.charui_trooperclonegreen);
                        break;
                    case "Clone Wars Chewbacca":
                        charImage.setImageResource(R.drawable.charui_chewbacca);
                        break;
                    case "Colonel Starck":
                        charImage.setImageResource(R.drawable.charui_colonel_stark);
                        break;
                    case "Commander Luke Skywalker":
                        charImage.setImageResource(R.drawable.charui_lukebespin);
                        break;
                    case "Coruscant Underworld Police":
                        charImage.setImageResource(R.drawable.charui_coruscantpolice);
                        break;
                    case "Count Dooku":
                        charImage.setImageResource(R.drawable.charui_dooku);
                        break;
                    case "CT-21-0408 \"Echo\"":
                        charImage.setImageResource(R.drawable.charui_trooperclone_echo);
                        break;
                    case "CT-5555 \"Fives\"":
                        charImage.setImageResource(R.drawable.charui_trooperclone_fives);
                        break;
                    case "CT-7567 \"Rex\"":
                        charImage.setImageResource(R.drawable.charui_trooperclone_rex);
                        break;
                    case "Darth Maul":
                        charImage.setImageResource(R.drawable.charui_maul);
                        break;
                    case "Darth Nihilus":
                        charImage.setImageResource(R.drawable.charui_nihilus);
                        break;
                    case "Darth Sidious":
                        charImage.setImageResource(R.drawable.charui_sidious);
                        break;
                    case "Darth Vader":
                        charImage.setImageResource(R.drawable.charui_vader);
                        break;
                    case "Dathcha":
                        charImage.setImageResource(R.drawable.charui_jawa_dathcha);
                        break;
                    case "Death Trooper":
                        charImage.setImageResource(R.drawable.charui_trooperdeath);
                        break;
                    case "Dengar":
                        charImage.setImageResource(R.drawable.charui_dengar);
                        break;
                    case "Director Krennic":
                        charImage.setImageResource(R.drawable.charui_krennic);
                        break;
                    case "Eeth Koth":
                        charImage.setImageResource(R.drawable.charui_eethkoth);
                        break;
                    case "Emperor Palpatine":
                        charImage.setImageResource(R.drawable.charui_palpatineemperor);
                        break;
                    case "Ewok Elder":
                        charImage.setImageResource(R.drawable.charui_ewok_chief);
                        break;
                    case "Ewok Scout":
                        charImage.setImageResource(R.drawable.charui_ewok_scout);
                        break;
                    case "Ezra Bridger":
                        charImage.setImageResource(R.drawable.charui_ezra_s3);
                        break;
                    case "Finn":
                        charImage.setImageResource(R.drawable.charui_finnjakku);
                        break;
                    case "First Order Officer":
                        charImage.setImageResource(R.drawable.charui_firstorderofficer);
                        break;
                    case "First Order SF TIE Pilot":
                        charImage.setImageResource(R.drawable.charui_firstorder_pilot);
                        break;
                    case "First Order Stormtrooper":
                        charImage.setImageResource(R.drawable.charui_firstordertrooper);
                        break;
                    case "First Order TIE Pilot":
                        charImage.setImageResource(R.drawable.charui_firstordertiepilot);
                        break;
                    case "Gamorrean Guard":
                        charImage.setImageResource(R.drawable.charui_gamorreanguard);
                        break;
                    case "Gar Saxon":
                        charImage.setImageResource(R.drawable.charui_gar_saxon);
                        break;
                    case "Garazeb \"Zeb\" Orrelios":
                        charImage.setImageResource(R.drawable.charui_zeb_s3);
                        break;
                    case "General Grievous":
                        charImage.setImageResource(R.drawable.charui_grievous);
                        break;
                    case "General Kenobi":
                        charImage.setImageResource(R.drawable.charui_obiwangeneral);
                        break;
                    case "General Veers":
                        charImage.setImageResource(R.drawable.charui_veers);
                        break;
                    case "Geonosian Soldier":
                        charImage.setImageResource(R.drawable.charui_geonosian_soldier);
                        break;
                    case "Geonosian Spy":
                        charImage.setImageResource(R.drawable.charui_geonosian_spy);
                        break;
                    case "Grand Admiral Thrawn":
                        charImage.setImageResource(R.drawable.charui_thrawn);
                        break;
                    case "Grand Master Yoda":
                        charImage.setImageResource(R.drawable.charui_yodagrandmaster);
                        break;
                    case "Grand Moff Tarkin":
                        charImage.setImageResource(R.drawable.charui_tarkinadmiral);
                        break;
                    case "Greedo":
                        charImage.setImageResource(R.drawable.charui_greedo);
                        break;
                    case "Han Solo":
                        charImage.setImageResource(R.drawable.charui_han);
                        break;
                    case "Hera Syndulla":
                        charImage.setImageResource(R.drawable.charui_hera_s3);
                        break;
                    case "Hermit Yoda":
                        charImage.setImageResource(R.drawable.charui_yodahermit);
                        break;
                    case "HK-47":
                        charImage.setImageResource(R.drawable.charui_hk47);
                        break;
                    case "Hoth Rebel Scout":
                        charImage.setImageResource(R.drawable.charui_rebelhothscout);
                        break;
                    case "Hoth Rebel Soldier":
                        charImage.setImageResource(R.drawable.charui_rebelhoth);
                        break;
                    case "IG-100 MagnaGuard":
                        charImage.setImageResource(R.drawable.charui_magnaguard);
                        break;
                    case "IG-86 Sentinel Droid":
                        charImage.setImageResource(R.drawable.charui_ig86);
                        break;
                    case "IG-88":
                        charImage.setImageResource(R.drawable.charui_ig88);
                        break;
                    case "Ima-Gun Di":
                        charImage.setImageResource(R.drawable.charui_imagundi);
                        break;
                    case "Imperial Probe Droid":
                        charImage.setImageResource(R.drawable.charui_probedroid);
                        break;
                    case "Imperial Super Commando":
                        charImage.setImageResource(R.drawable.charui_imperial_super_commando);
                        break;
                    case "Jawa":
                        charImage.setImageResource(R.drawable.charui_jawa_jawa);
                        break;
                    case "Jawa Engineer":
                        charImage.setImageResource(R.drawable.charui_jawa_engineer);
                        break;
                    case "Jawa Scavenger":
                        charImage.setImageResource(R.drawable.charui_jawa_scavenger);
                        break;
                    case "Jedi Consular":
                        charImage.setImageResource(R.drawable.charui_jedi_consular_03);
                        break;
                    case "Jedi Knight Anakin":
                        charImage.setImageResource(R.drawable.charui_anakinknight);
                        break;
                    case "Jedi Knight Guardian":
                        charImage.setImageResource(R.drawable.charui_jedi_guardian_01);
                        break;
                    case "Jyn Erso":
                        charImage.setImageResource(R.drawable.charui_jyn);
                        break;
                    case "K-2SO":
                        charImage.setImageResource(R.drawable.charui_k2so);
                        break;
                    case "Kanan Jarrus":
                        charImage.setImageResource(R.drawable.charui_kanan_s3);
                        break;
                    case "Kit Fisto":
                        charImage.setImageResource(R.drawable.charui_kitfisto);
                        break;
                    case "Kylo Ren":
                        charImage.setImageResource(R.drawable.charui_kyloren);
                        break;
                    case "Kylo Ren (Unmasked)":
                        charImage.setImageResource(R.drawable.charui_kylo_unmasked);
                        break;
                    case "Lando Calrissian":
                        charImage.setImageResource(R.drawable.charui_landobespin);
                        break;
                    case "Lobot":
                        charImage.setImageResource(R.drawable.charui_lobot);
                        break;
                    case "Logray":
                        charImage.setImageResource(R.drawable.charui_ewok_logray);
                        break;
                    case "Luke Skywalker (Farmboy)":
                        charImage.setImageResource(R.drawable.charui_luke_ep4);
                        break;
                    case "Luminara Unduli":
                        charImage.setImageResource(R.drawable.charui_luminara);
                        break;
                    case "Mace Windu":
                        charImage.setImageResource(R.drawable.charui_macewindu);
                        break;
                    case "Magmatrooper":
                        charImage.setImageResource(R.drawable.charui_trooperstorm_magma);
                        break;
                    case "Mob Enforcer":
                        charImage.setImageResource(R.drawable.charui_thug_female_01);
                        break;
                    case "Mother Talzin":
                        charImage.setImageResource(R.drawable.charui_nightsisters_talzin);
                        break;
                    case "Nightsister Acolyte":
                        charImage.setImageResource(R.drawable.charui_nightsister_acolyte);
                        break;
                    case "Nightsister Initiate":
                        charImage.setImageResource(R.drawable.charui_nightsister_initiate);
                        break;
                    case "Nightsister Spirit":
                        charImage.setImageResource(R.drawable.charui_nightsisters_wraith);
                        break;
                    case "Nightsister Zombie":
                        charImage.setImageResource(R.drawable.charui_nightsisters_zombie);
                        break;
                    case "Nute Gunray":
                        charImage.setImageResource(R.drawable.charui_nutegunray);
                        break;
                    case "Obi-Wan Kenobi (Old Ben)":
                        charImage.setImageResource(R.drawable.charui_obiwanep4);
                        break;
                    case "Old Daka":
                        charImage.setImageResource(R.drawable.charui_daka);
                        break;
                    case "Pao":
                        charImage.setImageResource(R.drawable.charui_pao);
                        break;
                    case "Paploo":
                        charImage.setImageResource(R.drawable.charui_ewok_paploo);
                        break;
                    case "Plo Koon":
                        charImage.setImageResource(R.drawable.charui_plokoon);
                        break;
                    case "Poe Dameron":
                        charImage.setImageResource(R.drawable.charui_poe);
                        break;
                    case "Poggle the Lesser":
                        charImage.setImageResource(R.drawable.charui_geonosian_poggle);
                        break;
                    case "Princess Leia":
                        charImage.setImageResource(R.drawable.charui_leia_princess);
                        break;
                    case "Qui-Gon Jinn":
                        charImage.setImageResource(R.drawable.charui_quigon);
                        break;
                    case "R2-D2":
                        charImage.setImageResource(R.drawable.charui_astromech_r2d2);
                        break;
                    case "Rebel Officer Leia Organa":
                        charImage.setImageResource(R.drawable.charui_leiahoth);
                        break;
                    case "Resistance Pilot":
                        charImage.setImageResource(R.drawable.charui_resistancepilot);
                        break;
                    case "Resistance Trooper":
                        charImage.setImageResource(R.drawable.charui_resistancetrooper);
                        break;
                    case "Rey (Scavenger)":
                        charImage.setImageResource(R.drawable.charui_reyjakku);
                        break;
                    case "Rey (Jedi Training)":
                        charImage.setImageResource(R.drawable.charui_rey_tlj);
                        break;
                    case "Royal Guard":
                        charImage.setImageResource(R.drawable.charui_royalguard);
                        break;
                    case "Sabine Wren":
                        charImage.setImageResource(R.drawable.charui_sabine_s3);
                        break;
                    case "Savage Opress":
                        charImage.setImageResource(R.drawable.charui_savageopress);
                        break;
                    case "Scarif Rebel Pathfinder":
                        charImage.setImageResource(R.drawable.charui_rebel_scarif);
                        break;
                    case "Shoretrooper":
                        charImage.setImageResource(R.drawable.charui_troopershore);
                        break;
                    case "Sith Assassin":
                        charImage.setImageResource(R.drawable.charui_sithassassin);
                        break;
                    case "Sith Trooper":
                        charImage.setImageResource(R.drawable.charui_sithtrooper);
                        break;
                    case "Snowtrooper":
                        charImage.setImageResource(R.drawable.charui_troopersnow);
                        break;
                    case "Stormtrooper":
                        charImage.setImageResource(R.drawable.charui_trooperstorm);
                        break;
                    case "Stormtrooper Han":
                        charImage.setImageResource(R.drawable.charui_trooperstorm_han);
                        break;
                    case "Sun Fac":
                        charImage.setImageResource(R.drawable.charui_geonosian_sunfac);
                        break;
                    case "Talia":
                        charImage.setImageResource(R.drawable.charui_nightsister_talia);
                        break;
                    case "Teebo":
                        charImage.setImageResource(R.drawable.charui_ewok_teebo);
                        break;
                    case "TIE Fighter Pilot":
                        charImage.setImageResource(R.drawable.charui_tiepilot);
                        break;
                    case "Tusken Raider":
                        charImage.setImageResource(R.drawable.charui_tuskenraider);
                        break;
                    case "Tusken Shaman":
                        charImage.setImageResource(R.drawable.charui_tuskenshaman);
                        break;
                    case "Ugnaught":
                        charImage.setImageResource(R.drawable.charui_ugnaught);
                        break;
                    case "URoRRuR'R'R":
                        charImage.setImageResource(R.drawable.charui_urorrurrr);
                        break;
                    case "Veteran Smuggler Chewbacca":
                        charImage.setImageResource(R.drawable.charui_tfa_chewbacca);
                        break;
                    case "Veteran Smuggler Han Solo":
                        charImage.setImageResource(R.drawable.charui_tfa_han);
                        break;
                    case "Wampa":
                        charImage.setImageResource(R.drawable.charui_wampa);
                        break;
                    case "Wedge Antilles":
                        charImage.setImageResource(R.drawable.charui_rebelpilot_wedge);
                        break;
                    case "Wicket":
                        charImage.setImageResource(R.drawable.charui_ewok_wicket);
                        break;
                    case "Zam Wesell":
                        charImage.setImageResource(R.drawable.charui_zamwesell);
                        break;
                    default:
                        break;
                }

                int stars = data.get(position).charakterListe.get(a).getSterne();

                for (int i = 0; i < imageStarList.size(); i++) {
                    if (i < stars) {
                        imageStarList.get(i).setImageResource(R.drawable.star);
                    } else {
                        imageStarList.get(i).setImageResource(R.drawable.nostar);
                    }
                }
            }

        }

        return vi;
    }

}
