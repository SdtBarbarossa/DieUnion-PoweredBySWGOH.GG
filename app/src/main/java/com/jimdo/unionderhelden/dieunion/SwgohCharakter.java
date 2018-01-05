// Aaylasecura.java

package com.jimdo.unionderhelden.dieunion;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class SwgohCharakter {
    private long gearLevel;
    private long power;
    private long level;
    private String url;
    private long combatType;
    private long rarity;
    private String player;

    @JsonProperty("gear_level")
    public long getGearLevel() { return gearLevel; }
    @JsonProperty("gear_level")
    public void setGearLevel(long value) { this.gearLevel = value; }

    @JsonProperty("power")
    public long getPower() { return power; }
    @JsonProperty("power")
    public void setPower(long value) { this.power = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }

    @JsonProperty("combat_type")
    public long getCombatType() { return combatType; }
    @JsonProperty("combat_type")
    public void setCombatType(long value) { this.combatType = value; }

    @JsonProperty("rarity")
    public long getRarity() { return rarity; }
    @JsonProperty("rarity")
    public void setRarity(long value) { this.rarity = value; }

    @JsonProperty("player")
    public String getPlayer() { return player; }
    @JsonProperty("player")
    public void setPlayer(String value) { this.player = value; }
}