package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcTestSuite {

/*    @Test
    public void testUpdateVipLevels() throws SQLException {
        //GIVEN
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"NOT SET\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //WHEN
        String sqlprocedureCall = "Call UpdateVipLevel()";
        statement.execute(sqlprocedureCall);
        //THEN
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"NOT SET\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if  (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(0, howMany);
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"0\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        //WHEN
        String sqlprocedureCall = "Call UpdateBestsellers()";
        statement.execute(sqlprocedureCall);
        //THEN
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=\"1\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if  (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        Assert.assertEquals(3, howMany);
    }
*/

    }

