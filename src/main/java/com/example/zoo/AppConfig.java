package com.example.zoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    public AppConfig(){
    }
    @Bean
    GoldPrice goldPrice(){
        return new GoldPrice();
    }
    @Bean
    ExchangeRatesSeries exchangeRatesSeries() {return new ExchangeRatesSeries();}
    @Bean
    Rates rates() { return new Rates();}

}
