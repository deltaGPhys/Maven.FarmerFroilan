package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

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
    }


