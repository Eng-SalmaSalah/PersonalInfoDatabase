/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personalinfodatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author Amr Elkady
 */
public class DAO {
    
    //salma
    
    //amr
    DataBaseConnector dataBaseConnector;
    Connection connection;
    Statement statement;
    DataSource dataSource;

    public DAO() {
        try {
            dataBaseConnector = new DataBaseConnector();
            statement=connectToDataBase();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Statement connectToDataBase() throws SQLException {
        try {
            dataSource = dataBaseConnector.connectToDataBase();
            connection = dataSource.getConnection();

        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }

    public ResultSet getDataFromTable(String tableName) {

        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("select * from "+tableName);

        } catch (SQLException ex) {
            ex.printStackTrace();
            //return false;
        }
        return resultSet;
    }

}
