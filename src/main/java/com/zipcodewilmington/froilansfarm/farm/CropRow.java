package com.zipcodewilmington.froilansfarm.farm;


import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    //List of Crop
    private List<Crop> cropRowList;

    public List<Crop> getCropRowList() {
        return cropRowList;
    }

<<<<<<< HEAD
   // List<Crop> CropRowList = new List<>crops;
=======
>>>>>>> 5f5298208831e40d024070576570590e81f7664d

    public void setCropRowList(List<Crop> cropRowList) {
        this.cropRowList = cropRowList;
    }

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
