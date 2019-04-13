package com.kodilla.testing.forum.statistics;


import java.util.List;

public class CalculateStatistics {
    Statistics statistics;
    private int postCounter;
    private int userCounter;
    private int commentCounter;
    private double averagePostPerUser;
    private double averageCommentPerUser;
    private double averageCommentPerPost;

    public CalculateStatistics() {

    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;

        userCounter = statistics.userNames().size();

        postCounter = statistics.postCount();

        commentCounter = statistics.commentCount();

        if (statistics.userNames().size() > 0) {
            averagePostPerUser = (double) statistics.postCount() / statistics.userNames().size();
        } else {
            averagePostPerUser = 0;
        }

        if (statistics.userNames().size() > 0) {
            averageCommentPerUser = (double) statistics.commentCount() / statistics.userNames().size();
        } else {
            averageCommentPerUser = 0;
        }

        if (statistics.postCount() > 0) {
            averageCommentPerPost = (double) statistics.commentCount() / statistics.postCount();
        } else {
            averageCommentPerPost = 0;
        }
    }

        public double getPostCounter () {
            return postCounter;
        }

        public double getUserCounter () {
            return userCounter;
        }

        public double getCommentCounter () {
            return commentCounter;
        }

        public double getAveragePostPerUser () {
            return averagePostPerUser;
        }

        public double getAverageCommentPerUser () {
            return averageCommentPerUser;
        }

        public double getAverageCommentPerPost () {
            return averageCommentPerPost;
        }
    }

