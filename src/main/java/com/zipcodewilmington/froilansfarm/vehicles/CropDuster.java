package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;

import java.util.List;

public class CropDuster extends Aircraft {

    public CropDuster() {
    }

    public static String MakeNoise() {
        return "fhfhfh";
    }

    public void fertilize(Field field){
        field.getCropRowList().stream()
            .flatMap(row -> row.getCropList().stream())
            .forEach( crop -> ((Crop) crop).beFertilized());
    }

}
