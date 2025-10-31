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
}