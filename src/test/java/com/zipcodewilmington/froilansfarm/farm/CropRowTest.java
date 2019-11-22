package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void CropRow(){
        CropRow cropRow = new CropRow();
        Assert.assertTrue(cropRow instanceof CropRow);
    }

    @Test
    public void addCropTest() {
        CropRow cropRow = new CropRow();
        cropRow.sow(Tomato.class);

    }
}


