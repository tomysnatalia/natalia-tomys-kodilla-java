package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class ForumStatistics {

    int users;
    int posts;
    int comments;
    double avgPostsPerUser;
    double avgCommentsPerUser;
    double avgCommentsPerPost;

    public ForumStatistics() {
        this.users = users;
        this.posts = posts;
        this.comments = comments;
        this.avgCommentsPerUser = avgCommentsPerUser;
        this.avgPostsPerUser = avgPostsPerUser;
        this.avgCommentsPerPost = avgCommentsPerPost;
    }

    public int getUsers() {
        return users;
    }
    public int getPosts() {
        return posts;
    }
    public int getComments() {
        return comments;
    }
    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }
    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }


    public void calculateAvgStatistics (Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        avgPostsPerUser = calculatePostsAvgPerUser();
        avgCommentsPerUser = calculateCommentsAvgPerUser();
        avgCommentsPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(users > 0){
            return (double) posts / users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(users > 0){
            return (double) comments / users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(posts > 0){
            return (double) comments / posts;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics: ");
        System.out.println("Users number: " + users);
        System.out.println("Posts number: " + posts);
        System.out.println("Comments number: " + comments);
        System.out.println("Average posts per person: " + avgPostsPerUser);
        System.out.println("Average comments per person: " + avgCommentsPerPost);
        System.out.println("Average comments per posts: " + avgCommentsPerPost);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumStatistics that = (ForumStatistics) o;
        return users == that.users &&
                posts == that.posts &&
                comments == that.comments &&
                Double.compare(that.avgPostsPerUser, avgPostsPerUser) == 0 &&
                Double.compare(that.avgCommentsPerUser, avgCommentsPerUser) == 0 &&
                Double.compare(that.avgCommentsPerPost, avgCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, posts, comments, avgPostsPerUser, avgCommentsPerUser, avgCommentsPerPost);
    }
}


