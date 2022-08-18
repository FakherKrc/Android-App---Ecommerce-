package com.example.ecommerce.model;

import android.util.Log;

import com.example.ecommerce.outils.AsynckResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Classe AccessDistant implements la Classe AsyncResponse
 */
public class AccesDistant implements AsynckResponse {

    private static final String SERVERADDR = "http://192.168.1.26/rest_coach/api/";

    private Controle controle;

    /**
     * Constructeur de la Classe AccesDistant
     */
    public AccesDistant(){
        controle = Controle.getInstance(null);
    }

    /**
     * Methode autogénérée
     * Affiche le retour du serveur distant
     * @param output
     */
    @Override
    public void processFinish(String output) {
        Log.d("serveur", "************" + output);
        try {
            JSONObject retour = new JSONObject(output);
            String message = retour.getString("message");
            if (!message.equals("OK")) {
                Log.d("erreur", "********* problème retour api rest :" + message);
            } else {
                JSONArray infos = retour.getJSONArray("result");
                ArrayList<Box> lesBoxs = new ArrayList<>();
                for (int k = 0; k < infos.length(); k++) {
                    JSONObject info = new JSONObject(infos.get(k).toString());
                    Integer idbox = info.getInt("idbox");

                    Integer prix = info.getInt("prix");
                    Integer idcategorie = info.getInt("idcategorie");
                    String libelle = info.getString("idprofil");
                    Integer idprofil = info.getInt("idprofil");
                    String srcImg = info.getString("image");
                    Box box = new Box(idbox, prix, idcategorie, libelle, idprofil, srcImg);
                    lesBoxs.add(box);
                }
                controle.setLesBoxs(lesBoxs);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Méthode d'envoi de données vers le serveur distant
     * @param operation
     * @param lesDonneesJSON
     */
    public void envoi(String operation, JSONObject lesDonneesJSON){
        AccesREST accesDonnees = new AccesREST();
        accesDonnees.delegate = this;
        String requesMethod = null;
        switch (operation){
            case "tous"  : requesMethod="GET"; break;
            case "enreg" : requesMethod="POST"; break;
            case "modif" : requesMethod="PUT"; break;
            case "suppr" : requesMethod="DELETE"; break;
            default: break;
        }
        if (requesMethod != null) {
            accesDonnees.setRequestMethod(requesMethod);
            accesDonnees.addParam("box");
            if (lesDonneesJSON != null) {
                accesDonnees.addParam(lesDonneesJSON.toString());
            }
            accesDonnees.execute(SERVERADDR);
        }
    }

}