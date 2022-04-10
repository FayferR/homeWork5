package com.company;

public class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }
    public String getDefenseType() {
        return this.defenseType;
    }
}
