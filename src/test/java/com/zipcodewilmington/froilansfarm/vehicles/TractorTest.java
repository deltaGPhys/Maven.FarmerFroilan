package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TractorTest {

    @Test
    public void TractorTest() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Tractor);
    }

    @Test
    public void TractorTest2() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }

    @Test
    public void TractorTest3() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof NoiseMaker);
    }
    @Test
    public void TractorTest4() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }

    @Test
    public void MakeNoiseTest () {
        Tractor tractor = new Tractor();
        Assert.assertEquals("prprpr", Tractor.MakeNoise());
    }

    @Test
    public void harvestTest() {
        CropDuster cropDuster = new CropDuster();
        Field field = new Field();
        new Farmer("John").plant(TomatoPlant.class, field.getCropRowList().get(0));
        cropDuster.fertilize(field);

        Tractor tractor = new Tractor();
        ArrayList<Edible> yield = tractor.harvest(field);

        Assert.assertTrue(100 <= yield.size());

        Assert.assertTrue(500 >= yield.size());

        yield.stream().forEach( fruit -> {
                Assert.assertTrue(fruit instanceof Tomato);
            });
    }
}



