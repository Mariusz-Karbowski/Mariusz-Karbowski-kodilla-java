package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int uniqueUserId;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPostsPublished;

    public ForumUser(final int uniqueUserId, final String username, final char sex, final LocalDate dateOfBirth, final int numberOfPostsPublished) {
        this.uniqueUserId = uniqueUserId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPostsPublished = numberOfPostsPublished;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPostsPublished() {
        return numberOfPostsPublished;
    }

    @Override
    public String toString() {
        return "{" +
                "uniqueUserId=" + uniqueUserId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPostsPublished=" + numberOfPostsPublished +
                '}';
    }
}
