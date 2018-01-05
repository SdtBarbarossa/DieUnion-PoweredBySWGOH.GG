// Arc170Clonesergeant.java

package com.jimdo.unionderhelden.dieunion;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class SwgohShip {
    private String player;
    private long rarity;
    private long combatType;
    private long power;
    private long level;

    @JsonProperty("player")
    public String getPlayer() { return player; }
    @JsonProperty("player")
    public void setPlayer(String value) { this.player = value; }

    @JsonProperty("rarity")
    public long getRarity() { return rarity; }
    @JsonProperty("rarity")
    public void setRarity(long value) { this.rarity = value; }

    @JsonProperty("combat_type")
    public long getCombatType() { return combatType; }
    @JsonProperty("combat_type")
    public void setCombatType(long value) { this.combatType = value; }

    @JsonProperty("power")
    public long getPower() { return power; }
    @JsonProperty("power")
    public void setPower(long value) { this.power = value; }

    @JsonProperty("level")
    public long getLevel() { return level; }
    @JsonProperty("level")
    public void setLevel(long value) { this.level = value; }
}