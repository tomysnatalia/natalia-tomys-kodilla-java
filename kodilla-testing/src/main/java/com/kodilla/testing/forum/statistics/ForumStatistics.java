package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class ForumStatistics {

    int users;
    int posts;
    int comments;
    double AvgPostsPerUser;
    double AvgCommentsPerUser;
    double AvgCommentsPerPost;

    public ForumStatistics() {
        this.users = users;
        this.posts = posts;
        this.comments = comments;
        this.AvgCommentsPerUser = AvgCommentsPerUser;
        this.AvgPostsPerUser = AvgPostsPerUser;
        this.AvgCommentsPerPost = AvgCommentsPerPost;
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
        return AvgPostsPerUser;
    }
    public double getAvgCommentsPerUser() {
        return AvgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return AvgCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumStatistics that = (ForumStatistics) o;
        return users == that.users &&
                posts == that.posts &&
                comments == that.comments &&
                Double.compare(that.AvgPostsPerUser, AvgPostsPerUser) == 0 &&
                Double.compare(that.AvgCommentsPerUser, AvgCommentsPerUser) == 0 &&
                Double.compare(that.AvgCommentsPerPost, AvgCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, posts, comments, AvgPostsPerUser, AvgCommentsPerUser, AvgCommentsPerPost);
    }

    public void calculateAvgStatistics (Statistics statistics) {
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        AvgPostsPerUser = calculatePostsAvgPerUser();
        AvgCommentsPerUser = calculateCommentsAvgPerUser();
        AvgCommentsPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(users>0){
            return (double)posts/users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(users>0){
            return (double)comments/users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(posts>0){
            return (double)comments/posts;
        } else {
            return 0;
        }
    }


    public void showStatistics() {
        System.out.println("Forum statistics: ");
        System.out.println("Users number: " + users);
        System.out.println("Posts number: " + posts);
        System.out.println("Comments number: " + comments);
        System.out.println("Average posts per person: " + AvgPostsPerUser);
        System.out.println("Average comments per person: " + AvgCommentsPerPost);
        System.out.println("Average comments per posts: " + AvgCommentsPerPost);

    }
}


