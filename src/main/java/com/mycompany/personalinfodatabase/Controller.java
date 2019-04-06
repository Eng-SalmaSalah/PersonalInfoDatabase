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
    }

    //salma
    //amr
    public Person firstRecord() {

        try {
            resultSet.first();
            person.setId(resultSet.getInt("id"));
            person.setfName(resultSet.getString("fname"));
            person.setlName(resultSet.getString("lname"));
            person.setmName(resultSet.getString("mname"));
            person.setEmail(resultSet.getString("email"));
            person.setPhone(resultSet.getString("phone"));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return person;
    }

    public Person lastRecord() {

        try {
            resultSet.last();
            person.setId(resultSet.getInt("id"));
            person.setfName(resultSet.getString("fname"));
            person.setlName(resultSet.getString("lname"));
            person.setmName(resultSet.getString("mname"));
            person.setEmail(resultSet.getString("email"));
            person.setPhone(resultSet.getString("phone"));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return person;
    }

    public void updateRow(Person person) {
        try {
            if (!flag) {

                resultSet.updateInt("id", person.getId());
                resultSet.updateString("fname", person.getfName());
                resultSet.updateString("lname", person.getlName());
                resultSet.updateString("mname", person.getmName());
                resultSet.updateString("email", person.getEmail());
                resultSet.updateString("phone", person.getPhone());
                resultSet.updateRow();
            } else {
                System.out.println("no Row TO update");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
