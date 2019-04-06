/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.personalinfodatabase;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GUI extends Pane {
    //Author Salma

    protected Button new_BT;
    protected Button update_BT;
    protected Button delete_BT;
    protected Button first_BT;
    protected Button next_BT;
    protected Button prev_BT;
    protected Button last_BT;
    protected Label label;
    protected Label label0;
    protected Label label1;
    protected Label label2;
    protected Label label3;
    protected Label label4;
    protected TextField id_TF;
    protected TextField fName_TF;
    protected TextField middelName_TF;
    protected TextField lName_TF;
    protected TextField email_TF;
    protected TextField phone_TF;

    boolean isNew = false;
    boolean isClea = false;
    Controller controler;
    Person person;

    //Author Amr
    public GUI(Controller controler) {
        
        this.controler=controler;
        new_BT = new Button();
        update_BT = new Button();
        delete_BT = new Button();
        first_BT = new Button();
        next_BT = new Button();
        prev_BT = new Button();
        last_BT = new Button();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        id_TF = new TextField();
        fName_TF = new TextField();
        middelName_TF = new TextField();
        lName_TF = new TextField();
        email_TF = new TextField();
        phone_TF = new TextField();
        
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        new_BT.setLayoutX(46.0);
        new_BT.setLayoutY(343.0);
        new_BT.setMnemonicParsing(false);
        new_BT.setText("new");

        update_BT.setLayoutX(127.0);
        update_BT.setLayoutY(343.0);
        update_BT.setMnemonicParsing(false);
        update_BT.setText("update");

        delete_BT.setLayoutX(205.0);
        delete_BT.setLayoutY(343.0);
        delete_BT.setMnemonicParsing(false);
        delete_BT.setText("delete");

        first_BT.setLayoutX(274.0);
        first_BT.setLayoutY(343.0);
        first_BT.setMnemonicParsing(false);
        first_BT.setPrefHeight(25.0);
        first_BT.setPrefWidth(39.0);
        first_BT.setText("first");

        next_BT.setLayoutX(341.0);
        next_BT.setLayoutY(343.0);
        next_BT.setMnemonicParsing(false);
        next_BT.setPrefHeight(25.0);
        next_BT.setPrefWidth(49.0);
        next_BT.setText("next");

        prev_BT.setLayoutX(420.0);
        prev_BT.setLayoutY(343.0);
        prev_BT.setMnemonicParsing(false);
        prev_BT.setText("prev");

        last_BT.setLayoutX(499.0);
        last_BT.setLayoutY(343.0);
        last_BT.setMnemonicParsing(false);
        last_BT.setText("last");

        label.setLayoutX(32.0);
        label.setLayoutY(83.0);
        label.setText("ID");

        label0.setLayoutX(32.0);
        label0.setLayoutY(126.0);
        label0.setText("First Name");

        label1.setLayoutX(32.0);
        label1.setLayoutY(167.0);
        label1.setText("Middel Name");

        label2.setLayoutX(32.0);
        label2.setLayoutY(208.0);
        label2.setText("Last Name");

        label3.setLayoutX(32.0);
        label3.setLayoutY(246.0);
        label3.setText("Email");

        label4.setLayoutX(32.0);
        label4.setLayoutY(281.0);
        label4.setText("Phone");

        id_TF.setLayoutX(106.0);
        id_TF.setLayoutY(79.0);

        fName_TF.setLayoutX(106.0);
        fName_TF.setLayoutY(122.0);
        fName_TF.setPrefHeight(25.0);
        fName_TF.setPrefWidth(211.0);

        middelName_TF.setLayoutX(106.0);
        middelName_TF.setLayoutY(163.0);
        middelName_TF.setPrefHeight(25.0);
        middelName_TF.setPrefWidth(211.0);

        lName_TF.setLayoutX(106.0);
        lName_TF.setLayoutY(204.0);
        lName_TF.setPrefHeight(25.0);
        lName_TF.setPrefWidth(211.0);

        email_TF.setLayoutX(104.0);
        email_TF.setLayoutY(242.0);
        email_TF.setPrefHeight(25.0);
        email_TF.setPrefWidth(211.0);

        phone_TF.setLayoutX(104.0);
        phone_TF.setLayoutY(277.0);
        phone_TF.setPrefHeight(25.0);
        phone_TF.setPrefWidth(211.0);

        getChildren().add(new_BT);
        getChildren().add(update_BT);
        getChildren().add(delete_BT);
        getChildren().add(first_BT);
        getChildren().add(next_BT);
        getChildren().add(prev_BT);
        getChildren().add(last_BT);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(id_TF);
        getChildren().add(fName_TF);
        getChildren().add(middelName_TF);
        getChildren().add(lName_TF);
        getChildren().add(email_TF);
        getChildren().add(phone_TF);
        
        
        
        
        
        showInForm(controler.firstRecord());

        new_BT.setOnAction((event) -> {
            clear();
            isNew = true;
        });
        next_BT.setOnAction((event) -> {
            showInForm(controler.nextRecord());
        });
        prev_BT.setOnAction((event) -> {
            showInForm(controler.previousRecord());
        });
        last_BT.setOnAction((event) -> {
            showInForm(controler.lastRecord());
        });
        first_BT.setOnAction((event) -> {
            showInForm(controler.firstRecord());
        });
        update_BT.setOnAction((event) -> {
            if (isNew) {
                person = getFromForm();
                controler.insetRow(person);
                System.out.println("Row inserted");
                isNew=false;
            } else {
                controler.updateRow(getFromForm());
                System.out.println("update done");
            }
            //clear();
            
        });
        delete_BT.setOnAction((event) -> {
            if (!isNew) {
                controler.deleteRow();
                showInForm(controler.nextRecord());
            }

        });

             
    }
     public void showInForm(Person person) {
        id_TF.setText(person.getId() + "");
        lName_TF.setText(person.getlName());
        fName_TF.setText(person.getfName());
        middelName_TF.setText(person.getmName());
        email_TF.setText(person.getEmail());
        phone_TF.setText(person.getPhone());
    }

    public Person getFromForm() {
        Person person2 = new Person();
        try{
        person2.setId(Integer.parseInt(id_TF.getText()));
        person2.setEmail(email_TF.getText());
        person2.setlName(lName_TF.getText());
        person2.setPhone(phone_TF.getText());
        person2.setmName(middelName_TF.getText());
        person2.setfName(fName_TF.getText());
        }catch(NumberFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
        return person2;
    }

    public void clear() {
        id_TF.setText("");
        lName_TF.setText("");
        fName_TF.setText("");
        middelName_TF.setText("");
        email_TF.setText("");
        phone_TF.setText("");
        isClea=true;

    }

}
