package com.kodilla.stream.forumuser;

import java.time.Period;
import java.time.LocalDate;

public final class ForumUser {
    public LocalDate today = LocalDate.now();
    private final int userdId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public ForumUser(final int userdId, final String userName, final char sex, final int postCount, final LocalDate dateOfBirth) {
        this.userdId = userdId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getAge(){
    Period period = Period.between(dateOfBirth, today);
    return period.getYears();
}

    public int getUserdId() {
        return userdId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userdId=" + userdId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
