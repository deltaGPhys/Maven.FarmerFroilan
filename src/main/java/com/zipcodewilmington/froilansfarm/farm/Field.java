package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    //List of CropRow
    List<CropRow> cropRowList;

    public void remove(CropRow cropRow) {cropRowList.remove(cropRow); }
    //size
    public void add(CropRow cropRow){
        cropRowList.add(cropRow);
    }
}
