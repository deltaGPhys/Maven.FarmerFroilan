package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Field;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class WednesdayTest {

    private Farm farm;
    private Farmer froilan;
    private Pilot froilanda;
    private Stable stable;
    private Horse horse;
    private EarCorn corn;

    @Before
    public void setUp() throws Exception {
        farm = new Farm();
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
        Field farmField = new Field();
        farm.setField(farmField);

        ChickenCoop cc1 = new ChickenCoop();
        ChickenCoop cc2 = new ChickenCoop();
        ChickenCoop cc3 = new ChickenCoop();
        ChickenCoop cc4 = new ChickenCoop();

        farm.addChickenCoop(cc1);
        farm.addChickenCoop(cc2);
        farm.addChickenCoop(cc3);
        farm.addChickenCoop(cc4);

        int i = 0;
        while (i < 15) {
            cc1.add(new Chicken());
            cc2.add(new Chicken());
            cc3.add(new Chicken());
            cc4.add(new Chicken());
            i++;
        }

        Stable s1 = new Stable();
        Stable s2 = new Stable();
        Stable s3 = new Stable();

        farm.addStable(s1);
        farm.addStable(s2);
        farm.addStable(s3);


        i = 0;
        while (i < 10) {
            s1.add(new Horse());
            s2.add(new Horse());
            s3.add(new Horse());
            i++;
        }

        farm.addVehicle(new Tractor());
        farm.addVehicle(new Tractor());
        CropDuster cropDuster = new CropDuster();
        froilanda.fly(cropDuster);
        farm.addVehicle(cropDuster);
    }

    @Test
    public void wednesdayEatingTestFroilan() {
        ArrayList<String> froilanBreakfast = new ArrayList<>();
        froilanBreakfast.add(froilan.eat(new Egg()));
        froilanBreakfast.add(froilan.eat(new Egg()));
        froilanBreakfast.add(froilan.eat(new Egg()));
        froilanBreakfast.add(froilan.eat(new Egg()));
        froilanBreakfast.add(froilan.eat(new Egg()));

        froilanBreakfast.add(froilan.eat(new EarCorn()));

        froilanBreakfast.add(froilan.eat(new Tomato()));
        froilanBreakfast.add(froilan.eat(new Tomato()));


        Assert.assertEquals(8, froilanBreakfast.size());
    }

    @Test
    public void wednesdayEatingTestFroilanda() {
        ArrayList<String> froilandaBreakfast = new ArrayList<>();
        froilandaBreakfast.add(froilanda.eat(new Egg()));
        froilandaBreakfast.add(froilanda.eat(new Egg()));
        ;

        froilandaBreakfast.add(froilan.eat(new EarCorn()));
        froilandaBreakfast.add(froilan.eat(new EarCorn()));

        froilandaBreakfast.add(froilan.eat(new Tomato()));

        Assert.assertEquals(5, froilandaBreakfast.size());
    }

    @Test
    public void wednesdayRidingTest() {

        for (Stable stable : farm.getStableList()) {
            froilan.mount(horse);
            froilan.dismount();
        }
        Assert.assertEquals(horse, froilan.getRidingDevice());
    }

    @Test
    public void wednesdayEatingTest() {
        ArrayList<String> horseBreakfast = new ArrayList<>();

        for (Horse horse : stable.getHorseList()) {
            horseBreakfast.add(horse.eat(corn));
            horseBreakfast.add(horse.eat(corn));
            horseBreakfast.add(horse.eat(corn));
        }

        Assert.assertEquals(30, horseBreakfast.size());
    }

}
