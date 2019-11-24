package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;

import java.util.ArrayList;
import java.util.Random;

public class CornStalk extends Crop {

    private static int lowerBoundYield = 2;
    private static int upperBoundYield = 10;

    public static int getLowerBoundYield() {
        return lowerBoundYield;
    }

    public static int getUpperBoundYield() {
        return upperBoundYield;
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

    public EarCorn growAFruit() {
        return new EarCorn();
    }
}
