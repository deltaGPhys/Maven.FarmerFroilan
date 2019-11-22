package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void CropDusterTest() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void CropDusterTest2() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Rideable);
    }

    @Test
    public void CropDusterTest3() {
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof NoiseMaker);
    }

    @Test
    public void MakeNoiseTest () {
        Assert.assertEquals("fhfhfh", CropDuster.MakeNoise());
    }

    @Test
    public void flyTest(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.fly();
        Assert.assertTrue(cropDuster.isFlying());
        cropDuster.land();
        Assert.assertFalse(cropDuster.isFlying());
    }

    @Test
    public void landTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertFalse(cropDuster.land());
    }

    @Test
    public void fertilizeTest() {
        CropDuster cropDuster = new CropDuster();
        Field field = new Field();
        new Farmer("John").plant(TomatoPlant.class, field.getCropRowList().get(0));
        CropRow<TomatoPlant> row = field.getCropRowList().get(0);
        row.getCropList().stream()
                .forEach( crop -> {
                    Assert.assertFalse(crop.getHasBeenFertilized());
                });
        cropDuster.fertilize(field);
        row.getCropList().stream()
                .forEach( crop -> {
                    Assert.assertTrue(crop.getHasBeenFertilized());
                });

    }
}

