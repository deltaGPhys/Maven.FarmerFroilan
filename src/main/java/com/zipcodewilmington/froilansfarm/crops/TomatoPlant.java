package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;

import java.util.Random;

public class TomatoPlant extends Crop<Tomato> {

    private static int lowerBoundYield = 5;
    private static int upperBoundYield = 20;

    public static int getLowerBoundYield() {
        return lowerBoundYield;
    }

    public static int getUpperBoundYield() {
        return upperBoundYield;
    }

    @Override
    public Tomato growAFruit() {
        return new Tomato();
    }

    @Override
    public void growFood() {
        Random random = new Random();
        int fruitNum = random.nextInt(this.upperBoundYield-this.lowerBoundYield) + this.lowerBoundYield;
        for (int i = 0; i < fruitNum; i++) {
            this.fruit.add(growAFruit());
        }
        this.hasBeenHarvested = false;
    }
}
