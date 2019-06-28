package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeWorkTestSuite {

    @Test
    public void testMentorHomeWorkDeQue() {
        //Given
        HomeWork leszekHomeWrok = new LeszekHomeWork();
        HomeWork bartekHomeWork = new BartekHomeWork();

        Mentor adrian = new Mentor("Adrian"); // :)
        Mentor krystian = new Mentor("Krystian");

        leszekHomeWrok.registerMentor(adrian);
        bartekHomeWork.registerMentor(krystian);

        //When
        leszekHomeWrok.addHomeWork("Fisrt");
        leszekHomeWrok.addHomeWork("Second");
        leszekHomeWrok.addHomeWork("Third");
        bartekHomeWork.addHomeWork("XyZ");

        //Then

        Assert.assertEquals(3, leszekHomeWrok.getHomeWorks().size());
        Assert.assertEquals(1, bartekHomeWork.getHomeWorks().size());
    }
}
