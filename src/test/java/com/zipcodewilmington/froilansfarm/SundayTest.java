package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.farm.*;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void SundayRidesAndFeeding() {
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

    @Test
    public void SundayEating() {
        for (int i = 0; i < 5; i++) {
             Assert.assertEquals("Yum! Fuel for a farmer!",froilan.eat(new Egg()));
        }
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals("Yum! Fuel for a farmer!",froilan.eat(new Tomato()));
            Assert.assertEquals("Yum!",froilanda.eat(new EarCorn()));
        }
        Assert.assertEquals("Yum! Fuel for a farmer!",froilan.eat(new EarCorn()));
        Assert.assertEquals("Yum!",froilanda.eat(new Tomato()));
    }

    @Test
    public void SundayPlanting() {
        field = farm.getField();
        field.getCropRowList().stream().forEach(
                cropRow -> Assert.assertEquals(0,cropRow.getCropList().size())
        );
        froilan.plant(CornStalk.class, field.getCropRowList().get(0));
        Assert.assertEquals(20,field.getCropRowList().get(0).getCropList().size());
        Assert.assertTrue(field.getCropRowList().get(0).getCropList().get(0) instanceof CornStalk);

        froilan.plant(TomatoPlant.class, field.getCropRowList().get(1));
        Assert.assertEquals(20,field.getCropRowList().get(1).getCropList().size());
        Assert.assertTrue(field.getCropRowList().get(1).getCropList().get(0) instanceof TomatoPlant);

        for (int i = 2; i < 5; i++) {
            froilan.plant(Crop.class, field.getCropRowList().get(i));
            Assert.assertEquals(20, field.getCropRowList().get(i).getCropList().size());
            Assert.assertTrue(field.getCropRowList().get(i).getCropList().get(0) instanceof Crop);
        }
    }
}
