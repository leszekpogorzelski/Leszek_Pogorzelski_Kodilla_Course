package com.kodilla.patterns.strategy.social;

public class User {
    protected SocialPublisher socialPublisher;
    final private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public String sharePost(){
       return socialPublisher.publish();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
