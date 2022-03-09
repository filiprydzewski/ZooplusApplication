package com.example.zoo;

import com.example.zoo.exceptions.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/api")

public class AppController {


    RestTemplate restTemplate = new RestTemplate();


    private final AppService appService;

    @Autowired
    public AppController(AppService appService) {
        this.appService = appService;
    }

    @GetMapping("/gold-price/avarage")
    public ModelAndView goldPrice(@RequestParam(name= "price", required = false) GoldPrice[] price, Model model) {
            price = appService.getGold();
            model.addAttribute("price", price);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("avgGoldPrice.html");
            return modelAndView;
    }

    @GetMapping("/exchange-rates/{code}")
    public ModelAndView exchangeRate(@PathVariable("code") String code, @RequestParam(name="ExchangeRatesSeries", required = false) ExchangeRatesSeries exchangeRatesSeries, Model model ) {
        try {
            exchangeRatesSeries = appService.getExchangeRatesSeries("http://api.nbp.pl/api/exchangerates/rates/c/" + code + "/last/5");
            Rates[] rates;
            rates = exchangeRatesSeries.getRates();
            model.addAttribute("exchangeRatesSeries", exchangeRatesSeries);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("currencyExchange.html");
            return modelAndView;
        } catch (Exception catchAllException){throw new ApiException("Wrong URL");}
    }




}
