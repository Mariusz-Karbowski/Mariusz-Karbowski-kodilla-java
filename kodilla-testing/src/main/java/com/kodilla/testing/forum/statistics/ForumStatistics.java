package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();
        averagePostsPerUser = calculateAveragePostsPerUser();
        averageCommentsPerUser = calculateAverageCommentsPerUser();
        averageCommentsPerPost = calculateAverageCommentsPerPost();
    }

    private double calculateAveragePostsPerUser() {
        if (numberOfUsers > 0) {
            return (double) numberOfPosts / numberOfUsers;
        } else {
            return 0;
        }
    }

    private double calculateAverageCommentsPerUser() {
        if (numberOfUsers > 0) {
            return (double) numberOfComments / numberOfUsers;
        } else {
            return 0;
        }
    }

    private double calculateAverageCommentsPerPost() {
        if (numberOfPosts > 0) {
            return (double) numberOfComments / numberOfPosts;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics:");
        System.out.println("Number of forum users: " + numberOfUsers);
        System.out.println("Number of users posts: " + numberOfPosts);
        System.out.println("Number of users comments: " + numberOfComments);
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }
}