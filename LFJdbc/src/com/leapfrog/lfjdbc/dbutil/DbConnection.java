/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.lfjdbc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author onesoft
 */
public class DbConnection {
   
    private Connection conn = null;
    private PreparedStatement stmt = null;
    
    public void open() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost/LeapFrog", "root", "software");
    }
    
    public PreparedStatement initStatement(String sql) throws SQLException{
        stmt = conn.prepareStatement(sql);
        return stmt;
    }
    
    public int update() throws SQLException{
        return stmt.executeUpdate();
    }
    
    public ResultSet query() throws SQLException{
        return stmt.executeQuery();
    }
    
    public void close() throws SQLException{
        if(conn != null && !conn.isClosed()){
            conn.close();
            conn = null;
        }
    }
}
