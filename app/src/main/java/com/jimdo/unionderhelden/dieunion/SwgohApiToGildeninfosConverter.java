package com.jimdo.unionderhelden.dieunion;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Alle on 05.01.2018.
 */

public class SwgohApiToGildeninfosConverter {

    public GildenInfos thisInfos;

    public SwgohApiToGildeninfosConverter() {
        thisInfos = new GildenInfos();
        thisInfos.lastSync = new Date();
        thisInfos.setGalaktischeMacht(0);
        thisInfos.setGalaktischeMachtDurschnitt(0);
        thisInfos.setGildenArenaRangDurschnitt(0.0);
        thisInfos.setGildenName("Not Available");
        thisInfos.setGildenRang(0);
        thisInfos.setGildenRaidPunkte(0);
        thisInfos.setGildenSammlungsScoreDurschnitt(0.0);
        thisInfos.setMemberListe(new ArrayList<MemberListe>());
    }

    public GildenInfos ConvertSwgohApiToGildeninfos(SwgohGildenAPI swgohGildenApi) {

        addCharsToInfos(swgohGildenApi.getAaylasecura(), "Aayla Secura", 17523);
        addCharsToInfos(swgohGildenApi.getAdmiralackbar(), "Admiral Ackbar", 17523);
        addCharsToInfos(swgohGildenApi.getAhsokatano(), "Ahsoka Tano", 17523);
        addCharsToInfos(swgohGildenApi.getFulcrumahsoka(), "Ahsoka Tano (Fulcrum)", 19929);
        addCharsToInfos(swgohGildenApi.getAsajventress(), "Asajj Ventress", 22909);
        addCharsToInfos(swgohGildenApi.getB2Superbattledroid(), "B2 Super Battle Droid", 16948);
        addCharsToInfos(swgohGildenApi.getBarrissoffee(), "Barriss Offee", 19929);
        addCharsToInfos(swgohGildenApi.getBazemalbus(), "Baze Malbus", 18097);
        addCharsToInfos(swgohGildenApi.getBb8(), "BB-8", 22909);
        addCharsToInfos(swgohGildenApi.getBiggsdarklighter(), "Biggs Darklighter", 16948);
        addCharsToInfos(swgohGildenApi.getBistan(), "Bistan", 17523);
        addCharsToInfos(swgohGildenApi.getBobafett(), "Boba Fett", 20713);
        addCharsToInfos(swgohGildenApi.getBodhirook(), "Bodhi Rook", 19929);
        addCharsToInfos(swgohGildenApi.getCadbane(), "Cad Bane", 17523);
        addCharsToInfos(swgohGildenApi.getHothhan(), "Captain Han Solo", 19929);
        addCharsToInfos(swgohGildenApi.getPhasma(), "Captain Phasma", 19929);
        addCharsToInfos(swgohGildenApi.getCassianandor(), "Cassian Andor", 19929);
        addCharsToInfos(swgohGildenApi.getCc2224(), "CC-2224 \"Cody\"", 19929);
        addCharsToInfos(swgohGildenApi.getChiefchirpa(), "Chief Chirpa", 19929);
        addCharsToInfos(swgohGildenApi.getChiefnebit(), "Chief Nebit", 17523);
        addCharsToInfos(swgohGildenApi.getChirrutimwe(), "Chirrut Îmwe", 18097);
        addCharsToInfos(swgohGildenApi.getChoppers3(), "Chopper", 17733);
        addCharsToInfos(swgohGildenApi.getClonesergeantphasei(), "Clone Sergeant - Phase I", 16948);
        addCharsToInfos(swgohGildenApi.getClonewarschewbacca(), "Clone Wars Chewbacca", 19929);
        addCharsToInfos(swgohGildenApi.getColonelstarck(), "Colonel Starck", 19929);
        addCharsToInfos(swgohGildenApi.getCommanderlukeskywalker(), "Commander Luke Skywalker", 25890);
        addCharsToInfos(swgohGildenApi.getCoruscantunderworldpolice(), "Coruscant Underworld Police", 16948);
        addCharsToInfos(swgohGildenApi.getCountdooku(), "Count Dooku", 19929);
        addCharsToInfos(swgohGildenApi.getCt210408(), "CT-21-0408 \"Echo\"", 17523);
        addCharsToInfos(swgohGildenApi.getCt5555(), "CT-5555 \"Fives\"", 19929);
        addCharsToInfos(swgohGildenApi.getCt7567(), "CT-7567 \"Rex\"", 17523);
        addCharsToInfos(swgohGildenApi.getMaul(), "Darth Maul", 19929);
        addCharsToInfos(swgohGildenApi.getDarthnihilus(), "Darth Nihilus", 22909);
        addCharsToInfos(swgohGildenApi.getDarthsidious(), "Darth Sidious", 19929);
        addCharsToInfos(swgohGildenApi.getVader(), "Darth Vader", 19929);
        addCharsToInfos(swgohGildenApi.getDathcha(), "Dathcha", 17523);
        addCharsToInfos(swgohGildenApi.getDeathtrooper(), "Death Trooper", 19929);
        addCharsToInfos(swgohGildenApi.getDengar(), "Dengar", 17523);
        addCharsToInfos(swgohGildenApi.getDirectorkrennic(), "Director Krennic", 20503);
        addCharsToInfos(swgohGildenApi.getEethkoth(), "Eeth Koth", 17523);
        addCharsToInfos(swgohGildenApi.getEmperorpalpatine(), "Emperor Palpatine", 18097);
        addCharsToInfos(swgohGildenApi.getEwokelder(), "Ewok Elder", 16948);
        addCharsToInfos(swgohGildenApi.getEwokscout(), "Ewok Scout", 16948);
        addCharsToInfos(swgohGildenApi.getEzrabridgers3(), "Ezra Bridger", 19929);
        addCharsToInfos(swgohGildenApi.getFinn(), "Finn", 19929);
        addCharsToInfos(swgohGildenApi.getFirstorderofficermale(), "First Order Officer", 16948);
        addCharsToInfos(swgohGildenApi.getFirstorderspecialforcespilot(), "First Order SF TIE Pilot", 16948);
        addCharsToInfos(swgohGildenApi.getFirstordertrooper(), "First Order Stormtrooper", 19144);
        addCharsToInfos(swgohGildenApi.getFirstordertiepilot(), "First Order TIE Pilot", 19144);
        addCharsToInfos(swgohGildenApi.getGamorreanguard(), "Gamorrean Guard", 16948);
        addCharsToInfos(swgohGildenApi.getGarsaxon(), "Gar Saxon", 19929);
        addCharsToInfos(swgohGildenApi.getZebs3(), "Garazeb \"Zeb\" Orrelios", 19929);
        addCharsToInfos(swgohGildenApi.getGrievous(), "General Grievous", 18097);
        addCharsToInfos(swgohGildenApi.getGeneralkenobi(), "General Kenobi", 18097);
        addCharsToInfos(swgohGildenApi.getVeers(), "General Veers", 19929);
        addCharsToInfos(swgohGildenApi.getGeonosiansoldier(), "Geonosian Soldier", 16948);
        addCharsToInfos(swgohGildenApi.getGeonosianspy(), "Geonosian Spy", 16948);
        addCharsToInfos(swgohGildenApi.getGrandadmiralthrawn(), "Grand Admiral Thrawn", 22909);
        addCharsToInfos(swgohGildenApi.getGrandmasteryoda(), "Grand Master Yoda", 22909);
        addCharsToInfos(swgohGildenApi.getGrandmofftarkin(), "Grand Moff Tarkin", 22909);
        addCharsToInfos(swgohGildenApi.getGreedo(), "Greedo", 17523);
        addCharsToInfos(swgohGildenApi.getHansolo(), "Han Solo", 19929);
        addCharsToInfos(swgohGildenApi.getHerasyndullas3(), "Hera Syndulla", 19929);
        addCharsToInfos(swgohGildenApi.getHermityoda(), "Hermit Yoda", 22909);
        addCharsToInfos(swgohGildenApi.getHk47(), "HK-47", 17523);
        addCharsToInfos(swgohGildenApi.getHothrebelscout(), "Hoth Rebel Scout", 16948);
        addCharsToInfos(swgohGildenApi.getHothrebelsoldier(), "Hoth Rebel Soldier", 16948);
        addCharsToInfos(swgohGildenApi.getMagnaguard(), "IG-100 MagnaGuard", 16948);
        addCharsToInfos(swgohGildenApi.getIg86Sentineldroid(), "IG-86 Sentinel Droid", 16948);
        addCharsToInfos(swgohGildenApi.getIg88(), "IG-88", 17523);
        addCharsToInfos(swgohGildenApi.getImagundi(), "Ima-Gun Di", 17523);
        addCharsToInfos(swgohGildenApi.getImperialprobedroid(), "Imperial Probe Droid", 19929);
        addCharsToInfos(swgohGildenApi.getImperialsupercommando(), "Imperial Super Commando", 16948);
        addCharsToInfos(swgohGildenApi.getJawa(), "Jawa", 16948);
        addCharsToInfos(swgohGildenApi.getJawaengineer(), "Jawa Engineer", 17523);
        addCharsToInfos(swgohGildenApi.getJawascavenger(), "Jawa Scavenger", 17523);
        addCharsToInfos(swgohGildenApi.getJediknightconsular(), "Jedi Consular", 16948);
        addCharsToInfos(swgohGildenApi.getAnakinknight(), "Jedi Knight Anakin", 17523);
        addCharsToInfos(swgohGildenApi.getJediknightguardian(), "Jedi Knight Guardian", 16948);
        addCharsToInfos(swgohGildenApi.getJynerso(), "Jyn Erso", 22909);
        addCharsToInfos(swgohGildenApi.getK2So(), "K-2SO", 19929);
        addCharsToInfos(swgohGildenApi.getKananjarruss3(), "Kanan Jarrus", 19929);
        addCharsToInfos(swgohGildenApi.getKitfisto(), "Kit Fisto", 17523);
        addCharsToInfos(swgohGildenApi.getKyloren(), "Kylo Ren", 19929);
        addCharsToInfos(swgohGildenApi.getKylorenunmasked(), "Kylo Ren (Unmasked)", 22909);
        addCharsToInfos(swgohGildenApi.getAdministratorlando(), "Lando Calrissian", 17313);
        addCharsToInfos(swgohGildenApi.getLobot(), "Lobot", 17523);
        addCharsToInfos(swgohGildenApi.getLogray(), "Logray", 19929);
        addCharsToInfos(swgohGildenApi.getLukeskywalker(), "Luke Skywalker (Farmboy)", 22125);
        addCharsToInfos(swgohGildenApi.getLuminaraunduli(), "Luminara Unduli", 19929);
        addCharsToInfos(swgohGildenApi.getMacewindu(), "Mace Windu", 17523);
        addCharsToInfos(swgohGildenApi.getMagmatrooper(), "Magmatrooper", 16948);
        addCharsToInfos(swgohGildenApi.getHumanthug(), "Mob Enforcer", 16948);
        addCharsToInfos(swgohGildenApi.getMothertalzin(), "Mother Talzin", 22909);
        addCharsToInfos(swgohGildenApi.getNightsisteracolyte(), "Nightsister Acolyte", 16948);
        addCharsToInfos(swgohGildenApi.getNightsisterinitiate(), "Nightsister Initiate", 19929);
        addCharsToInfos(swgohGildenApi.getNightsisterspirit(), "Nightsister Spirit", 16948);
        addCharsToInfos(swgohGildenApi.getNightsisterzombie(), "Nightsister Zombie", 16948);
        addCharsToInfos(swgohGildenApi.getNutegunray(), "Nute Gunray", 17523);
        addCharsToInfos(swgohGildenApi.getOldbenkenobi(), "Obi-Wan Kenobi (Old Ben)", 22909);
        addCharsToInfos(swgohGildenApi.getDaka(), "Old Daka", 19929);
        addCharsToInfos(swgohGildenApi.getPao(), "Pao", 19929);
        addCharsToInfos(swgohGildenApi.getPaploo(), "Paploo", 19929);
        addCharsToInfos(swgohGildenApi.getPlokoon(), "Plo Koon", 17523);
        addCharsToInfos(swgohGildenApi.getPoe(), "Poe Dameron", 17523);
        addCharsToInfos(swgohGildenApi.getPogglethelesser(), "Poggle the Lesser", 17523);
        addCharsToInfos(swgohGildenApi.getPrincessleia(), "Princess Leia", 19929);
        addCharsToInfos(swgohGildenApi.getQuigonjinn(), "Qui-Gon Jinn", 19929);
        addCharsToInfos(swgohGildenApi.getR2D2Legendary(), "R2-D2", 22909);
        addCharsToInfos(swgohGildenApi.getHothleia(), "Rebel Officer Leia Organa", 19929);
        addCharsToInfos(swgohGildenApi.getResistancepilot(), "Resistance Pilot", 16738);
        addCharsToInfos(swgohGildenApi.getResistancetrooper(), "Resistance Trooper", 16738);
        addCharsToInfos(swgohGildenApi.getReyjeditraining(), "Rey (Jedi Training)", 25890);
        addCharsToInfos(swgohGildenApi.getRey(), "Rey (Scavenger)", 19929);
        addCharsToInfos(swgohGildenApi.getRoyalguard(), "Royal Guard", 16948);
        addCharsToInfos(swgohGildenApi.getSabinewrens3(), "Sabine Wren", 19929);
        addCharsToInfos(swgohGildenApi.getSavageopress(), "Savage Opress", 19929);
        addCharsToInfos(swgohGildenApi.getScarifrebel(), "Scarif Rebel Pathfinder", 16948);
        addCharsToInfos(swgohGildenApi.getShoretrooper(), "Shoretrooper", 16948);
        addCharsToInfos(swgohGildenApi.getSithassassin(), "Sith Assassin", 16948);
        addCharsToInfos(swgohGildenApi.getSithtrooper(), "Sith Trooper", 16948);
        addCharsToInfos(swgohGildenApi.getSnowtrooper(), "Snowtrooper", 16948);
        addCharsToInfos(swgohGildenApi.getStormtrooper(), "Stormtrooper", 19144);
        addCharsToInfos(swgohGildenApi.getStormtrooperhan(), "Stormtrooper Han", 19719);
        addCharsToInfos(swgohGildenApi.getSunfac(), "Sun Fac", 17523);
        addCharsToInfos(swgohGildenApi.getTalia(), "Talia", 17523);
        addCharsToInfos(swgohGildenApi.getTeebo(), "Teebo", 17733);
        addCharsToInfos(swgohGildenApi.getTiefighterpilot(), "TIE Fighter Pilot", 16948);
        addCharsToInfos(swgohGildenApi.getTuskenraider(), "Tusken Raider", 16948);
        addCharsToInfos(swgohGildenApi.getTuskenshaman(), "Tusken Shaman", 16948);
        addCharsToInfos(swgohGildenApi.getUgnaught(), "Ugnaught", 16738);
        addCharsToInfos(swgohGildenApi.getUrorrurrr(), "URoRRuR'R'R", 17523);
        addCharsToInfos(swgohGildenApi.getSmugglerchewbacca(), "Veteran Smuggler Chewbacca", 19929);
        addCharsToInfos(swgohGildenApi.getSmugglerhan(), "Veteran Smuggler Han Solo", 19929);
        addCharsToInfos(swgohGildenApi.getWampa(), "Wampa", 22909);
        addCharsToInfos(swgohGildenApi.getWedgeantilles(), "Wedge Antilles", 17523);
        addCharsToInfos(swgohGildenApi.getWicket(), "Wicket", 19929);
        addCharsToInfos(swgohGildenApi.getZamwesell(), "Zam Wesell", 17523);
        addCharsToInfos(swgohGildenApi.getfirstorderexecutioner(), "First Order Executioner", 16948);

        //All ships to MemberListe
        addShipToInfos(swgohGildenApi.getJedistarfighterahsokatano(), "Ahsoka Tano's Jedi Starfighter", 42771);
        addShipToInfos(swgohGildenApi.getXwingred3(), "Biggs Darklighter's X-wing", 41478);
        addShipToInfos(swgohGildenApi.getUwingscarif(), "Bistan's U-wing", 50278);
        addShipToInfos(swgohGildenApi.getUwingrogueone(), "Cassian's U-wing", 60630);
        addShipToInfos(swgohGildenApi.getCapitalchimaera(), "Chimaera", 55320);
        addShipToInfos(swgohGildenApi.getSwgohShip(), "Clone Sergeant's ARC-170", 41478);
        addShipToInfos(swgohGildenApi.getCapitaljedicruiser(), "Endurance", 43202);
        addShipToInfos(swgohGildenApi.getCapitalstardestroyer(), "Executrix", 55320);
        addShipToInfos(swgohGildenApi.getTiefighterfosf(), "First Order SF TIE Fighter", 41478);
        addShipToInfos(swgohGildenApi.getTiefighterfirstorder(), "First Order TIE Fighter", 46419);
        addShipToInfos(swgohGildenApi.getGauntletstarfighter(), "Gauntlet Starfighter", 53526);
        addShipToInfos(swgohGildenApi.getGeonosianstarfighter3(), "Geonosian Soldier's Starfighter", 41478);
        addShipToInfos(swgohGildenApi.getGeonosianstarfighter2(), "Geonosian Spy's Starfighter", 41478);
        addShipToInfos(swgohGildenApi.getGhost(), "Ghost", 57948);
        addShipToInfos(swgohGildenApi.getCapitalmoncalamaricruiser(), "Home One", 43202);
        addShipToInfos(swgohGildenApi.getTiefighterimperial(), "Imperial TIE Fighter", 41478);
        addShipToInfos(swgohGildenApi.getJedistarfighterconsular(), "Jedi Consular's Starfighter", 41478);
        addShipToInfos(swgohGildenApi.getCommandshuttle(), "Kylo Ren's Command Shuttle", 57241);
        addShipToInfos(swgohGildenApi.getMillenniumfalconep7(), "Millennium Falcon (Ep VII)", 57550);
        addShipToInfos(swgohGildenApi.getPhantom2(), "Phantom II", 55971);
        addShipToInfos(swgohGildenApi.getBladeofdorin(), "Plo Koon's Jedi Starfighter", 42771);
        addShipToInfos(swgohGildenApi.getXwingblackone(), "Poe Dameron's X-wing", 42771);
        addShipToInfos(swgohGildenApi.getXwingresistance(), "Resistance X-wing", 41005);
        addShipToInfos(swgohGildenApi.getArc170Rex(), "Rex's ARC-170", 42771);
        addShipToInfos(swgohGildenApi.getSithinfiltrator(), "Scimitar", 48185);
        addShipToInfos(swgohGildenApi.getSlave1(), "Slave I", 49949);
        addShipToInfos(swgohGildenApi.getGeonosianstarfighter1(), "Sun Fac's Geonosian Starfighter", 42771);
        addShipToInfos(swgohGildenApi.getTieadvanced(), "TIE Advanced x1", 48185);
        addShipToInfos(swgohGildenApi.getTiereaper(), "TIE Reaper", 53526);
        addShipToInfos(swgohGildenApi.getTiesilencer(), "TIE Silencer", 54890);
        addShipToInfos(swgohGildenApi.getUmbaranstarfighter(), "Umbaran Starfighter", 48185);
        addShipToInfos(swgohGildenApi.getXwingred2(), "Wedge Antilles's X-wing", 42771);

        return thisInfos;
    }

