package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int homeWorkCounter;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeWork homeWork) {
        System.out.println("New homeWork send! You have: " + homeWorkCounter + " homeworks to check.");
        homeWorkCounter++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getHomeWorkCounter() {
        return homeWorkCounter;
    }
}
