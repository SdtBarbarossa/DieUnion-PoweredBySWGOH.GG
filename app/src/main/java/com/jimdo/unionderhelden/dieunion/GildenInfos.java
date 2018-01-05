
package com.jimdo.unionderhelden.dieunion;

import java.util.ArrayList;
import java.util.Date;
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
    "GildenName",
    "GalaktischeMacht",
    "GalaktischeMachtDurschnitt",
    "GildenRang",
    "GildenRaidPunkte",
    "GildenArenaRangDurschnitt",
    "GildenSammlungsScoreDurschnitt",
    "GildenMember",
    "MemberListe"
})
public class GildenInfos {

    @JsonProperty("GildenName")
    private String gildenName;
    @JsonProperty("GalaktischeMacht")
    private Integer galaktischeMacht;
    @JsonProperty("GalaktischeMachtDurschnitt")
    private Integer galaktischeMachtDurschnitt;
    @JsonProperty("GildenRang")
    private Integer gildenRang;
    @JsonProperty("GildenRaidPunkte")
    private Integer gildenRaidPunkte;
    @JsonProperty("GildenArenaRangDurschnitt")
    private Double gildenArenaRangDurschnitt;
    @JsonProperty("GildenSammlungsScoreDurschnitt")
    private Double gildenSammlungsScoreDurschnitt;
    @JsonProperty("GildenMember")
    private List<GildenMember> gildenMember = null;
    @JsonProperty("MemberListe")
    private List<MemberListe> memberListe = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("lastSync")
    public Date lastSync;

    @JsonProperty("GildenName")
    public String getGildenName() {
        return gildenName;
    }

    @JsonProperty("GildenName")
    public void setGildenName(String gildenName) {
        this.gildenName = gildenName;
    }

    @JsonProperty("GalaktischeMacht")
    public Integer getGalaktischeMacht() {
        return galaktischeMacht;
    }

    @JsonProperty("GalaktischeMacht")
    public void setGalaktischeMacht(Integer galaktischeMacht) {
        this.galaktischeMacht = galaktischeMacht;
    }

    @JsonProperty("GalaktischeMachtDurschnitt")
    public Integer getGalaktischeMachtDurschnitt() {
        return galaktischeMachtDurschnitt;
    }

    @JsonProperty("GalaktischeMachtDurschnitt")
    public void setGalaktischeMachtDurschnitt(Integer galaktischeMachtDurschnitt) {
        this.galaktischeMachtDurschnitt = galaktischeMachtDurschnitt;
    }

    @JsonProperty("GildenRang")
    public Integer getGildenRang() {
        return gildenRang;
    }

    @JsonProperty("GildenRang")
    public void setGildenRang(Integer gildenRang) {
        this.gildenRang = gildenRang;
    }

    @JsonProperty("GildenRaidPunkte")
    public Integer getGildenRaidPunkte() {
        return gildenRaidPunkte;
    }

    @JsonProperty("GildenRaidPunkte")
    public void setGildenRaidPunkte(Integer gildenRaidPunkte) {
        this.gildenRaidPunkte = gildenRaidPunkte;
    }

    @JsonProperty("GildenArenaRangDurschnitt")
    public Double getGildenArenaRangDurschnitt() {
        return gildenArenaRangDurschnitt;
    }

    @JsonProperty("GildenArenaRangDurschnitt")
    public void setGildenArenaRangDurschnitt(Double gildenArenaRangDurschnitt) {
        this.gildenArenaRangDurschnitt = gildenArenaRangDurschnitt;
    }

    @JsonProperty("GildenSammlungsScoreDurschnitt")
    public Double getGildenSammlungsScoreDurschnitt() {
        return gildenSammlungsScoreDurschnitt;
    }

    @JsonProperty("GildenSammlungsScoreDurschnitt")
    public void setGildenSammlungsScoreDurschnitt(Double gildenSammlungsScoreDurschnitt) {
        this.gildenSammlungsScoreDurschnitt = gildenSammlungsScoreDurschnitt;
    }

    @JsonProperty("GildenMember")
    public List<GildenMember> getGildenMember() {
        return gildenMember;
    }

    @JsonProperty("GildenMember")
    public void setGildenMember(List<GildenMember> gildenMember) {
        this.gildenMember = gildenMember;
    }

    @JsonProperty("MemberListe")
    public List<MemberListe> getMemberListe() {
        return memberListe;
    }

    @JsonProperty("MemberListe")
    public void setMemberListe(List<MemberListe> memberListe) {
        this.memberListe = memberListe;
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
