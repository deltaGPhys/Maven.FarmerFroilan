package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;

import java.util.ArrayList;
import java.util.Random;

public class CornStalk extends Crop {

    private static int lowerBoundYield = 2;
    private static int upperBoundYield = 10;

    public EarCorn growAFruit() {
        return new EarCorn();
    }
}
