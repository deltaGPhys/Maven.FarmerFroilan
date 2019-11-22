package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.people.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {

    private List<Person> personList;

    public FarmHouse() {
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person){
        personList.add(person);
    }

    public List<Person> getPersonList(){
        return personList;
    }
}
