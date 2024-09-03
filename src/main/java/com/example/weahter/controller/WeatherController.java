package com.example.weather.controller;

import com.example.weather.service.WeatherService;
import com.example.weather.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam("city") String city, Model model) {
        WeatherResponse response = weatherService.getWeather(city);
        model.addAttribute("weather", response);
        return "weather"; // Thymeleaf şablonunun adı
    }
}