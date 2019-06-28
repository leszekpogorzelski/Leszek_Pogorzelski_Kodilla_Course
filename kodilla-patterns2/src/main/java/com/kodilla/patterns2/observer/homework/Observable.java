package com.kodilla.patterns2.observer.homework;

import org.springframework.boot.origin.SystemEnvironmentOrigin;

public interface Observable {
    void registerMentor(Mentor mentor);
    void notifyMentors();
    //void removeMentor(Mentor mentor);
}
