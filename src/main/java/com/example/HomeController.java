package com.example;

import com.example.models.MenuItems;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Ben on 4/7/17.
 */
@RestController
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public MenuItems homePage() {
        return new RestTemplate().getForObject("http://www.fueleconomy.gov/ws/rest/vehicle/menu/year", MenuItems.class);
    }
}
