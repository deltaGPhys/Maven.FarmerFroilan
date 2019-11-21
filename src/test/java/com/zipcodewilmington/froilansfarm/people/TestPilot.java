package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class TestPilot {
    @Test
    public void pilotTest1() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Person);
    }

    @Test
    public void pilotTest2() {
        Pilot pilot = new Pilot();
        Assert.assertTrue(pilot instanceof Pilot);
    }

    @Test
    public void getAircraftTest() {
        Pilot pilot = new Pilot();

        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
//        pilot.fly(cropDuster);
//        Aircraft expect = cropDuster;
//        Aircraft actual = pilot.getAircraft();
//        Assert.assertEquals(expect, actual);
    }
}