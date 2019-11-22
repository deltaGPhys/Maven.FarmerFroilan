package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Botanist extends Person {


    public Botanist(String name) {
        super(name);
    }

    public void plant(Crop crop, CropRow cropRow){
        for(int i=0;i<19;i++){
            cropRow.add(crop);
        }

    }
}
