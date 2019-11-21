package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Person implements Rider, Eater, NoiseMaker {

    public String eat(Edible edible) {
        return null;
    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {

    }

    public void dismount() {

    }
}
