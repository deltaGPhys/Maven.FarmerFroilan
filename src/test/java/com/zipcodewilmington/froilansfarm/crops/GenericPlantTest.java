package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.GenericFruit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GenericPlantTest {
    Crop plant;

    @Before
    public void setUp() throws Exception {
        plant = new Crop();
    }

    @Test
    public void constructorTest() {
        Assert.assertTrue(plant instanceof Crop);
        Assert.assertTrue(plant.getHasBeenHarvested());
        Assert.assertFalse(plant.getHasBeenFertilized());
        Assert.assertEquals(0,plant.getFruit().size());
    }

    @Test
    public void growAFruitTest() {
        Assert.assertTrue(plant.growAFruit() instanceof GenericFruit);
    }

    @Test
    public void growFoodTest() {
        plant.growFood();
        ArrayList<GenericFruit> output = plant.getFruit();
        for (int i = 0; i < 100; i++) {
            Assert.assertTrue(output.size() >= plant.getLowerBoundYield());
            Assert.assertTrue(output.size() <= plant.getUpperBoundYield());
            for (int j = 0; j < output.size(); j++) {
                Assert.assertTrue(output.get(j) instanceof GenericFruit);
            }
        }
    }

    @Test
    public void yieldTestNull() {
        Assert.assertNull(plant.yield());
    }

    @Test
    public void yieldTest() {
        Assert.assertTrue(plant.getHasBeenHarvested());
        plant.beFertilized();
        Assert.assertFalse(plant.getHasBeenHarvested());
        ArrayList<GenericFruit> output = plant.yield();
        for (int i = 0; i < 100; i++) {
            Assert.assertTrue(output.size() >= plant.getLowerBoundYield());
            Assert.assertTrue(output.size() <= plant.getUpperBoundYield());
            for (int j = 0; j < output.size(); j++) {
                Assert.assertTrue(output.get(j) instanceof GenericFruit);
            }
        }
        Assert.assertTrue(plant.getHasBeenHarvested());

    }

    @Test
    public void fertilizeTest() {
        Assert.assertFalse(plant.getHasBeenFertilized());
        plant.beFertilized();
        Assert.assertTrue(plant.getHasBeenFertilized());
        Assert.assertTrue(plant.getFruit().size() >= plant.getLowerBoundYield());
        Assert.assertTrue(plant.getFruit().size() <= plant.getUpperBoundYield());
    }
}
