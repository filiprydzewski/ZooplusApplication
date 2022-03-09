package com.example.zoo;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class GoldPrice implements Serializable {

    private String data;
    private Float cena;


    @Autowired
    public GoldPrice() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Float getCena() {
        return cena;
    }

    public void setCena(Float cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "CenaZlota{" +
                "data='" + data + '\'' +
                ", cena=" + cena +
                '}';
    }
}
