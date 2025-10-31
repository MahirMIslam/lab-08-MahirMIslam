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

    /**
     * Checks if a city is in the list
     * @param city
     * @return boolean
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
}