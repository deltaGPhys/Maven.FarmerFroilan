package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.edibles.GenericFruit;
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

public class TuesdayTest {

    private Farm farm;
    private Farmer froilan;
    private Field farmField;
    private Pilot froilanda;
    private CropDuster cropDuster;

    @Before
    public void setUp() throws Exception {
        farm = new Farm();
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
        farmField = new Field();
        farm.setField(farmField);


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
    public void tuesdayEatingTestFroilan(){
        ArrayList<String> froilansFull = new ArrayList<>();
        for (int i = 1 ; i <= 5 ; i++ ){
            froilansFull.add(froilan.eat(new Egg())) ;
        }
           froilansFull.add(froilan.eat(new EarCorn()));
        for (int i = 1; i <=2 ; i++){
           froilansFull.add(froilan.eat(new Tomato()));
        }
        Assert.assertEquals(8, froilansFull.size());
    }

    @Test
    public void tuesdayEatingTestFroilanda(){
        ArrayList<String> froilandasFull = new ArrayList<>();
        for (int i = 1 ; i <= 2 ; i++ ){
            froilandasFull.add(froilan.eat(new Egg())) ;
        }
        froilandasFull.add(froilan.eat(new Tomato()));
        for (int i = 1; i <=2 ; i++){
            froilandasFull.add(froilan.eat(new EarCorn()));
        }
        Assert.assertEquals(5, froilandasFull.size());
    }

    @Test
    public void tuesdayHarvest(){
        froilan.mount(farm.getVehicleList().get(1));
        farm.getVehicleList().get(1);
        froilan.getTractor().harvest(farm.getField());
        Assert.assertEquals(null,farmField.getCropRowList() );
    }


    @Test
    public void tuesdayRidesAndFeeding() {
        farm.getStableList().stream()
                .flatMap(stable-> stable.getHorseList().stream())
                .forEach(horse -> {
                    froilan.mount(horse);
                    Assert.assertEquals(horse, froilan.getRidingDevice());
                    froilan.dismount();
                    Assert.assertEquals(null, froilan.getRidingDevice());
                    for (int i = 0; i < 3; i++) {
                        Assert.assertEquals("Yum! Corn! I'm a happy horse yeehaw!",horse.eat(new EarCorn()));
                    }
                });
    }

}

