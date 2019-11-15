package com.zipcodewilmington.froilansfarm.vehicles;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Vehicle implements Rider, NoiseMaker {

    public String makeNoise() {
        return null;
    }


    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }
}
