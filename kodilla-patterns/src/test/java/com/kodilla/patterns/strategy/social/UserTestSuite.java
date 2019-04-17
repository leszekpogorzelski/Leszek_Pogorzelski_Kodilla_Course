package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Kwiatkowski");
        User bartek = new YGeneration("Bartosz Nowak");
        User tomek = new ZGeneration("Tomasz Kowalski");

        //When
        String adamPost = adam.sharePost();
        System.out.println("Adam is publishing posts with " + adamPost);
        String bartekPost = bartek.sharePost();
        System.out.println("Bartosz is publishing posts with " + bartekPost);
        String tomekPost = tomek.sharePost();
        System.out.println("Tomasz is publishing posts with " + tomekPost + "\n");

        //Then
        Assert.assertEquals("Snapchat", adamPost);
        Assert.assertEquals("FaceBook", bartekPost);
        Assert.assertEquals("Twitter", tomekPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User adam = new Millenials("Adam Kwaitkowski");
        User bartek = new YGeneration("Bartosz Nowak");
        User tomek = new ZGeneration("Tomasz Kowalski");
        //When
        adam.setSocialPublisher(new FacebookPublisher());
        tomek.setSocialPublisher(new FacebookPublisher());
        String adamPost = adam.sharePost();
        System.out.println("Adam is now publishing posts with " + adamPost);
        String bartekPost = bartek.sharePost();
        System.out.println("Bartosz is now publishing posts with " + bartekPost);
        String tomekPost = tomek.sharePost();
        System.out.println("Tomasz is now publishing posts with " + tomekPost);

        adam.setSocialPublisher(new FacebookPublisher());
        //Then
        Assert.assertEquals("FaceBook", adamPost);
        Assert.assertEquals("FaceBook", bartekPost);
        Assert.assertEquals("FaceBook", tomekPost);
    }
}
