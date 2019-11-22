package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.Field;

import java.util.ArrayList;

public class Tractor extends FarmVehicle {

    public static String MakeNoise() {
        return "prprpr";
    }

    public ArrayList<Edible> harvest(Field field){
        ArrayList<Edible> yield = new ArrayList<>();
        field.getCropRowList().stream()
                .flatMap( row -> row.getCropList().stream())
                .forEach( crop -> {
                    yield.addAll(((Crop) crop).yield());
                });
        return yield;
    }

}
