package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable , Eater {


    @Override
    public String eat(Edible edible) {
        return "Yum! Corn! I'm a happy horse yeehaw!";
    }

    public String makeNoise(){
        return "Neigh!";
    }


}
