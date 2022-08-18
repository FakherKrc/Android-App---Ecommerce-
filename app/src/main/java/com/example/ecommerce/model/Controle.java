package com.example.ecommerce.model;

import android.content.Context;

import java.util.ArrayList;

public class Controle {

    private static Controle instance = null;
    private ArrayList<Box> lesBoxs = new ArrayList<Box>();
    private Box uneBox = null;
    private static AccesDistant accesDistant;


    /**
     * constructeur privé
     */
    private Controle(Context contexte) {
        super();

    }

    public ArrayList<Box> getLesBoxs() {
        return lesBoxs;
    }

    public void setLesBoxs(ArrayList<Box> lesBoxs) {
        this.lesBoxs = lesBoxs;

    }

    /**
     * récupération de l'instance unique de Controle
     *
     * @return instance
     * @Param contexte
     */
    public static final Controle getInstance(Context contexte) {
        if (Controle.instance == null) {
            Controle.instance = new Controle(contexte);
            sqlQuery sqlquery = new sqlQuery();
            sqlquery.envoi();

        }
        return Controle.instance;
    }

}