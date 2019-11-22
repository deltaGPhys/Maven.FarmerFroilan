package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;

public abstract class FarmVehicle extends Vehicle {

    private Farm farm;

    public void operate(Farm farm) {
        this.farm = farm;
    }

    public Farm getFarm() {
        return farm;
    }
}
