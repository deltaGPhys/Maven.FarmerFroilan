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
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MondayTest {

    private Farm farm;
    private Farmer froilan;
    private Field field;
    private Pilot froilanda;
    private CropDuster cropDuster;
    private boolean ;


    @Before
    public void setUp() throws Exception {
        farm = new Farm();
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
        field = new Field();
        farm.setField(field);

        for (int i = 0; i<4; i++) {
            farm.addChickenCoop(new ChickenCoop());
        }

        int i = 0;
        while (i < 15) {
            farm.getCoopList().get(new Random().nextInt(3)).add(new Chicken());
            i++;
        }

        for (i = 0; i<3; i++) {
            farm.addStable(new Stable());
        }

        i = 0;
        while (i < 10) {
            farm.getStableList().get(new Random().nextInt(3)).add(new Horse());
            i++;
        }

        farm.addVehicle(new Tractor());
        farm.addVehicle(new Tractor());
        cropDuster = new CropDuster();
        froilanda.fly(cropDuster);
        farm.addVehicle(cropDuster);
    }

    @Test
    public void setUpTest() {
        Assert.assertEquals(3,farm.getVehicleList().size());
        long numTractors = farm.getVehicleList().stream().filter(x-> x instanceof Tractor).count();
        Assert.assertEquals(2,numTractors);
        long numPlanes = farm.getVehicleList().stream().filter(x-> x instanceof CropDuster).count();
        Assert.assertEquals(1,numPlanes);

        Assert.assertEquals(cropDuster,froilanda.getAircraft());

        Assert.assertEquals(field, farm.getField());

        int horses = farm.getStableList().stream().mapToInt(x -> x.getHorseList().size()).sum();
        Assert.assertEquals(10,horses);

        int chickens = farm.getCoopList().stream().mapToInt(x -> x.getChickenList().size()).sum();
        Assert.assertEquals(15,chickens);
    }

    @Test
    public void mondayBreakfastTest() {

        froilan.eat(new EarCorn());
        froilanda.eat(new Tomato());
        for (int i = 0; i <2 ; i++) {
            froilan.eat(new Tomato());
            froilanda.eat(new EarCorn());
            froilanda.eat(new Egg());
        }

        for (int i = 0; i <5 ; i++) {
            froilan.eat(new Egg());
        }

    }

    // check / rewrite // currently null
    @Test
    public void mondayRidingTest() throws Exception{
        setUp();
        List<Stable> stableList = farm.getStableList();


        for(int i=0; i < stableList.size();i++){
            for(int j = 0; j < stableList.get(i).getHorseList().size();j++){
                Horse currentHorse = stableList.get(i).getHorseList().get(j);
                froilan.mount(currentHorse);
                Assert.assertEquals(currentHorse, froilan.getRidingDevice());
                froilan.dismount();

                //May not need these **
//                froilanda.mount(currentHorse);
//                froilanda.dismount();

                for (int k = 0; k < 3 ; k++) {
                    currentHorse.eat(new EarCorn());
                }
            }
        }

    }
    // finish
    // On Monday, his sister, Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
    @Test
    public void mondayCropDusting(){
        froilanda.mount(new CropDuster());
        cropDuster.fly(field);
    }
}
