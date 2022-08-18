package com.example.ecommerce.model;

import android.os.AsyncTask;

import com.example.ecommerce.outils.AsynckResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AsynckConnectionDB extends AsyncTask<String, Void, ResultSet> {
    private Statement statement;
    private ResultSet result;
    private sqlQuery delegate;
    private static final String dbURL = "jdbc:mysql://3.88.49.183:3306/mediatekformations";
    private static final String password = "password";
    private static final String user ="roots";
    private Connection connection;

    public AsynckConnectionDB(sqlQuery delegate){
        this.delegate = delegate;
    }

    @Override
    protected void onPostExecute(ResultSet resultSet) {
        delegate.getAllBoxs(this.result);

    }

    @Override
    protected ResultSet doInBackground(String... strings) {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection(dbURL, user, password);

            Statement statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
