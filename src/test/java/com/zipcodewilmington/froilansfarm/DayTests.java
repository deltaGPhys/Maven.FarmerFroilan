package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;



public class DayTests {

    private Farm farm;
    private Farmer froilan;
    private Pilot froilanda;

    @Before
    public void setUp() throws Exception {
        farm = new Farm();
        froilan = new Farmer();
        froilanda = new Pilot();
        farm.setField(new Field());

        for (int i = 0; i<4; i++) {
            farm.addChickenCoop(new ChickenCoop());
        }

        for (int i = 0; i<3; i++) {
            farm.addStable(new Stable());
        }

        farm.addVehicle(new Tractor());
        farm.addVehicle(new Tractor());
        CropDuster cropDuster = new CropDuster();
//        froilanda.fly(cropDuster);
//        farm.addVehicle(cropDuster);
    }


    public void dailyTasks() {
    }

    @Test
    public void Monday() {
    }
}
