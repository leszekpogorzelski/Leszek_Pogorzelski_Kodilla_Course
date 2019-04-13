package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surename;

    public User(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }
}
