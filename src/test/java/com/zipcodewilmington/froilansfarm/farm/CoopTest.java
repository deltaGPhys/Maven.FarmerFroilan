package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

public class CoopTest {

    @Test
    public void coopTest() {
        ChickenCoop coop = new ChickenCoop();
        Assert.assertTrue(coop instanceof ChickenCoop);
    }

    @Test
    public void addTest(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chickenLittle = new Chicken();
        coop.add(chickenLittle);
        Assert.assertTrue(coop.getChickenList().contains(chickenLittle));
    }
    @Test
    public void dailyEggTest(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chickenBig = new Chicken();
        coop.add(chickenBig);
        coop.dailyEgg();
        Assert.assertEquals(1, chickenBig.yield().size());

    }
}