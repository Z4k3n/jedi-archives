package com.example;

public class Jedi extends ForceUser {
    private String rank;
    private String lightsaberColor;
    private String homeworld;
    private String master;
    private String padawan;
    private int age;

    public Jedi(long id, String name, String rank, String lightsaberColor, String homeworld, String master, String padawan, int age) {
        super(id, name);
        this.rank = rank;
        this.lightsaberColor = lightsaberColor;
        this.homeworld = homeworld;
        this.master = master;
        this.padawan = padawan;
        this.age = age;
    }

    // Getters y setters
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLightsaberColor() {
        return lightsaberColor;
    }

    public void setLightsaberColor(String lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getPadawan() {
        return padawan;
    }

    public void setPadawan(String padawan) {
        this.padawan = padawan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}