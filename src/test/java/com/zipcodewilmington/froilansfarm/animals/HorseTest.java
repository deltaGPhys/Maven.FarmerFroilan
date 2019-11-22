package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Egg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    private Horse horse;

    @Before
    public void setUp() throws Exception {
        horse = new Horse();
    }

    @Test
    public void makeNoise() {
        Assert.assertEquals("Neigh!", horse.makeNoise());
    }

    @Test
    public void eat() {
        Assert.assertEquals("Yum! Corn! I'm a happy horse yeehaw!", horse.eat(new Egg()));
    }
}