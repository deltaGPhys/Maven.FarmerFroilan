package com.zipcodewilmington.froilansfarm.farm;


import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    //List of Crop
    private List<Crop> cropRowList;

    //add
    public void add(Crop crop){
        cropRowList.add(crop);
    }

}
