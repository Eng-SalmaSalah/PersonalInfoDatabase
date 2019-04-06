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

    protected Button new_Btn;
    protected Button update_Btn;
    protected Button delete_Btn;
    protected Button first_Btn;
    protected Button next_Btn;
    protected Button prev_Btn;
    protected Button last_Btn;
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

    //Author Amr
    public GUI() {
        new_Btn = new Button();
        update_Btn = new Button();
        delete_Btn = new Button();
        first_Btn = new Button();
        next_Btn = new Button();
        prev_Btn = new Button();
        last_Btn = new Button();
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

        new_Btn.setLayoutX(46.0);
        new_Btn.setLayoutY(343.0);
        new_Btn.setMnemonicParsing(false);
        new_Btn.setText("new");

        update_Btn.setLayoutX(127.0);
        update_Btn.setLayoutY(343.0);
        update_Btn.setMnemonicParsing(false);
        update_Btn.setText("update");

        delete_Btn.setLayoutX(205.0);
        delete_Btn.setLayoutY(343.0);
        delete_Btn.setMnemonicParsing(false);
        delete_Btn.setText("delete");

        first_Btn.setLayoutX(274.0);
        first_Btn.setLayoutY(343.0);
        first_Btn.setMnemonicParsing(false);
        first_Btn.setPrefHeight(25.0);
        first_Btn.setPrefWidth(39.0);
        first_Btn.setText("first");

        next_Btn.setLayoutX(341.0);
        next_Btn.setLayoutY(343.0);
        next_Btn.setMnemonicParsing(false);
        next_Btn.setPrefHeight(25.0);
        next_Btn.setPrefWidth(49.0);
        next_Btn.setText("next");

        prev_Btn.setLayoutX(420.0);
        prev_Btn.setLayoutY(343.0);
        prev_Btn.setMnemonicParsing(false);
        prev_Btn.setText("prev");

        last_Btn.setLayoutX(499.0);
        last_Btn.setLayoutY(343.0);
        last_Btn.setMnemonicParsing(false);
        last_Btn.setText("last");

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

        getChildren().add(new_Btn);
        getChildren().add(update_Btn);
        getChildren().add(delete_Btn);
        getChildren().add(first_Btn);
        getChildren().add(next_Btn);
        getChildren().add(prev_Btn);
        getChildren().add(last_Btn);
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
             
    }

}
