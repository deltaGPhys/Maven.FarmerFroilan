package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void fieldTest(){
        Field field = new Field();
        Assert.assertTrue(field instanceof Field);
    }
}
