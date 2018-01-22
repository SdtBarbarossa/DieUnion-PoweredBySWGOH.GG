package com.jimdo.unionderhelden.dieunion;

/**
 * Created by Alle on 01.01.2018.
 */
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
        "GildenAPI"
})
public class Einstellungen {

    @JsonProperty("GildenAPI")
    private String GildenAPI;

    @JsonProperty("errorSettings")
    private boolean errorSettings;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GildenAPI")
    public String getGildenAPI() {
        return GildenAPI;
    }

    @JsonProperty("GildenAPI")
    public void setGildenAPI(String GildenAPI) {
        this.GildenAPI = GildenAPI;
    }

    @JsonProperty("errorSettings")
    public boolean geterrorSettings() {
        return errorSettings;
    }

    @JsonProperty("errorSettings")
    public void seterrorSettings(boolean errorSettings) {
        this.errorSettings = errorSettings;
    }

    public Einstellungen(String GildenAPI){
        this.GildenAPI = GildenAPI;
    }

    public Einstellungen(){
        this.GildenAPI = "";
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
