package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farmer extends Botanist {

    private Tractor tractor;

    public Farmer(String name) {
        super(name);
    }

    public Tractor getTractor() {
        return this.tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    @Override
    public String eat(Edible edible) {
        return "Yum! Fuel for a farmer!";
    }

    @Override
    public String makeNoise() {
        return "Early to bed, early to rise...";
    }

    @Override
    public void plant(Class cropClass, CropRow cropRow) {
        super.plant(cropClass, cropRow);
    }
}
