package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farmer<E extends CropRow> extends Botanist {

    private Tractor tractor;

    public Farmer(String name) {
        super(name);
    }

    public Tractor getTractor() {
        return this.tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    @Override
    public void plant(Class cropClass, CropRow cropRow) {
        super.plant(cropClass, cropRow);
    }
}
