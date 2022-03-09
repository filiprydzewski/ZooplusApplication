package com.example.zoo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service


public class AppService {
    private final GoldPrice goldPrice;
    private final ExchangeRatesSeries exchangeRatesSeries;
    private final Rates rates;


    RestTemplate restTemplate = new RestTemplate();

    public AppService(GoldPrice goldPrice, ExchangeRatesSeries exchangeRatesSeries, Rates rates){
        this.goldPrice = goldPrice;
        this.exchangeRatesSeries = exchangeRatesSeries;
        this.rates = rates;
    }

    public GoldPrice[] getGold() {

        return this.restTemplate.getForObject("http://api.nbp.pl/api/cenyzlota/last/14", GoldPrice[].class);

    }
    public ExchangeRatesSeries getExchangeRatesSeries(String url){

        return this.restTemplate.getForObject(url, ExchangeRatesSeries.class);
    }

}
