package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    /**
     * Returns the number of cities in the list
     * @return int count of cities
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * This adds a city object to the list
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
    }

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}