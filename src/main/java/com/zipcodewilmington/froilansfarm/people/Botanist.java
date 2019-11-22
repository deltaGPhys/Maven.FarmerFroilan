package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Botanist<E extends Crop> extends Person {

    public Botanist(String name) {
        super(name);
    }

    public void plant(Class<E> cropClass, CropRow cropRow){
        cropRow.sow(cropClass);
    }
}
