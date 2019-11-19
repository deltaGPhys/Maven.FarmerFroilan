package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
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
}
