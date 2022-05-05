package ua.lviv.iot.gardeningshop.manager.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.gardeningshop.models.Fertilizer;
import ua.lviv.iot.gardeningshop.models.Good;
import ua.lviv.iot.gardeningshop.models.Hose;
import ua.lviv.iot.gardeningshop.models.Seeds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GardeningShopManagerTest {

    private final GardeningShopManager manager = new GardeningShopManager();
    private final List<Good> list = new ArrayList<>();
    private final Hose hose = new Hose("shneider",20,"hoses",20);
    private final Fertilizer fert = new Fertilizer("phosphate",10,"fertilizers",5);
    private final Seeds seeds = new Seeds("tomato seeds",30,"seeds",50);

    @BeforeEach
    void setUp() {

        list.add(hose);
        list.add(fert);
        list.add(seeds);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sortGoodsByCategoryAsc() {
        List<Good> listTest = Arrays.asList(fert, hose, seeds);
        List<Good> sortedGoodsByCategory = manager.sortGoodsByCategory(list, false);
        Assertions.assertEquals(listTest, sortedGoodsByCategory);
    }
    @Test
    void sortGoodsByCategoryDesc() {
        List<Good> listTest = Arrays.asList(seeds,hose,fert);
        List<Good> sortedGoodsByCategory = manager.sortGoodsByCategory(list, true);
        Assertions.assertEquals(listTest, sortedGoodsByCategory);
    }

    @Test
    void sortGoodsByQuantityAsc() {
        List<Good> listTest = Arrays.asList(fert, hose, seeds);
        List<Good> sortedGoodsByQuantity = manager.sortGoodsByQuantity(list, false);
        Assertions.assertEquals(listTest, sortedGoodsByQuantity);
    }

    @Test
    void sortGoodsByQuantityDesc() {
        List<Good> listTest = Arrays.asList(seeds, hose, fert);
        List<Good> sortedGoodsByQuantity = manager.sortGoodsByQuantity(list, true);
        Assertions.assertEquals(listTest, sortedGoodsByQuantity);
    }
}