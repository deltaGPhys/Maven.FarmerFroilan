package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable{
    //List of Horses
    List<Horse> horseList = new ArrayList<>();

    public void add(Horse horse){
        horseList.add(horse);
    }

    public List<Horse> getHorseList() {
        return horseList;
    }
}
