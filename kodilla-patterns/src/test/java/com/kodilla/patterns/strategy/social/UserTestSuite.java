package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Smith");
        User maria = new ZGeneration("Maria Herald");

        //When
        String stevenIsSharing = steven.sharePost();
        System.out.println("Steven belongs to:  " + stevenIsSharing);

        String johnIsSharing = john.sharePost();
        System.out.println("John belongs to: " + johnIsSharing);

        String mariaIsSharing = maria.sharePost();
        System.out.println("Maria belongs to: " + mariaIsSharing);

        //Then
        Assert.assertEquals("Millenials - they choose Facebook", stevenIsSharing);
        Assert.assertEquals("Y Generation - they choose Snapchat", johnIsSharing);
        Assert.assertEquals("Z Generation - they choose Twitter", mariaIsSharing);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenIsSharing = steven.sharePost();
        System.out.println("Steven belongs to:  " + stevenIsSharing);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenIsSharing = steven.sharePost();
        System.out.println("now Steven belongs to:  " + stevenIsSharing);

        //Then
        Assert.assertEquals("Y Generation - they choose Snapchat", stevenIsSharing);
    }
}
