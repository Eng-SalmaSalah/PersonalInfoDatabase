/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personalinfodatabase;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amr Elkady
 */
public class Controller {

    DAO dao;
    Person person;

    ResultSet resultSet;
    public boolean flag = false;

    public Controller(DAO dao) {
        this.dao = dao;
        person = new Person();
        getData("person");

    }

    //salma
    public void getData(String tableName) {

        resultSet = dao.getDataFromTable(tableName);

    }

    public Person nextRecord() {

        try {
            if (resultSet.next()) {
                person.setId(resultSet.getInt("id"));
                person.setfName(resultSet.getString("fname"));
                person.setlName(resultSet.getString("lname"));
                person.setmName(resultSet.getString("mname"));
                person.setEmail(resultSet.getString("email"));
                person.setPhone(resultSet.getString("phone"));
            } else {
                resultSet.previous();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return person;
    }

    public Person previousRecord() {

        try {

            if (resultSet.previous()) {
                person.setId(resultSet.getInt("id"));
                person.setfName(resultSet.getString("fname"));
                person.setlName(resultSet.getString("lname"));
                person.setmName(resultSet.getString("mname"));
                person.setEmail(resultSet.getString("email"));
                person.setPhone(resultSet.getString("phone"));
            } else {
                resultSet.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return person;
    }
    
        public void deleteRow() {
        try {
            if (resultSet.isLast()) {
                // resultSet.previous();
                resultSet.deleteRow();
                flag = true;
            } else if (resultSet.next()) {
                resultSet.previous();
                resultSet.deleteRow();
            } else {
                System.out.println("No row To delete");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //amr
}
