package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> cropRowList;

    public Field() {
        this.cropRowList = new ArrayList<CropRow>();
        for (int i = 0; i < 5; i++) {
            this.cropRowList.add(new CropRow());
        }
    }

    public void add(CropRow cropRow){
        this.cropRowList.add(cropRow);
    }

    public List<CropRow> getCropRowList() {
        return this.cropRowList;
    }
}
