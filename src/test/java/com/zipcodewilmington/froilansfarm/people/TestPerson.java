package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest(){
        Person person=new Person("");
        String actualName = person.getName();
        String expectedName = "";
        Assert.assertEquals(expectedName,actualName);
    }
    @Test
    public void eatTest(){
        Person person=new Person("");
        Edible edible=new Edible();
        String Expected="Yum!";
        String Actual=person.eat(edible);
        Assert.assertEquals(Expected,Actual);

    }
    @Test
    public void makeNoiseTest(){
        Person person=new Person("");
        String expected="Blah blah blah";
        String actual=person.makeNoise();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void mountTest(){
        Person person=new Person("");

    }

}
