package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Pilot extends Person {
    private Aircraft aircraft;

    public Pilot(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
    public Pilot(){

    }

    public Aircraft getAircraft() {
        return aircraft;
    }



    public void fly(Aircraft aircraft){
        //aircraft
        this.aircraft=aircraft;
    }
    public void stopFlying(){
        this.aircraft=null;
    }
}
