package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Queue;

public class HomeWork implements Observable {
    private final String name;
    private  Mentor mentor;
    private Queue <String> homeWorks;

    public HomeWork(String name) {
        this.name = name;
        homeWorks = new ArrayDeque<>();
    }
    public void addHomeWork(String homeWork) {
        homeWorks.offer(homeWork);
    }

    @Override
    public void registerMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @Override
    public void notifyMentors() {
        mentor.update(this);
    }

    public Queue<String> getHomeWorks() {
        return homeWorks;
    }
}
