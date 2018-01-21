
package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MemberName",
    "Charakter"
})
public class MemberListe {

    @JsonProperty("MemberName")
    private String memberName;
    @JsonProperty("Charakter")
    private List<Charakter> charakter = null;
    @JsonProperty("Flotte")
    private List<Ship> ships = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("ArenaRang")
    public String ArenaRang;
    @JsonProperty("ArenaTeam")
    public ArrayList<String> ArenaTeam;

    @JsonProperty("MemberName")
    public String getMemberName() {
        return memberName;
    }

    @JsonProperty("MemberName")
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @JsonProperty("Charakter")
    public List<Charakter> getCharakter() {
        return charakter;
    }

    @JsonProperty("Charakter")
    public void setCharakter(List<Charakter> charakter) {
        this.charakter = charakter;
    }

    @JsonProperty("Flotte")
    public List<Ship> getFlotte() {
        return ships;
    }

    @JsonProperty("Flotte")
    public void setFlotte(List<Ship> Ship) {
        this.ships = Ship;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Charakter findCharByName(String name){

        for(int i = 0 ; i < charakter.size(); i++){
            if(charakter.get(i).getName().equals(name)){
                return charakter.get(i);
            }
        }

        return null;

    }

    public Ship findShipByName(String name){

        for(int i = 0 ; i < ships.size(); i++){
            if(ships.get(i).getName().equals(name)){
                return ships.get(i);
            }
        }

        return null;

    }

    @Override
    public String toString() {
        return memberName;
    }

}
