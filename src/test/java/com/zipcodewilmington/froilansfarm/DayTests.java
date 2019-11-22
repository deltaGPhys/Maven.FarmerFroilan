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
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;


public class DayTests {

    private Farm farm;
    private Farmer froilan;
    private Field field;
    private Pilot froilanda;
    private CropDuster cropDuster;
    private FarmHouse farmHouse;
    private Tractor t1,t2;


    @Before
    public void setUp() throws Exception {
        farm = new Farm();
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
        field = new Field();
        farm.setField(field);
        farmHouse = new FarmHouse();
        farm.setFarmHouse(farmHouse);
        farmHouse.add(froilan);
        farmHouse.add(froilanda);

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

        t1 = new Tractor();
        t1.operate(farm);
        farm.addVehicle(t1);
        t2 = new Tractor();
        t2.operate(farm);
        farm.addVehicle(t2);
        cropDuster = new CropDuster();
        froilanda.fly(cropDuster);
        farm.addVehicle(cropDuster);
    }

    @Test
    public void setUpTest() {
        Assert.assertEquals("Early to bed, early to rise...", froilan.makeNoise());
        Assert.assertEquals("Pilot goes whoosh!", froilanda.makeNoise());

        Assert.assertEquals(3,farm.getVehicleList().size());
        long numTractors = farm.getVehicleList().stream().filter(x-> x instanceof Tractor).count();
        Assert.assertEquals(2,numTractors);
        long numPlanes = farm.getVehicleList().stream().filter(x-> x instanceof CropDuster).count();
        Assert.assertEquals(farm,t1.getFarm());
        Assert.assertEquals(farm,t2.getFarm());
        Assert.assertEquals(1,numPlanes);

        Assert.assertEquals(cropDuster,froilanda.getAircraft());
        froilanda.stopFlying();
        Assert.assertNull(froilanda.getAircraft());

        Assert.assertEquals(field, farm.getField());
        Assert.assertEquals(farmHouse, farm.getFarmHouse());
        Assert.assertTrue(farmHouse.getPersonList().contains(froilan));
        Assert.assertTrue(farmHouse.getPersonList().contains(froilanda));

        int horses = farm.getStableList().stream().mapToInt(x -> x.getHorseList().size()).sum();
        Assert.assertEquals(10,horses);

        int chickens = farm.getCoopList().stream().mapToInt(x -> x.getChickenList().size()).sum();
        Assert.assertEquals(15,chickens);
    }

    @Test
    public void sundayTest() {
        allSunday();
    }

    public void allSunday() {
        dailyRidesAndFeeding();
        dailyEating();
        sundayPlanting();
    }

    @Test
    public void dailyRidesAndFeedingTest() {
        dailyRidesAndFeeding();
    }

    public void dailyRidesAndFeeding() {
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
        froilan.mount(new Horse());
    }

    @Test
    public void dailyEatingTest() {
        dailyEating();
    }

    public void dailyEating() {
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
    public void sundayPlantingTest() {
        sundayPlanting();
    }

    public void sundayPlanting() {
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

    @Test
    public void mondayTest() {
        allSunday();
        allMonday();
    }

    public void allMonday() {
        dailyRidesAndFeeding();
        dailyEating();
        mondayCropDusting();
    }

    @Test
    public void mondayCropDustingTest() {
        sundayPlanting();
        froilanda.mount(new CropDuster());
        for (int i = 0; i < field.getCropRowList().size() ; i++) {
            CropRow currentRow = field.getCropRowList().get(i);
            cropDuster.fly();
            Assert.assertTrue(cropDuster.isFlying());
            cropDuster.fertilize(field);
            Crop currentCrop = (Crop) currentRow.getCropList().get(i);
            Assert.assertTrue(currentCrop.getHasBeenFertilized());
        }
    }

    public void mondayCropDusting(){
        froilanda.mount(new CropDuster());
        for (int i = 0; i < field.getCropRowList().size() ; i++) {
            CropRow currentRow = field.getCropRowList().get(i);
            cropDuster.fly();
            Assert.assertTrue(cropDuster.isFlying());
            cropDuster.fertilize(field);
            Crop currentCrop = (Crop) currentRow.getCropList().get(i);
            Assert.assertTrue(currentCrop.getHasBeenFertilized());

        }
    }

    @Test
    public void tuesdayTest() {
        allSunday();
        allMonday();
        allTuesday();
    }

    public void allTuesday() {
        dailyRidesAndFeeding();
        tuesdayEatingFroilan();
        tuesdayEatingFroilanda();
        tuesdayHarvest();
    }


    @Test
    public void tuesdayEatingFroilanTest() {
        tuesdayEatingFroilan();
    }

    public void tuesdayEatingFroilan(){
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
    public void tuesdayEatingFroilandaTest() {
        tuesdayEatingFroilanda();
    }

    public void tuesdayEatingFroilanda(){
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
    public void tuesdayHarvestTest() {
        sundayPlanting();
        mondayCropDusting();
        tuesdayHarvest();
    }

    public void tuesdayHarvest(){
        froilan.mount(farm.getVehicleList().get(1));
        froilan.getTractor().harvest(field);
        Assert.assertEquals(null,field.getCropRowList() );
    }

    @Test
    public void wednesdayTest() {

    }

    @Test
    public void thursdayTest() {

    }

    @Test
    public void fridayTest() {

    }

    @Test
    public void saturdayTest() {

    }
}
