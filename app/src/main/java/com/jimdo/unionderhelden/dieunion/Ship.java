
package com.jimdo.unionderhelden.dieunion;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

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
public class Ship {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Level")
    private Integer level;
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

    public int shipImageID(){

        switch (getName().replace("&quot;","\"")) {
            case "Ahsoka Tano's Jedi Starfighter":
                return R.drawable.charui_jedi_fighter_ahsoka;
            case "Biggs Darklighter's X-wing":
                return R.drawable.charui_xwing_red3;
            case "Bistan's U-wing":
                return R.drawable.charui_uwing;
            case "Cassian's U-wing":
                return R.drawable.charui_uwing_hero;
            case "Chimaera":
                return R.drawable.charui_chimaera;
            case "Clone Sergeant's ARC-170":
                return R.drawable.charui_arc170;
            case "Endurance":
                return R.drawable.charui_venator;
            case "Executrix":
                return R.drawable.charui_stardestroyer;
            case "First Order SF TIE Fighter":
                return R.drawable.charui_fosf_tie_fighter;
            case "First Order TIE Fighter":
                return R.drawable.charui_firstorder_tiefighter;
            case "Gauntlet Starfighter":
                return R.drawable.charui_gauntlet;
            case "Geonosian Soldier's Starfighter":
                return R.drawable.charui_geonosis_fighter_soldier;
            case "Geonosian Spy's Starfighter":
                return R.drawable.charui_geonosis_fighter_spy;
            case "Ghost":
                return R.drawable.charui_ghost;
            case "Home One":
                return R.drawable.charui_moncalamarilibertycruiser;
            case "Imperial TIE Fighter":
                return R.drawable.charui_tiefighter;
            case "Jedi Consular's Starfighter":
                return R.drawable.charui_jedi_fighter;
            case "Kylo Ren's Command Shuttle":
                return R.drawable.charui_upsilon_shuttle_kylo;
            case "Millennium Falcon (Ep VII)":
                return R.drawable.charui_mfalcon_ep7;
            case "Phantom II":
                return R.drawable.charui_phantom2;
            case "Plo Koon's Jedi Starfighter":
                return R.drawable.charui_jedi_fighter_bladeofdorin;
            case "Poe Dameron's X-wing":
                return R.drawable.charui_xwing_blackone;
            case "Resistance X-wing":
                return R.drawable.charui_xwing_resistance;
            case "Rex's ARC-170":
                return R.drawable.charui_arc170_02;
            case "Scimitar":
                return R.drawable.charui_sithinfiltrator;
            case "Slave I":
                return R.drawable.charui_slave1;
            case "Sun Fac's Geonosian Starfighter":
                return R.drawable.charui_geonosis_fighter_sunfac;
            case "TIE Advanced x1":
                return R.drawable.charui_tieadvanced;
            case "TIE Reaper":
                return R.drawable.charui_tiereaper;
            case "TIE Silencer":
                return R.drawable.charui_tie_silencer;
            case "Umbaran Starfighter":
                return R.drawable.charui_umbaran_star_fighter;
            case "Wedge Antilles's X-wing":
                return R.drawable.charui_xwing_red2;
            default:
                break;
        }

        return 0;
    }

}
