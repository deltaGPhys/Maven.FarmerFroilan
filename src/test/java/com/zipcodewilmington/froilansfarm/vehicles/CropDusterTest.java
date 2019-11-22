package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
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
        Assert.assertTrue(cropDuster.fly());
    }

    @Test
    public void  landTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertFalse(cropDuster.land());
    }


    }

