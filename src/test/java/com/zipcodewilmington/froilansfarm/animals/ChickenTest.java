package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Egg;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChickenTest {

    private Chicken chicken;

    @Before
    public void setUp() throws Exception {
        chicken = new Chicken();
    }

    @Test
    public void makeNoise() {
        Assert.assertEquals("Bok bok", chicken.makeNoise());
    }

    @Test
    public void yield() {
        Assert.assertEquals(0, chicken.yield().size());
        chicken.growFood();
        ArrayList<Egg> eggs = chicken.yield();
        Assert.assertTrue(2 <= eggs.size());
        Assert.assertTrue(5 >= eggs.size());
        Assert.assertTrue(eggs.get(0) instanceof Egg);
    }

    @Test
    public void fertilize() {
        chicken.beFertilized();
        Assert.assertEquals(0,chicken.yield().size());
        chicken.growFood();
        Assert.assertEquals(0,chicken.yield().size());
    }
}