package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import java.util.ArrayList;

public class FarmHouseTest {

    @Test
    public void addPersonTest(){
        List<Person> personList = new ArrayList<Person>();
        Person kyle = new Person("Kyle");
        personList.add(kyle);

        Boolean expected = personList.contains(kyle);

        Assert.assertTrue(expected);
    }

    @Test
    public void addPersonTest2(){
        List<Person> personList = new ArrayList<Person>();
        Person kate = new Person("Kate");
        personList.add(kate);

        Boolean expected = personList.contains(kate);

        Assert.assertTrue(expected);
    }

    @Test
    public void removePersonTest1(){
        List<Person> personList = new ArrayList<Person>();
        Person kate = new Person("Kate");
        Person kendall = new Person("Kendall");
        personList.add(kate);
        personList.add(kendall);
        personList.remove(kate);


        Boolean expected = personList.contains(kate);

        Assert.assertFalse(expected);
    }

    @Test
    public void removePersonTest2(){
        List<Person> personList = new ArrayList<Person>();
        Person kyle = new Person("Kyle");
        Person chad = new Person("Chad");
        personList.add(kyle);
        personList.add(chad);
        personList.remove(kyle);

        Boolean expected = personList.contains(kyle);

        Assert.assertFalse(expected);
    }

}
