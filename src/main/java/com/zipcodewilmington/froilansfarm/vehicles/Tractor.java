package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.farm.Field;

public class Tractor extends FarmVehicle {

    public static String MakeNoise() {
        return "prprpr";
    }

    @Override
    public boolean Ridable() {
        return false;
    }

    public void harvest(Field field){

    }

}
