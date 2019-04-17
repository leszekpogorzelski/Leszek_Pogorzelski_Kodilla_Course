package com.kodilla.patterns.strategy.social.Publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String publish() {
        return "Twitter";
    }
}
