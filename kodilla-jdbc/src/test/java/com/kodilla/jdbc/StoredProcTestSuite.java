package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER = null";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement.execute(sqlProcedureCall);

        //Then
        String sqlCheckHowManyNull = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = null";
        String sqlCheckHowManyTrue = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER = true";

        ResultSet rsNull = statement.executeQuery(sqlCheckHowManyNull);
        int howManyNull = -1;
        if (rsNull.next()) {
            howManyNull = rsNull.getInt("HOW_MANY");
        }

        ResultSet rsTrue = statement.executeQuery(sqlCheckHowManyTrue);
        int howManyTrue = -1;
        if (rsTrue.next()) {
            howManyTrue = rsTrue.getInt("HOW_MANY");
        }
        assertEquals(0, howManyNull);
        assertEquals(0, howManyTrue);
    }
}