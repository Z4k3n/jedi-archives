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
    private String imageUrl;
    private boolean alive;

    public ForceUser(long id, String name, String rank, String lightsaberColor, String homeworld, int age, int powerLevel, String imageUrl, boolean alive) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.lightsaberColor = lightsaberColor;
        this.homeworld = homeworld;
        this.age = age;
        this.powerLevel = powerLevel;
        this.imageUrl = imageUrl;
        this.alive = true;
    }
}
