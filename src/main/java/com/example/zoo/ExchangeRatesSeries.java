package com.example.zoo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;

public class ExchangeRatesSeries {


    private String currency;
    private String code;
    private Rates[] rates;


    @Autowired
    public ExchangeRatesSeries() {
    }

    @Override
    public String toString() {
        return "ExchangeRatesSeries{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", rates=" + rates +
                '}';
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Rates[] getRates() {
        return rates;
    }

    public void setRates(Rates[] rates) {
        this.rates = rates;
    }
}
