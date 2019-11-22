package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    //List of Chickens
    List<Chicken> chickenList = new ArrayList<>();

    public void add(Chicken chicken){
        chickenList.add(chicken);
    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }

    public void dailyEgg(){
        for (Chicken c : chickenList){
            c.growFood();
        }
    }
}
