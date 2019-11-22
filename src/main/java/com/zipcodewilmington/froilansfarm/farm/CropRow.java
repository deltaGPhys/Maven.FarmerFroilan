package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<E extends Crop> {

    private List<E> cropList;

    public CropRow() {
        this.cropList = new ArrayList<E>();
    }

    public List<E> getCropList() {
        return this.cropList;
    }

    public void setCropList(List<E> cropList) {
        this.cropList = cropList;
    }

    public void sow(Class<E> cropClass) {

        for (int i = 0; i < 20; i++) {
            try {
                this.cropList.add(cropClass.newInstance());
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
