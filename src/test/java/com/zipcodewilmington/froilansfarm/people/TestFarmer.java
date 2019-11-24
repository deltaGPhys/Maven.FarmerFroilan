package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TestFarmer {
    @Test
    public void farmerTest1() {
        Botanist farmer2 = new Farmer("Jim");
        Farmer farmer = new Farmer("Jam");
        Assert.assertTrue(farmer instanceof Person);
        Assert.assertTrue(farmer2 instanceof Botanist);
        Assert.assertTrue(farmer instanceof Botanist);
    }
    @Test
    public void farmerTest2() {
        Farmer farmer = new Farmer("Jam");
        Assert.assertTrue(farmer instanceof Farmer);
    }
    @Test
    public void getTractorTest(){
        Farmer farmer=new Farmer("Jom");
        Tractor tractor=new Tractor();
        farmer.mount(tractor);
        Tractor expect=tractor;
        Tractor actual=(Tractor) farmer.getRidingDevice();
        Assert.assertEquals(expect,actual);
    }



}
