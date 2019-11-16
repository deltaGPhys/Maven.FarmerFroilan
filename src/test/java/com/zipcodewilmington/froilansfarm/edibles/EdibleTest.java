package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdibleTest {

    @Test
    public void edibleTest() {
        Edible edible = new Edible();
        Assert.assertTrue(edible instanceof Edible);
    }

    @Test
    public void eggTest() {
        Egg egg = new Egg();
        Assert.assertTrue(egg instanceof Egg);
        Assert.assertTrue(egg instanceof Edible);
    }

    @Test
    public void earCornTest() {
        EarCorn earCorn = new EarCorn();
        Assert.assertTrue(earCorn instanceof EarCorn);
        Assert.assertTrue(earCorn instanceof Edible);
    }

    @Test
    public void tomatoTest() {
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Tomato);
        Assert.assertTrue(tomato instanceof Edible);
    }
}