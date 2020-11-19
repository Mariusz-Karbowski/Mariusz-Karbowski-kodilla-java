package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    ForumStatistics forumStatistics = new ForumStatistics();
    Statistics statisticsMock = mock(Statistics.class);

    private List<String> usersList(int usersCount) {
        List<String> forumUsers = new ArrayList<>();
        for (int i = 0; i < usersCount; i++) {
            forumUsers.add("ForumUser");
        }
        return forumUsers;
    }


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("All tests are done.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter + " executed");
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        when(statisticsMock.postCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        when(statisticsMock.usersNames()).thenReturn(usersList(100));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(1.5, forumStatistics.getAverageCommentsPerPost());
        Assertions.assertEquals(10, forumStatistics.getAveragePostsPerUser());
    }

    @Test
    public void testCalculateAdvStatistics0Comments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfComments());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postCount()).thenReturn(200);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistics.getNumberOfComments());
        Assertions.assertEquals(200, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0.5, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(200, forumStatistics.getNumberOfComments());
        Assertions.assertEquals(100, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(2, forumStatistics.getAverageCommentsPerPost());
    }

    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersList(0));
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assertions.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assertions.assertEquals(0, forumStatistics.getNumberOfComments());
    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersList(100));
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assertions.assertEquals(1, forumStatistics.getAveragePostsPerUser());
        Assertions.assertEquals(2, forumStatistics.getAverageCommentsPerUser());
    }
}