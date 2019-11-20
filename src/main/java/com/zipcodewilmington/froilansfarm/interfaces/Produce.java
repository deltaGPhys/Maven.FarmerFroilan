package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.edibles.Edible;

import java.util.ArrayList;

public interface Produce<E extends Edible> {

    ArrayList<E> yield();

    void growFood();

    void beFertilized();
}
