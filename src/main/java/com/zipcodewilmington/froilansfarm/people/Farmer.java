package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farmer extends Botanist {
Tractor tractor;

//it happened when i created a field "name" in farmer
    public Farmer(Tractor tractor) {

        this.tractor = tractor;
    }


    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    public void plant (Crop crop, CropRow cropRow){
        //plant
     cropRow.add(crop);
    }
}
