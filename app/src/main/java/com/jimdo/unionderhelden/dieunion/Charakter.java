
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

}
