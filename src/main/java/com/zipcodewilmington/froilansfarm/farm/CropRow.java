package com.zipcodewilmington.froilansfarm.farm;


import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    //List of Crop
    private List<Crop> cropRowList;

    List<Crop> getCropRowList = new List<>cropRowList;


    //add
    public void add(Crop crop) {

        for (int i = 0; i < 20; i++) {

            try {

                cropRowList.add(crop.getClass().newInstance());
           } catch(Exception e){
                e.printStackTrace();
            }


        }
    }

}
