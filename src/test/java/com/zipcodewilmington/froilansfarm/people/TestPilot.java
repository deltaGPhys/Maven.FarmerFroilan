package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.CropDusterTest;
import org.junit.Assert;
import org.junit.Test;

public class TestPilot {
    @Test
    public void pilotTest1() {
        Pilot pilot = new Pilot("");
        Assert.assertTrue(pilot instanceof Person);
    }

    @Test
    public void pilotTest2() {
        Pilot pilot = new Pilot("");
        Assert.assertTrue(pilot instanceof Pilot);
    }

    @Test
    public void getAircraftTest() {
        Pilot pilot = new Pilot("");

        Aircraft cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);

        pilot.fly(cropDuster);
        Aircraft expect = cropDuster;
        Aircraft actual = pilot.getAircraft();
        Assert.assertEquals(expect, actual);
    }
}