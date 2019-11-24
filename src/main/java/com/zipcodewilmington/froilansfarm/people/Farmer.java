package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farmer extends Botanist {

//    private Rideable riding;

    public Farmer(String name) {
        super(name);
    }

//    public Rideable getRiding() {
//        return this.riding;
//    }

//    public void setRiding(Rideable riding) {
//        this.riding = riding;
//    }

    @Override
    public String eat(Edible edible) {
        return "Yum! Fuel for a farmer!";
    }

    @Override
    public String makeNoise() {
        return "Early to bed, early to rise...";
    }
//
//    @Override
//    public void mount(Rideable rideable) {
//        this.ridingDevice = rideable;
//    }
//
//    @Override
//    public void dismount() {
//        this.riding = null;
//    }

    @Override
    public void plant(Class cropClass, CropRow cropRow) {
        super.plant(cropClass, cropRow);
    }
}
