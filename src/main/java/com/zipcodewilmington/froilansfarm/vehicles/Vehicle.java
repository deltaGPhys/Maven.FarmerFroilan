package com.zipcodewilmington.froilansfarm.vehicles;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Vehicle implements Rideable, NoiseMaker {
public boolean isRiding;



    public String makeNoise() {
        return "";
    }


    public boolean mount(Rideable rideable) {
    isRiding = true;
    return isRiding;

    }

    public boolean dismount() {
        isRiding = false;
        return isRiding;

    }
}
