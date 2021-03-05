package com.example.googlevisionapi;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;


public class PaisesCor {
    private String nombrePais;
    private String url_Pais;
    private double []  coordenadasPais;


    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getUrl_Pais() {
        return url_Pais;
    }

    public void setUrl_Pais(String url_Pais) {
        this.url_Pais = url_Pais;
    }

    public Paises(String npais,String nurl,double [] ncoordenadasPais) throws JSONException {
        nombrePais = npais;
        url_Pais = nurl;
        coordenadasPais=ncoordenadasPais;
    }
}
