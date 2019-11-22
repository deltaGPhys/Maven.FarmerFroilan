package com.zipcodewilmington.froilansfarm.vehicles;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Vehicle implements Rideable, NoiseMaker {

    public String makeNoise() {
        return "";
    }


    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }
}
