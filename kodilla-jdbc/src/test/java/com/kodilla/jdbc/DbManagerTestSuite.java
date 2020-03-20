package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery2 = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "    FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "    GROUP BY P.USER_ID\n" +
                "    HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs2 = statement.executeQuery(sqlQuery2);

        //Then
        int counter = 0;
        while(rs2.next()) {
            System.out.println(rs2.getString("FIRSTNAME") + ", " +
                    rs2.getString("LASTNAME") + "," +
                    rs2.getString("POSTS_NUMBER"));
            counter++;
        }
        rs2.close();
        statement.close();
        Assert.assertEquals(3, counter);
    }
}