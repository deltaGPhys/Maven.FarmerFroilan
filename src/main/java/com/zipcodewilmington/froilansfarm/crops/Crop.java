package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Crop implements Produce {
    Boolean hasBeenFertilized;
    Boolean hasBeenHarvested;

    public Edible yield() {
        return null;
    }
}
