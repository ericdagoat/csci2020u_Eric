package com.example.lab04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        //Creating labels and text fields
        Label Username = new Label("Username:");
        TextField tfUsername = new TextField();
        Label Password = new Label("Password:");
        PasswordField tfPassword = new PasswordField();
        Label fullName = new Label("Full Name:");
        TextField tfFullName = new TextField();
        Label eMail = new Label("E-Mail:");
        TextField tfEMail = new TextField();
        Label phoneNumber = new Label("Phone #:");
        TextField tfPhoneNumber = new TextField();
        Label Birthday = new Label("Date of Birth:");
        DatePicker tfBirthday = new DatePicker();

        // Add a button
        Button Register = new Button("Register");

        //Setting the position
        Username.setTranslateX(20);
        tfUsername.setTranslateX(95);
        Username.setTranslateY(25);
        tfUsername.setTranslateY(25);

        Password.setTranslateX(20);
        tfPassword.setTranslateX(95);
        Password.setTranslateY(65);
        tfPassword.setTranslateY(65);

        fullName.setTranslateX(20);
        tfFullName.setTranslateX(95);
        fullName.setTranslateY(105);
        tfFullName.setTranslateY(105);

        eMail.setTranslateX(20);
        tfEMail.setTranslateX(95);
        eMail.setTranslateY(145);
        tfEMail.setTranslateY(145);

        phoneNumber.setTranslateX(20);
        tfPhoneNumber.setTranslateX(95);
        phoneNumber.setTranslateY(185);
        tfPhoneNumber.setTranslateY(185);

        Birthday.setTranslateX(20);
        tfBirthday.setTranslateX(95);
        Birthday.setTranslateY(225);
        tfBirthday.setTranslateY(225);

        Register.setTranslateX(95);
        Register.setTranslateY(265);

        Group root = new Group();
        root.getChildren().add(Username);
        root.getChildren().add(tfUsername);
        root.getChildren().add(Password);
        root.getChildren().add(tfPassword);
        root.getChildren().add(fullName);
        root.getChildren().add(tfFullName);
        root.getChildren().add(eMail);
        root.getChildren().add(tfEMail);
        root.getChildren().add(phoneNumber);
        root.getChildren().add(tfPhoneNumber);
        root.getChildren().add(Birthday);
        root.getChildren().add(tfBirthday);

        root.getChildren().add(Register);

        //Setting the stage
        Scene scene = new Scene(root, 595, 350);
        stage.setTitle("Lab 04 Solution");
        stage.setScene(scene);
        stage.show();


        // On register click, console log all the inputs
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println(tfUsername.getText());
                System.out.println(tfPassword.getText());
                System.out.println(tfFullName.getText());
                System.out.println(tfEMail.getText());
                System.out.println(tfPhoneNumber.getText());
                System.out.println(tfBirthday.getValue());
            }
        };

        // trigger the event on register click
        Register.setOnAction(event);
    }

    public static void main(String[] args) {
        launch();
    }
}