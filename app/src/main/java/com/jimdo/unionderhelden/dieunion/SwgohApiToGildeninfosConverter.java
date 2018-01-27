package com.jimdo.unionderhelden.dieunion;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        addCharsToInfos(swgohGildenApi.getAaylasecura(), "Aayla Secura", 17523, new String[]{"Cantina 5-B (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getAdmiralackbar(), "Admiral Ackbar", 17523, new String[]{"Fleet Store (400 credits)" , "Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getAhsokatano(), "Ahsoka Tano", 17523, new String[]{"Dark Hard 4-C (12 energy)", "Fleet Store (400 credits)", "Light Hard 5-D (16 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getFulcrumahsoka(), "Ahsoka Tano (Fulcrum)", 19929, new String[]{"Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getAsajventress(), "Asajj Ventress", 22909, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getB2Superbattledroid(), "B2 Super Battle Droid", 16948, new String[]{"Cantina 6-D (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBarrissoffee(), "Barriss Offee", 19929, new String[]{"Cantina 6-A (12 energy)", "Dark Hard 5-C (16 energy)", "Dark Hard 5-E (16 energy)", "Dark Hard 8-A (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBazemalbus(), "Baze Malbus", 18097, new String[]{"Light Hard 9-C (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBb8(), "BB-8", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBiggsdarklighter(), "Biggs Darklighter", 16948, new String[]{"Cantina 3-G (10 energy)", "Dark Hard 4-A (12 energy)", "Fleet Store (400 credits)", "Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBistan(), "Bistan", 17523, new String[]{"Fleet Store (400 credits)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBobafett(), "Boba Fett", 20713, new String[]{"Dark Hard 2-B (12 energy)", "Dark Hard 4-E (12 energy)", "Fleet Store (400 credits)", "Light Hard 8-A (20 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getBodhirook(), "Bodhi Rook", 19929, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCadbane(), "Cad Bane", 17523, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHothhan(), "Captain Han Solo", 19929, new String[]{"Cantina 7-D (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPhasma(), "Captain Phasma", 19929, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCassianandor(), "Cassian Andor", 19929, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCc2224(), "CC-2224 \"Cody\"", 19929, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getChiefchirpa(), "Chief Chirpa", 19929, new String[]{"Cantina 5-D (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getChiefnebit(), "Chief Nebit", 17523, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getChirrutimwe(), "Chirrut Îmwe", 18097, new String[]{"Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getChoppers3(), "Chopper", 17733, new String[]{"Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getClonesergeantphasei(), "Clone Sergeant - Phase I", 16948, new String[]{"Dark Hard 1-B (12 energy)", "Dark Hard 3-E (12 energy)", "Light Hard 5-E (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getClonewarschewbacca(), "Clone Wars Chewbacca", 19929, new String[]{"Cantina 1-C (8 energy)", "Cantina 5-G (12 energy)", "Dark Hard 2-C (12 energy)", "Light Hard 3-E (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getColonelstarck(), "Colonel Starck", 19929, new String[]{"Guild Shipments (450 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCommanderlukeskywalker(), "Commander Luke Skywalker", 25890, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCoruscantunderworldpolice(), "Coruscant Underworld Police", 16948, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCountdooku(), "Count Dooku", 19929, new String[]{"Cantina 6-G (12 energy)", "Dark Hard 1-C (12 energy)", "Light Hard 1-C (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCt210408(), "CT-21-0408 \"Echo\"", 17523, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCt5555(), "CT-5555 \"Fives\"", 19929, new String[]{"Dark Hard 2-D (12 energy)", "Light Hard 4-F (12 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getCt7567(), "CT-7567 \"Rex\"", 17523, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getMaul(), "Darth Maul", 19929, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDarthnihilus(), "Darth Nihilus", 22909, new String[]{"Dark Hard 9-A (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDarthsidious(), "Darth Sidious", 19929, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getVader(), "Darth Vader", 19929, new String[]{"Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDathcha(), "Dathcha", 17523, new String[]{"Cantina 2-G (8 energy)", "Galactic War Shipments (400 credits)", "Light Hard 3-B (12 energy)", "Light Hard 3-F (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDeathtrooper(), "Death Trooper", 19929, new String[]{"Cantina 8-A (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDengar(), "Dengar", 17523, new String[]{"Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDirectorkrennic(), "Director Krennic", 20503, new String[]{"Light Hard 9-D (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getEethkoth(), "Eeth Koth", 17523, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getEmperorpalpatine(), "Emperor Palpatine", 18097, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getEwokelder(), "Ewok Elder", 16948, new String[]{"Dark Hard 8-C (20 energy)", "Guild Shipments (400 credits)", "Light Hard 2-C (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getEwokscout(), "Ewok Scout", 16948, new String[]{"Dark Hard 8-D (20 energy)", "Dark Hard 9-B (20 energy)", "Light Hard 1-A (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getEzrabridgers3(), "Ezra Bridger", 19929, new String[]{"Cantina 2-B (8 energy)", "Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getFinn(), "Finn", 19929, new String[]{"Cantina 3-E (10 energy)", "Cantina 5-C (12 energy)", "Light Hard 7-A (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getFirstorderofficermale(), "First Order Officer", 16948, new String[]{"Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getFirstorderspecialforcespilot(), "First Order SF TIE Pilot", 16948, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getFirstordertrooper(), "First Order Stormtrooper", 19144, new String[]{"Dark Hard 2-A (12 energy)", "Light Hard 2-B (12 energy)", "Light Hard 9-A (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getFirstordertiepilot(), "First Order TIE Pilot", 19144, new String[]{"Dark Hard 6-B (16 energy)", "Light Hard 6-D (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGamorreanguard(), "Gamorrean Guard", 16948, new String[]{"Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGarsaxon(), "Gar Saxon", 19929, new String[]{"Cantina 8-E (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getZebs3(), "Garazeb \"Zeb\" Orrelios", 19929, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGrievous(), "General Grievous", 18097, new String[]{"Fleet Store (400 credits)", "Shard Shop (1000 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGeneralkenobi(), "General Kenobi", 18097, new String[]{"HAAT"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getVeers(), "General Veers", 19929, new String[]{"Dark Hard 6-D (16 energy)", "Light Hard 4-C (12 energy)", "Light Hard 6-C (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGeonosiansoldier(), "Geonosian Soldier", 16948, new String[]{"Cantina 1-A (8 energy)", "Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGeonosianspy(), "Geonosian Spy", 16948, new String[]{"Cantina 4-D (10 energy)", "Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGrandadmiralthrawn(), "Grand Admiral Thrawn", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGrandmasteryoda(), "Grand Master Yoda", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGrandmofftarkin(), "Grand Moff Tarkin", 22909, new String[]{"Fleet Store (400 credits)", "Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getGreedo(), "Greedo", 17523, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHansolo(), "Han Solo", 19929, new String[]{"Rancor"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHerasyndullas3(), "Hera Syndulla", 19929, new String[]{"Cantina 1-F (8 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHermityoda(), "Hermit Yoda", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHk47(), "HK-47", 17523, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHothrebelscout(), "Hoth Rebel Scout", 16948, new String[]{"Dark Hard 6-A (16 energy)", "Light Hard 8-B (20 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHothrebelsoldier(), "Hoth Rebel Soldier", 16948, new String[]{"Dark Hard 3-B (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getMagnaguard(), "IG-100 MagnaGuard", 16948, new String[]{"Cantina 3-C (10 energy)", "Dark Hard 6-E (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getIg86Sentineldroid(), "IG-86 Sentinel Droid", 16948, new String[]{"Cantina 4-E (10 energy)", "Dark Hard 2-F (12 energy)", "Galactic War Shipments (400 credits)", "Light Hard 4-D (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getIg88(), "IG-88", 17523, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getImagundi(), "Ima-Gun Di", 17523, new String[]{"Cantina 7-E (16 energy)", "Dark Hard 5-A (16 energy)", "Guild Shipments (400 credits)", "Light Hard 7-C (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getImperialprobedroid(), "Imperial Probe Droid", 19929, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getImperialsupercommando(), "Imperial Super Commando", 16948, new String[]{"Cantina 8-D (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getJawa(), "Jawa", 16948, new String[]{"Cantina 2-D (8 energy)", "Dark Hard 4-F (12 energy)", "Light Hard 6-B (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getJawaengineer(), "Jawa Engineer", 17523, new String[]{"Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getJawascavenger(), "Jawa Scavenger", 17523, new String[]{"Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getJediknightconsular(), "Jedi Consular", 16948, new String[]{"Cantina 3-A (10 energy)", "Cantina 6-E (12 energy)", "Dark Hard 1-D (12 energy)", "Dark Hard 3-C (12 energy)", "Fleet Store (400 credits)", "Light Hard 1-B (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getAnakinknight(), "Jedi Knight Anakin", 17523, new String[]{"Cantina 7-G (16 energy)", "Dark Hard 5-B (16 energy)", "Dark Hard 7-D (20 energy)", "Light Hard 5-C (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getJediknightguardian(), "Jedi Knight Guardian", 16948, new String[]{"Dark Hard 3-F (12 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getJynerso(), "Jyn Erso", 22909, new String[]{"Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getK2So(), "K-2SO", 19929, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getKananjarruss3(), "Kanan Jarrus", 19929, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getKitfisto(), "Kit Fisto", 17523, new String[]{"Cantina 4-F (10 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getKyloren(), "Kylo Ren", 19929, new String[]{"Cantina 4-C (10 energy)", "Cantina 6-C (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getKylorenunmasked(), "Kylo Ren (Unmasked)", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getAdministratorlando(), "Lando Calrissian", 17313, new String[]{"Cantina 1-E (8 energy)", "Cantina 5-F (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getLobot(), "Lobot", 17523, new String[]{"Light Hard 4-B (12 energy)", "Light Hard 5-B (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getLogray(), "Logray", 19929, new String[]{"Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getLukeskywalker(), "Luke Skywalker (Farmboy)", 22125, new String[]{"Cantina 1-B (8 energy)", "Cantina 5-A (12 energy)", "Light Hard 7-D (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getLuminaraunduli(), "Luminara Unduli", 19929, new String[]{"Dark Hard 2-E (12 energy)", "Galactic War Shipments (400 credits)", "Light Hard 3-D (12 energy)", "Light Hard 6-A (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getMacewindu(), "Mace Windu", 17523, new String[]{"Cantina 4-A (10 energy)", "Fleet Store (400 credits)", "Light Hard 2-E (12 energy)", "Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getMagmatrooper(), "Magmatrooper", 16948, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHumanthug(), "Mob Enforcer", 16948, new String[]{"Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getMothertalzin(), "Mother Talzin", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getNightsisteracolyte(), "Nightsister Acolyte", 16948, new String[]{"Cantina 2-A (8 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getNightsisterinitiate(), "Nightsister Initiate", 19929, new String[]{"Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getNightsisterspirit(), "Nightsister Spirit", 16948, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getNightsisterzombie(), "Nightsister Zombie", 16948, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getNutegunray(), "Nute Gunray", 17523, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getOldbenkenobi(), "Obi-Wan Kenobi (Old Ben)", 22909, new String[]{"Cantina 2-F (8 energy)", "Cantina 6-B (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getDaka(), "Old Daka", 19929, new String[]{"Dark Hard 4-B (12 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPao(), "Pao", 19929, new String[]{"Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPaploo(), "Paploo", 19929, new String[]{"Cantina 3-D (10 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPlokoon(), "Plo Koon", 17523, new String[]{"Cantina 4-G (10 energy)", "Dark Hard 7-C (20 energy)", "Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPoe(), "Poe Dameron", 17523, new String[]{"Dark Hard 7-A (20 energy)", "Fleet Store (400 credits)", "Light Hard 7-B (20 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPogglethelesser(), "Poggle the Lesser", 17523, new String[]{"Galactic War Shipments (400 credits)", "Light Hard 4-E (12 energy)", "Light Hard 6-E (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getPrincessleia(), "Princess Leia", 19929, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getQuigonjinn(), "Qui-Gon Jinn", 19929, new String[]{"Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getR2D2Legendary(), "R2-D2", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getHothleia(), "Rebel Officer Leia Organa", 19929, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getResistancepilot(), "Resistance Pilot", 16738, new String[]{"Fleet Store (400 credits)", "Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getResistancetrooper(), "Resistance Trooper", 16738, new String[]{"Dark Hard 3-A (12 energy)", "Guild Shipments (400 credits)", "Light Hard 3-A (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getReyjeditraining(), "Rey (Jedi Training)", 25890, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getRey(), "Rey (Scavenger)", 19929, new String[]{"Dark Hard 5-D (16 energy)", "Dark Hard 7-B (20 energy)", "Guild Shipments (400 credits)", "Light Hard 2-A (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getRoyalguard(), "Royal Guard", 16948, new String[]{"Cantina 7-C (16 energy)", "Dark Hard 5-F (16 energy)", "Light Hard 1-D (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSabinewrens3(), "Sabine Wren", 19929, new String[]{"Dark Hard 1-A (12 energy)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSavageopress(), "Savage Opress", 19929, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getScarifrebel(), "Scarif Rebel Pathfinder", 16948, new String[]{"Cantina 1-D (8 energy)", "Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getShoretrooper(), "Shoretrooper", 16948, new String[]{"Light Hard 9-B (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSithassassin(), "Sith Assassin", 16948, new String[]{"Cantina 8-C (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSithtrooper(), "Sith Trooper", 16948, new String[]{"Cantina 8-B (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSnowtrooper(), "Snowtrooper", 16948, new String[]{"Cantina 7-B (16 energy)", "Guild Shipments (400 credits)", "Light Hard 8-C (20 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getStormtrooper(), "Stormtrooper", 19144, new String[]{"Dark Hard 4-D (12 energy)", "Light Hard 3-C (12 energy)", "Light Hard 8-D (20 energy)", "Squad Cantina Battle Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getStormtrooperhan(), "Stormtrooper Han", 19719, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSunfac(), "Sun Fac", 17523, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getTalia(), "Talia", 17523, new String[]{"Cantina 1-G (8 energy)", "Cantina 5-E (12 energy)", "Light Hard 2-D (12 energy)", "Light Hard 2-F (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getTeebo(), "Teebo", 17733, new String[]{"Dark Hard 3-D (12 energy)", "Galactic War Shipments (400 credits)", "Light Hard 4-A (12 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getTiefighterpilot(), "TIE Fighter Pilot", 16948, new String[]{"Cantina 4-B (10 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getTuskenraider(), "Tusken Raider", 16948, new String[]{"Cantina 7-A (16 energy)", "Dark Hard 6-C (16 energy)", "Galactic War Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getTuskenshaman(), "Tusken Shaman", 16948, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getUgnaught(), "Ugnaught", 16738, new String[]{"Squad Arena Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getUrorrurrr(), "URoRRuR'R'R", 17523, new String[]{"Light Hard 5-A (16 energy)", "Light Hard 5-F (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSmugglerchewbacca(), "Veteran Smuggler Chewbacca", 19929, new String[]{"Cantina 8-F (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getSmugglerhan(), "Veteran Smuggler Han Solo", 19929, new String[]{"Cantina 8-G (16 energy)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getWampa(), "Wampa", 22909, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getWedgeantilles(), "Wedge Antilles", 17523, new String[]{"Cantina 6-F (12 energy)", "Fleet Store (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getWicket(), "Wicket", 19929, new String[]{"Event"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getZamwesell(), "Zam Wesell", 17523, new String[]{"Fleet Store (400 credits)", "Guild Shipments (400 credits)"}, new ArrayList<Gearlevel>());
        addCharsToInfos(swgohGildenApi.getfirstorderexecutioner(), "First Order Executioner", 16948, new String[]{"Event"}, new ArrayList<Gearlevel>());

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


        Collections.sort(thisInfos.getMemberListe(), new memberComparator(""));

        return thisInfos;
    }

    private void addCharsToInfos(SwgohCharakter[] nowchars, String charName, int maxpower, String[] farmLocations, ArrayList<Gearlevel> gearlevels) {

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
                charac.FarmLocations = farmLocations;
                charac.gearlevels = gearlevels;
                characToPlayer(charac);
            }
    }

    private void characToPlayer(Charakter charac){

        for(MemberListe member : thisInfos.getMemberListe()){
            if(member.getMemberName().equals(charac.besitzer)){
                member.getCharakter().add(charac);
                member.CharPower += charac.power;
                member.OverallPower += charac.power;
                return;
            }
        }

        MemberListe newMember = new MemberListe();
        newMember.setMemberName(charac.besitzer);
        ArrayList<Charakter> characList = new ArrayList<Charakter>();
        newMember.setFlotte(new ArrayList<Ship>());
        characList.add(charac);
        newMember.setCharakter(characList);
        newMember.CharPower += charac.power;
        newMember.OverallPower += charac.power;

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
                member.CharPower += ship.power;
                member.OverallPower += ship.power;
                return;
            }
        }

        MemberListe newMember = new MemberListe();
        newMember.setMemberName(ship.besitzer);
        ArrayList<Ship> shipList = new ArrayList<Ship>();
        shipList.add(ship);
        newMember.setFlotte(shipList);
        newMember.setCharakter(new ArrayList<Charakter>());

        newMember.CharPower += ship.power;
        newMember.OverallPower += ship.power;

        thisInfos.getMemberListe().add(newMember);

    }

}
