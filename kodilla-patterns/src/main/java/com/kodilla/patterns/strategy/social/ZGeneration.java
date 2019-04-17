package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Publishers.TwitterPublisher;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
