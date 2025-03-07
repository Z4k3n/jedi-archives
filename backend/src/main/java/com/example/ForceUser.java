package com.example;

import lombok.*;

@Data
public class ForceUser {
    private long id;
    private String name;
    private String rank;
    private String lightsaberColor;
    private String homeworld;
    private int age;
    private int powerLevel;

    public ForceUser(long id, String name, String rank, String lightsaberColor, String homeworld, int age, int powerLevel) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.lightsaberColor = lightsaberColor;
        this.homeworld = homeworld;
        this.age = age;
        this.powerLevel = powerLevel;
    }
}
