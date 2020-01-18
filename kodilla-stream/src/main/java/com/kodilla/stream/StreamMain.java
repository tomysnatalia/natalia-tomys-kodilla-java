package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getPostsNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getNumberOfUser, forumUser -> forumUser));
        System.out.println("# elements: " + mapOfForumUsers.size());
        mapOfForumUsers.entrySet().stream();

    }
}              