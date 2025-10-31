package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * Creates a mock CustomList for testing
     * @return CustomList object
     */
    public CustomList MockCityList() {
        list = new CustomList();
        return list;
    }

    /**
     * Test the addCity method
     * Verifies that adding a city increases the list size by 1
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.getCount());
    }

    /**
     * Test the hasCity method
     * Verifies that hasCity returns true for cities in the list
     * and false for cities not in the list
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Regina", "SK");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * Test the deleteCity method
     * Verifies that deleting a city removes it from the list
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Saskatoon", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
        assertEquals(0, list.getCount());
    }

    /**
     * Test the countCities method
     * Verifies that countCities returns the correct number of cities
     */
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        assertEquals(0, list.countCities()); // Empty list
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(1, list.countCities()); // One city
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.countCities()); // Two cities
        list.addCity(new City("Vancouver", "BC"));
        assertEquals(3, list.countCities()); // Three cities
    }
}