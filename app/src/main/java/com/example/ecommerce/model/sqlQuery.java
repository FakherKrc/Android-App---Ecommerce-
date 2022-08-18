package com.example.ecommerce.model;

import android.util.Log;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class sqlQuery {

    private Statement statement;
    private Box box;
    private List<Box> lstBox;
    public static sqlQuery sqlquery;

    public sqlQuery(){
        super();
    }



    public List<Box> getAllBoxs(ResultSet result){

        Log.d("serveur", result.toString());
        List<Box> lstBox = new LinkedList<Box>();
        try {

            while(result.next()){
                Integer idbox = result.getInt("idbox");
                Integer prix = result.getInt("prix");
                Integer idcategorie = result.getInt("idcategorie");
                String libelle = result.getString("idprofil");
                Integer idprofil = result.getInt("idprofil");
                String srcImg = result.getString("image");
                Box box = new Box(idbox, prix, idcategorie, libelle, idprofil, srcImg);
                lstBox.add(box);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return lstBox;

    }

    public void envoi(){
        String query = "Select * FROM box";
        AsynckConnectionDB asynckDB = new AsynckConnectionDB(this);
        asynckDB.execute(query);

    }



}
