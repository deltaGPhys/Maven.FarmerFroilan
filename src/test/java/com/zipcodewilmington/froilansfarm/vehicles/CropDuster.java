package com.zipcodewilmington.froilansfarm.vehicles;

import org.junit.Assert;
import org.junit.Test;

public class CropDuster {

    @Test
    public void CropDusterTest() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof CropDuster);
    }
}
