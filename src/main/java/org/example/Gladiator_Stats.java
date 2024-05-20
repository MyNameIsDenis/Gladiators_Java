package org.example;

public class Gladiator_Stats {
    int constitution;
    int strength;
    int xp;
    int dexterity;
    int level;
    int basicAttack;
    int basicHP;
    int critChance;
    int charisma;
    boolean haveShield;

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public Gladiator_Stats(int constitution, int strength, int xp, int dexterity, int level, int basicAttack, int basicHP, int critChance, int charisma, boolean haveShield) {
        this.constitution = constitution;
        this.strength = strength;
        this.xp = xp;
        this.dexterity = dexterity;
        this.level = level;
        this.basicAttack = basicAttack;
        this.basicHP = basicHP;
        this.critChance = critChance;
        this.charisma = charisma;
        this.haveShield = haveShield;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public int getBasicHP() {
        return basicHP;
    }

    public boolean isHaveShield() {
        return haveShield;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getStrength() {
        return strength;
    }

    public int getXp() {
        return xp;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getLevel() {
        return level;
    }

    public int getCritChance() {
        return critChance;
    }

    public int getCharisma() {
        return charisma;
    }
}
