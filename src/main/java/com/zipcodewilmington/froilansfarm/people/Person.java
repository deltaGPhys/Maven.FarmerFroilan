package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Person implements Rider, Eater, NoiseMaker {
     private String name;
     private Rideable ridingDevice;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(Edible edible) {

        return "yum";
    }

    public String makeNoise() {
        return "blah blah blah";
    }



    public void mount(Rideable rideable) {
       this.ridingDevice=ridingDevice;
    }

    public void dismount() {
        this.ridingDevice=null;

    }
}
