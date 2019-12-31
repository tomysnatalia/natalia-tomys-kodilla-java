package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Before
    public void testing() {
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> listMock = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            listMock.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
    }

    @Test
    public void testCalculateAvgStatisticsWithZeroPosts () {
            //Given
            ForumStatistics forumStatistics = new ForumStatistics();
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.postsCount()).thenReturn(0);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(0, forumStatistics.getPosts());
            Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0);
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0);
        }

    @Test
    public void testCalculateAvgStatisticsWithThousandPosts () {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(1000);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(1000, forumStatistics.getPosts());
            Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0.01);

        }

        @Test
        public void testCalculateAvgStatisticsWithZeroComments () {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(0, forumStatistics.getComments());
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(),0);
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerPost(), 0);
        }

        @Test
        public void testCalculateAvgStatisticsWithLessCommentsThanPosts () {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.commentsCount()).thenReturn(2);
            when(statisticsMock.postsCount()).thenReturn(10);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(10, forumStatistics.getPosts());
            Assert.assertEquals(2, forumStatistics.getComments());
            Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);
            Assert.assertEquals(0.2, forumStatistics.getAvgCommentsPerPost(), 0.01);
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.01);

        }

        @Test
        public void testCalculateAvgStatisticsWithLessPostsThanComments () {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            when(statisticsMock.postsCount()).thenReturn(2);
            when(statisticsMock.commentsCount()).thenReturn(10);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(2, forumStatistics.getPosts());
            Assert.assertEquals(10, forumStatistics.getComments());
            Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0);
            Assert.assertEquals(5, forumStatistics.getAvgCommentsPerPost(), 0.01);
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 1);
        }

        @Test
        public void testCalculateAvgStatisticsWithZeroUsers () {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();

            ArrayList<String> listMock = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(listMock);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(0, forumStatistics.getUsers());
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0);
            Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0);
        }

        @Test
        public void testCalculateAvgStatisticsWithHundredUsers () {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ForumStatistics forumStatistics = new ForumStatistics();
            ArrayList<String> listMock = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                listMock.add("User");
            }
            when(statisticsMock.usersNames()).thenReturn(listMock);
            //When
            forumStatistics.calculateAvgStatistics(statisticsMock);
            //Then
            Assert.assertEquals(100, forumStatistics.getUsers());
            Assert.assertEquals(0, forumStatistics.getAvgCommentsPerUser(), 0.01);
            Assert.assertEquals(0, forumStatistics.getAvgPostsPerUser(), 0.01);

        }
    }
                  