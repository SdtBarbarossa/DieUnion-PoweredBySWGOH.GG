
package com.jimdo.unionderhelden.dieunion;

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
    "G-Macht",
    "Sammlung",
    "Arena-Rang",
    "Arena-Durchschnitt"
})
public class GildenMember {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("G-Macht")
    private String gMacht;
    @JsonProperty("Sammlung")
    private String sammlung;
    @JsonProperty("Arena-Rang")
    private String arenaRang;
    @JsonProperty("Arena-Durchschnitt")
    private String arenaDurchschnitt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("G-Macht")
    public String getGMacht() {
        return gMacht;
    }

    @JsonProperty("G-Macht")
    public void setGMacht(String gMacht) {
        this.gMacht = gMacht;
    }

    @JsonProperty("Sammlung")
    public String getSammlung() {
        return sammlung;
    }

    @JsonProperty("Sammlung")
    public void setSammlung(String sammlung) {
        this.sammlung = sammlung;
    }

    @JsonProperty("Arena-Rang")
    public String getArenaRang() {
        return arenaRang;
    }

    @JsonProperty("Arena-Rang")
    public void setArenaRang(String arenaRang) {
        this.arenaRang = arenaRang;
    }

    @JsonProperty("Arena-Durchschnitt")
    public String getArenaDurchschnitt() {
        return arenaDurchschnitt;
    }

    @JsonProperty("Arena-Durchschnitt")
    public void setArenaDurchschnitt(String arenaDurchschnitt) {
        this.arenaDurchschnitt = arenaDurchschnitt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return name;
    }

}
