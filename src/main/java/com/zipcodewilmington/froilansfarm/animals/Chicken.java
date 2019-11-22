package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;
import java.util.Random;

public class Chicken extends Animal implements Produce {

    private ArrayList<Egg> eggBasket;
    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Chicken(){
        this.eggBasket = new ArrayList<>();
        this.hasBeenFertilized = false;
    }

    public String makeNoise(){
        return "Bok bok";
    }

    @Override
    public ArrayList yield() {
        hasBeenHarvested = true;
        ArrayList<Egg> eggs = (ArrayList<Egg>) this.eggBasket.clone();
        this.eggBasket.clear();
        return eggs;
    }

    @Override
    public void growFood() {
        if (!this.hasBeenFertilized) {
            for (int i = 0; i < 2+new Random().nextInt(4); i++) {
                eggBasket.add(new Egg());
            }
            hasBeenHarvested = false;
        }
    }

    @Override
    public void beFertilized() {
        this.hasBeenFertilized = true;
    }
}
