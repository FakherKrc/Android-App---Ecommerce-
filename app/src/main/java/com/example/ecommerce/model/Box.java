package com.example.ecommerce.model;

public class Box {

    private int idbox;
    private String srcImg;
    private int prix;
    private int idcategorie;
    private String libelle;

    public String getSrcImg() {
        return srcImg;
    }


    public void setSrcImg(String srcImg) {
        this.srcImg = srcImg;
    }

    private int idprofil;

    public Box(int idbox, int prix, int idcategorie, String libelle, int idprofil, String srcImg) {
        this.idbox = idbox;
        this.srcImg = srcImg;
        this.prix = prix;
        this.idcategorie = idcategorie;
        this.libelle = libelle;
        this.idprofil = idprofil;
    }

    public int getIdbox() {
        return idbox;
    }

    public void setIdbox(int idbox) {
        this.idbox = idbox;
    }



    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIdprofil() {
        return idprofil;
    }

    public void setIdprofil(int idprofil) {
        this.idprofil = idprofil;
    }
}

