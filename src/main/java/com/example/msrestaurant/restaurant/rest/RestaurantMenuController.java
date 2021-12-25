package com.example.msrestaurant.restaurant.rest;

import com.example.msrestaurant.restaurant.rest.models.Menu;
import com.example.msrestaurant.restaurant.rest.models.MenuPriceInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/restaurant/menu")
public class RestaurantMenuController {

    @Value("${server.port}")
    private int port;

    @PostMapping("/calculate")
    public MenuPriceInfo calculate(@RequestBody final Menu menu) {
        MenuPriceInfo menuPriceInfo = new MenuPriceInfo();
        menuPriceInfo.setPrice(120);
        menuPriceInfo.setPort(port);
        return menuPriceInfo;
    }
}
