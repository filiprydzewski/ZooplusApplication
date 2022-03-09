package com.example.zoo;

import org.springframework.beans.factory.annotation.Autowired;

public class Rates {

    private String effectiveDate;
    private float bid;
    private float ask;

    @Override
    public String toString() {
        return "Rates{" +
                "effectiveDate='" + effectiveDate + '\'' +
                ", bid=" + bid +
                ", ask=" + ask +
                '}';
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public float getBid() {
        return bid;
    }

    public void setBid(float bid) {
        this.bid = bid;
    }

    public float getAsk() {
        return ask;
    }

    public void setAsk(float ask) {
        this.ask = ask;
    }

    @Autowired
    public Rates() {
    }
}
