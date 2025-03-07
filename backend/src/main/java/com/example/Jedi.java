package com.example;

public class Jedi extends ForceUser {
    private String master;
    private String padawan;

    public Jedi(long id, String name, String rank, String lightsaberColor, String homeworld, String master, String padawan, int age, int powerLevel) {
        super(id, name, rank, lightsaberColor, homeworld, age, powerLevel);
        this.master = master;
        this.padawan = padawan;
    }

    // Getters y setters
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
}