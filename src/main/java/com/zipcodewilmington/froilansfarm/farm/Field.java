package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    //List of CropRow
    List<CropRow> cropRowList;
    //add
    //remove
    //size
    public void add(CropRow cropRow){
        cropRowList.add(cropRow);
    }
}
