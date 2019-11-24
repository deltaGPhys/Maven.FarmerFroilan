package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.GenericFruit;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;
import java.util.Random;

public class Crop<E extends Edible> implements Produce {

    ArrayList<E> fruit;
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;
    private static int lowerBoundYield = 1;
    private static int upperBoundYield = 6;

    public Crop() {
        this.fruit = new ArrayList<E>();
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = true;
    }

    public ArrayList<E> getFruit() {
        return fruit;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public static int getLowerBoundYield() {
        return lowerBoundYield;
    }

    public static int getUpperBoundYield() {
        return upperBoundYield;
    }

    @Override
    public void beFertilized() {
        this.hasBeenFertilized = true;
        this.growFood();
    }

    public ArrayList<E> yield() {
        if (this.hasBeenFertilized) {
            this.hasBeenFertilized = false;
            this.hasBeenHarvested = true;
            ArrayList<E> food = (ArrayList<E>) this.fruit.clone();
            this.fruit.clear();
            return food;
        }
        return null;
    }

    public void growFood() {
        Random random = new Random();
        int fruitNum = random.nextInt(this.upperBoundYield-this.lowerBoundYield) + this.lowerBoundYield;
        for (int i = 0; i < fruitNum; i++) {
            this.fruit.add((E) growAFruit());
        }
        this.hasBeenHarvested = false;
    }

    public E growAFruit() {
        return (E) new GenericFruit();
    }

}
