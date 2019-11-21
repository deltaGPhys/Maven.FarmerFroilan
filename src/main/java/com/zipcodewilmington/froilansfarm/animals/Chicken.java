package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce {

    Egg edibleEgg = new Egg();
    ArrayList<Egg> eggBasket;
    boolean hasBeenFertilized;
    boolean hasBeenHarvested;

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
        return eggBasket;
    }

    @Override
    public void growFood() {
        eggBasket.add(edibleEgg);
        hasBeenHarvested = false;
    }

    @Override
    public void beFertilized() {
//        if (!hasBeenFertilized){
//            growFood();
//        }
    }
}
