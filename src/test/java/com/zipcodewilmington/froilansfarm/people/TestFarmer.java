package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class TestFarmer {
    @Test
    public void farmerTest1() {
        Botanist farmer2 = new Farmer();
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Person);
        Assert.assertTrue(farmer2 instanceof Botanist);
        Assert.assertTrue(farmer instanceof Botanist);
    }
    @Test
    public void farmerTest2() {
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Farmer);
    }
    @Test
    public void getTractorTest(){
        Farmer farmer=new Farmer();
        Tractor tractor=new Tractor();
        farmer.setTractor(tractor);
        Tractor expect=tractor;
        Tractor actual=farmer.getTractor();
        Assert.assertEquals(expect,actual);
    }



}
