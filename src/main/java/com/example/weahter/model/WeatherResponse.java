package com.example.weather.model;

public class WeatherResponse {
    // JSON yanıtından beklenen alanlar burada tanımlanmalıdır
    private String main;
    private String description;

    // Getter ve Setter metodları
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}