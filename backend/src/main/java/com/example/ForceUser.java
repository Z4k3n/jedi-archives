package com.example;

import lombok.*;

@Data
public class ForceUser {
    private long id;
    private String name;

    public ForceUser(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
