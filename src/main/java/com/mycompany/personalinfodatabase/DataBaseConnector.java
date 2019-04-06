/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personalinfodatabase;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import javax.sql.DataSource;



/**
 *
 * @author Amr Elkady
 */
public class DataBaseConnector  {
    
    //salma
    
    //amr
     public static DataSource connectToDataBase() {

        //Properties prob = new Properties();
       // FileInputStream file = null;
        MysqlDataSource mysqlDataSource = null;
        Properties properties = new Properties();
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("db.properties");
            properties.setProperty("MYSQL_DB_URL", "jdbc:mysql://localhost:3306/test");
            properties.setProperty("MYSQL_DB_USERNAME", "root");
            properties.setProperty("MYSQL_DB_PASSWORD", "root");
            properties.store(outputStream, null);
            
            FileInputStream file = new FileInputStream("db.properties");
            
            properties.load(file);
            
            mysqlDataSource = new MysqlDataSource();

            mysqlDataSource.setURL(properties.getProperty("MYSQL_DB_URL"));
            mysqlDataSource.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            mysqlDataSource.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));
            System.out.println(properties.getProperty("MYSQL_DB_PASSWORD"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return mysqlDataSource;
    }

     
}
