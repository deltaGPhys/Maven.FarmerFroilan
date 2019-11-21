package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farmer extends Botanist {
Tractor tractor;

    public Farmer(Tractor tractor) {
        this.tractor = tractor;
    }
    public Farmer(){

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
