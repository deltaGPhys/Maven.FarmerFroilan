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
<<<<<<< HEAD

        return "yum";
    }

    public String makeNoise() {
        return "blah blah blah";
=======
        return "Yum! Fuel for a Farmer!";
    }

    public String makeNoise() {
        return "E I E I OH ~ ";
>>>>>>> 59fff0d7ef6ceef0586ca15544ecf5a7ff23e106
    }



    public void mount(Rideable rideable) {
       this.ridingDevice=ridingDevice;
    }

    public void dismount() {
        this.ridingDevice=null;

    }
}
