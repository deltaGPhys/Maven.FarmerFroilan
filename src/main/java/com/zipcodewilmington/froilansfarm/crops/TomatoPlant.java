package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;

public class TomatoPlant extends Crop<Tomato> {

    private static int lowerBoundYield = 5;
    private static int upperBoundYield = 20;

    @Override
    public Tomato growAFruit() {
        return new Tomato();
    }
}
