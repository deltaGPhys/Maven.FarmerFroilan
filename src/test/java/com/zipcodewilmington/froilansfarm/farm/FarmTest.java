package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FarmTest {

    @Test
    public void addStableTest(){
        List<Stable> stableList = new ArrayList<>();
        Stable stable1 = new Stable();
        stableList.add(stable1);

        Boolean expected = stableList.contains(stable1);

        Assert.assertTrue(expected);

    }

    @Test
    public void removeStableTest(){
        List<Stable> stableList = new ArrayList<>();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        stableList.add(stable1);
        stableList.add(stable2);
        stableList.remove(stable1);


        Boolean expected = stableList.contains(stable1);

        Assert.assertFalse(expected);
    }

    @Test
    public void addChickenCoopTest(){
        List<ChickenCoop> coopList = new ArrayList<>();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        coopList.add(chickenCoop1);
        coopList.add(chickenCoop2);

        Boolean expected = coopList.contains(chickenCoop1);

        Assert.assertTrue(expected);
    }

    @Test
    public void removeChickenCoopTest(){
        List<ChickenCoop> coopList = new ArrayList<>();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        coopList.add(chickenCoop1);
        coopList.add(chickenCoop2);
        coopList.remove(chickenCoop1);

        Boolean expected = coopList.contains(chickenCoop1);

        Assert.assertFalse(expected);
    }

    @Test
    public void addVehicleTest(){
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);

        Boolean expected = vehicleList.contains(vehicle1);

        Assert.assertTrue(expected);
    }

    @Test
    public void removeVehicleTest(){
        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.remove(vehicle1);

        Boolean expected = vehicleList.contains(vehicle1);

        Assert.assertFalse(expected);
    }

}
