package com.zipcodewilmington.froilansfarm.farm;

import org.junit.Assert;
import org.junit.Test;

public class Field {

    @Test

    public void FieldTest(){
        Field field = new Field();
        Assert.assertTrue(field instanceof Field);
    }
}
