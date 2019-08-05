/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */

package com.hr.charles.app.chinhoyihr.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * This class is written for establishing connection between database and java code
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
@Repository
public class ConnectionClass {
    private static final String URL = "jdbc:h2:";
    
    private static Connection connection ;
    private static Statement statement = null;

    @Autowired
    public ConnectionClass(@Value("${db.url}")String dbUrl,
                           @Value("${db.user}")String dbUser,
                           @Value("${db.password}")String dbPassword){
        connection(dbUrl,dbUser,dbPassword);
    }
    
    /* Creating Connection*/
    void connection(String dbUrl, String dbUser, String dbPassword){
       try{
            connection = DriverManager.getConnection(URL+dbUrl, dbUser, dbPassword);
            statement = connection.createStatement();
            System.out.println("Connection Opened");
        }catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Connection is not Opened ! " + e.getMessage());      
        }
    }
    /*  Selecting Query */
    public static ResultSet selectQuery(String query) {
        try{
            return statement.executeQuery(query);
        }catch(SQLException e){
            e.getMessage();
            return null;
            
        }
    }
    /*  Executing Query */
    public static boolean query(String query) {
        try{
            return statement.execute(query);
        }catch(SQLException e){
            e.getMessage();
            throw new IllegalArgumentException();
        }
    }
    /* Prepares the data first then execute it */
     public static PreparedStatement getPreStatement(String query)
     {
       try {
           return statement.getConnection().prepareStatement(query);
         } catch (SQLException e) {}
       return null;
     }
    
}
