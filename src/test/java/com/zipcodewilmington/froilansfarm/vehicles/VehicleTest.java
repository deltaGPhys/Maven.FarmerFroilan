package com.zipcodewilmington.froilansfarm.vehicles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    @Test
    public void makeNoise() {
        Vehicle vehicle = new Vehicle();
        Assert.assertEquals("<clank>",vehicle.makeNoise());
    }
}