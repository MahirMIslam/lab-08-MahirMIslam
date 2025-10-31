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
        assertFalse(list.hasCity(city)); // Should be false before adding
        list.addCity(city);
        assertTrue(list.hasCity(city)); // Should be true after adding
    }
}