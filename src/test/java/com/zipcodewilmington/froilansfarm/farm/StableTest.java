package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    @Test
    public void makeStableTest(){
        Stable horseStable = new Stable();
        Assert.assertTrue(horseStable instanceof Stable);
    }

    @Test
    public void addHorseTest(){
        Stable horseStable = new Stable();
        Horse Epona = new Horse();
        horseStable.add(Epona);
        Assert.assertTrue(horseStable.horseList.contains(Epona));
    }
}

