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

import java.util.Collection;
import java.util.Random;

public class SundayTest {

    private Farm farm;
    private Farmer froilan;
    private Field field;
    private Pilot froilanda;
    private CropDuster cropDuster;


    @Before
    public void setUp() throws Exception {
        farm = new Farm();
        froilan = new Farmer();
        froilanda = new Pilot();
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
    public void SundayRidesAndFeeding() {
        farm.getStableList().stream()
                .flatMap(stable-> stable.getHorseList().stream())
                .forEach(horse -> {
                    froilan.mount(horse);
                    Assert.assertEquals(horse, froilan.getCurrentRide());
                    froilan.dismount();
                    Assert.assertEquals(null, froilan.getCurrentRide());
                    for (int i = 0; i < 3; i++) {
                        Assert.assertEquals("yum",horse.eat(new EarCorn()));
                    }
                });
    }

    @Test
    public void SundayEating() {
        for (int i = 0; i < 5; i++) {
             Assert.assertEquals("yum",froilan.eat(new Egg()));
        }
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals("yum",froilan.eat(new Tomato()));
            Assert.assertEquals("yum",froilanda.eat(new EarCorn()));
        }
        Assert.assertEquals("yum",froilan.eat(new EarCorn()));
        Assert.assertEquals("yum",froilanda.eat(new Tomato()));
    }
    

    @Test
    public void SundayPlanting() {
    }
}
