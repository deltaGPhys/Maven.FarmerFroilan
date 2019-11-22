package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    private Animal animal;

    @Before
    public void setUp() throws Exception {
        animal = new Animal();
    }

    @Test
    public void makeNoise() {
        Assert.assertEquals("<noise>", animal.makeNoise());
    }

    @Test
    public void eat() {
        Assert.assertEquals("<yum>", animal.eat(new Tomato()));
    }
}