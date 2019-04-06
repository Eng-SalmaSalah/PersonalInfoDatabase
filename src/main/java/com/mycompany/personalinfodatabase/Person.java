/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personalinfodatabase;

/**
*

 * @author salma
 */

public class Person {
    private int id ;
    private String fName;
    private String mName;
    private String lName;
    private String email;
    private String phone;

    public Person(int id, String firstName, String middleName, String lastName, String email, String phone) {
        this.id = id;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;

        this.email = email;
        this.phone = phone;
    }


    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    public String getfName() {
        return fName;
    }

    public String getmName() {
        return mName;
    }

    public String getlName() {
        return lName;

    }

    public String getEmail() {
        return email;
    }


    public String getPhone() {
        return phone;
    }


    
}
