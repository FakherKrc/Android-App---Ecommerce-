package com.example.ecommerce.model;

import android.content.Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexionDB {

    private static final String dbURL = "jdbc:mysql://127.0.0.1:3306/eccommerce?verifyServerCertificate=false&useSSL=false";
            private static final String password = "password";
    private static final String user ="root2";


    private static Connection connection;

    private connexionDB(){

    }

    public static Connection GetInstanceConnDB(){
        if(connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(dbURL, user, password);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void CloseConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

}