    private void addCharsToInfos(SwgohCharakter[] nowchars, String charName, int maxpower) {

        if(nowchars == null)
            return;

            for (SwgohCharakter item : nowchars) {
                Charakter charac = new Charakter();
                charac.setName(charName);
                charac.power = (int) item.getPower();
                double tempPower = (double)charac.power/(double)maxpower;
                double powerTemp = (tempPower*100);
                charac.setPerfekt((int)powerTemp);
                charac.besitzer = item.getPlayer();
                charac.setGear((int) item.getGearLevel());
                charac.setLevel((int) item.getLevel());
                charac.charUrl = "https://swgoh.gg" + item.getUrl() + charName.replace("(", "").replace(")", "").replace(" ", "-").replace("\"","");
                charac.setSterne((int) item.getRarity());
                characToPlayer(charac);
            }
    }

    private void characToPlayer(Charakter charac){

        for(MemberListe member : thisInfos.getMemberListe()){
            if(member.getMemberName().equals(charac.besitzer)){
                member.getCharakter().add(charac);
                return;
            }
        }

        MemberListe newMember = new MemberListe();
        newMember.setMemberName(charac.besitzer);
        ArrayList<Charakter> characList = new ArrayList<Charakter>();
        newMember.setFlotte(new ArrayList<Ship>());
        characList.add(charac);
        newMember.setCharakter(characList);

        thisInfos.getMemberListe().add(newMember);

    }

    private void addShipToInfos(SwgohShip[] nowship, String shipName, int maxpower) {

        if(nowship == null)
            return;

        for (SwgohShip item : nowship) {
            Ship ship = new Ship();
            ship.setName(shipName);
            ship.power = (int) item.getPower();
            double tempPower = (double)ship.power/(double)maxpower;
            double powerTemp = (tempPower*100);
            ship.setPerfekt((int)powerTemp);
            ship.besitzer = item.getPlayer();
            ship.setLevel((int) item.getLevel());
            ship.setSterne((int) item.getRarity());
            shipToPlayer(ship);
        }
    }

    private void shipToPlayer(Ship ship){

        for(MemberListe member : thisInfos.getMemberListe()){
            if(member.getMemberName().equals(ship.besitzer)){
                member.getFlotte().add(ship);
                return;
            }
        }

        MemberListe newMember = new MemberListe();
        newMember.setMemberName(ship.besitzer);
        ArrayList<Ship> shipList = new ArrayList<Ship>();
        shipList.add(ship);
        newMember.setFlotte(shipList);
        newMember.setCharakter(new ArrayList<Charakter>());

        thisInfos.getMemberListe().add(newMember);

    }

}
